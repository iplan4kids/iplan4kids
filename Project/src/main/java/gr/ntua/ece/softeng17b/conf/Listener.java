package gr.ntua.ece.softeng17b.conf;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.FileReader;
import java.util.Properties;

@WebListener
@EnableTransactionManagement
public class Listener implements ServletContextListener {

    Configuration conf;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {


            ServletContext ctx = servletContextEvent.getServletContext();

            Properties props = new Properties();

            String pathToPropertiesInWebApp = ctx.getInitParameter("properties");
            String pathToPropertiesInFileSystem = ctx.getRealPath(pathToPropertiesInWebApp);

            props.load(new FileReader(pathToPropertiesInFileSystem));
            WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(ctx);
            conf = (Configuration) springContext.getBean("conf");
            if(conf == null){
                System.out.println("tou gamietai to spiti");
            }
            //conf.setup(ctx.getContextPath(), props);
        }
        catch(Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }



    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        conf.shutdown();
    }

}