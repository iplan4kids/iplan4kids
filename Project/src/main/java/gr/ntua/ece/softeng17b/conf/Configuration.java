package gr.ntua.ece.softeng17b.conf;

import gr.ntua.ece.softeng17b.data.DataAccess;
import gr.ntua.ece.softeng17b.data.EncryptionUtils;
import gr.ntua.ece.softeng17b.data.Elastic;
import gr.ntua.ece.softeng17b.services.CreateEventService;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;
import java.util.Set;

@Component
@EnableTransactionManagement(proxyTargetClass=true)
public class Configuration {

    //private static final Configuration self = new Configuration();

    private String contextPath = null;
    //private Properties props = new Properties();
    @Autowired
    private DataAccess dataAccess;

    private EncryptionUtils encrypter = new EncryptionUtils();

    private Configuration() {

    }

    /*void setup(String contextPath, Properties props) throws ConfigurationException{
        this.contextPath = contextPath;
        this.props = props;
        try {

            Elastic elastic = new Elastic();
            String port = getProperty("es.port");
            elastic.setup(
                    getProperty("es.host"),
                    Integer.valueOf(port),
                    getProperty("es.index")
            );

            dataAccess.setup(
                    getProperty("db.driver"),
                    getProperty("db.url"),
                    getProperty("db.user"),
                    getProperty("db.pass"),
                    elastic
            );
        }
        catch(Exception e) {
            throw new ConfigurationException(e.getMessage(), e);
        }
    }*/

    public String getContextPath() {
        return contextPath;
    }

    /*public String getProperty(String name) {
        return getProperty(name, null);
    }

    public String getProperty(String name, String defaultValue) {
        return props.getProperty(name, defaultValue);
    }

    public Set<String> propertyNames() {
        return props.stringPropertyNames();
    }*/

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public EncryptionUtils getEncrypter() {
        return encrypter;
}

    void shutdown() {
        dataAccess.shutdown();
    }


    //------------------------BEANS----------------------//



    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(basicDataSource());
    }

    @Bean
    public BasicDataSource basicDataSource() {

        final int MAX_TOTAL_CONNECTIONS = 16;
        final int MAX_IDLE_CONNECTIONS = 8;

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("org.postgresql.Driver");
        basicDataSource.setUrl("jdbc:postgresql://localhost:5432/iplan4kidz_18a?useUnicode=true&characterEncoding=utf-8&amp;autoReconnect=true");
        basicDataSource.setMaxTotal(MAX_TOTAL_CONNECTIONS);
        basicDataSource.setMaxIdle(MAX_IDLE_CONNECTIONS);
        basicDataSource.setUsername("dataadmin");
        basicDataSource.setPassword("softeng_2018");
        basicDataSource.setValidationQuery("SELECT 1");
        basicDataSource.setTestOnBorrow(true);
        basicDataSource.setDefaultAutoCommit(true);
        return basicDataSource ;
    }

    /*@Bean
    public Elastic elastic(){
        Elastic elastic = new Elastic();
        String port = getProperty("es.port");
        System.out.println(port);
        elastic.setup(
                getProperty("es.host"),
                Integer.valueOf(port),
                getProperty("es.index")
        );
        return elastic;
    }
    */

    @Bean
    public DataAccess dataAccess() {
        // configure and return a class having @Transactional methods
        return new DataAccess(basicDataSource());
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(basicDataSource());
    }

    @Bean
    public CreateEventService ceService(){
        return new CreateEventService();
    }

    @Bean
    public Configuration conf(){
        return new Configuration();
    }

    @Bean
    public Elastic elastic(){
        Elastic elastic = new Elastic();
        elastic.setup("softeng",client());
        return elastic;
    }

    @Bean
    public RestHighLevelClient client(){
        return new RestHighLevelClient(
                RestClient.builder(
                        httphost()
                ));
    }

    @Bean
    public HttpHost httphost(){
        return new HttpHost("localhost",9200,"http");
    }

}
