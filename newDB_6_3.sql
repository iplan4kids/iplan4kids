--
-- PostgreSQL database dump
--

-- Dumped from database version 10.1
-- Dumped by pg_dump version 10.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: admins; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE admins (
    admin_id integer NOT NULL,
    username character varying(50) NOT NULL,
    password character varying(60) NOT NULL,
    first_name character varying(100) NOT NULL,
    last_name character varying(100) NOT NULL,
    email character varying(355) NOT NULL,
    phone character varying(10) NOT NULL
);


--
-- Name: admins_admin_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE admins_admin_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- Name: admins_admin_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE admins_admin_id_seq OWNED BY admins.admin_id;


--
-- Name: clients; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE clients (
    user_id integer NOT NULL,
    username character varying(50) NOT NULL,
    password character varying(60) NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    postal_code character varying(50) NOT NULL,
    phone character varying(10) NOT NULL,
    city character varying(50) NOT NULL,
    address character varying(50) NOT NULL,
    address_num character varying(4) NOT NULL,
    email character varying(355) NOT NULL,
    long double precision,
    lat double precision,
    disabled boolean,
    blocked boolean
);


--
-- Name: clients_user_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE clients_user_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- Name: clients_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE clients_user_id_seq OWNED BY clients.user_id;


--
-- Name: events; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE events (
    prov_id integer NOT NULL,
    event_id integer NOT NULL,
    name character varying(100) NOT NULL,
    date timestamp without time zone NOT NULL,
    tickets integer NOT NULL,
    price numeric(1000,2) NOT NULL,
    description character varying(5000),
    tags character varying(1000),
    images character varying(5000),
    long double precision,
    lat double precision,
    duration integer
);


--
-- Name: events_event_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE events_event_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- Name: events_event_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE events_event_id_seq OWNED BY events.event_id;


--
-- Name: providers; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE providers (
    prov_id integer NOT NULL,
    username character varying(50) NOT NULL,
    password character varying(60) NOT NULL,
    full_name character varying(100) NOT NULL,
    afm character varying(9) NOT NULL,
    iban character varying(23) NOT NULL,
    m_first_name character varying(50) NOT NULL,
    m_last_name character varying(50) NOT NULL,
    m_phone character varying(10) NOT NULL,
    phone character varying(10) NOT NULL,
    postal_code character varying(50) NOT NULL,
    address character varying(50) NOT NULL,
    address_num character varying(4) NOT NULL,
    city character varying(50) NOT NULL,
    email character varying(355) NOT NULL,
    subscription timestamp without time zone,
    long double precision,
    lat double precision,
    disabled boolean,
    blocked boolean
);


--
-- Name: providers_prov_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE providers_prov_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- Name: providers_prov_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE providers_prov_id_seq OWNED BY providers.prov_id;


--
-- Name: wallet; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE wallet (
    user_id integer NOT NULL,
    balance numeric(1000,2) NOT NULL
);


--
-- Name: admins admin_id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY admins ALTER COLUMN admin_id SET DEFAULT nextval('admins_admin_id_seq'::regclass);


--
-- Name: clients user_id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY clients ALTER COLUMN user_id SET DEFAULT nextval('clients_user_id_seq'::regclass);


--
-- Name: events event_id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY events ALTER COLUMN event_id SET DEFAULT nextval('events_event_id_seq'::regclass);


--
-- Name: providers prov_id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY providers ALTER COLUMN prov_id SET DEFAULT nextval('providers_prov_id_seq'::regclass);


--
-- Data for Name: admins; Type: TABLE DATA; Schema: public; Owner: -
--

COPY admins (admin_id, username, password, first_name, last_name, email, phone) FROM stdin;
1	admin1	$2a$10$RydtqECH2gpbKk/vxlopDeGIXmMd3w.VikpBgVt8zXYUo1sSWlmRG	Vasilis	Kavardinas	v.kavardinas@gmail.com	6975757575
2	admin2	$2a$10$1VunkK0oH6c6BOxLKdhUv.RYGshXV4uL9A3WWh0ffo2SfolwNcGQ2	Thomas	Tsapralis	thomastsapralis@yahoo.gr	6945454545
\.


--
-- Data for Name: clients; Type: TABLE DATA; Schema: public; Owner: -
--

COPY clients (user_id, username, password, first_name, last_name, postal_code, phone, city, address, address_num, email, long, lat, disabled, blocked) FROM stdin;
1	tester	123456	George	Siachamis	17456	6974562211	Alimos	Thasou	145	hec@gmail.com	\N	\N	\N	\N
4	jorgeSia	$2a$10$j54zDWIzXBNwjghOfkIyI.vDEydiBaatqO3xJGqyJryF8olH/RBeO	George	Siachamis	17456	2109960557	Alimos	Thessalias	33	georgedrfsia@gmail.com	\N	\N	\N	\N
5	BarbaBrill	$2a$10$RydtqECH2gpbKk/vxlopDeGIXmMd3w.VikpBgVt8zXYUo1sSWlmRG	Bill	Brill	17456	6975757575	Attikh	kkik	33	brill.bill@gmail.com	\N	\N	\N	\N
6	TomAndJerry	$2a$10$HiW5JQUpoMCN4jX/ZO6SzOvGg.cjPcmHnrEy3MAC2n/DRZHDXLYbS	Θωμάς	Τσαπραλής	13675	2109856231	Αχαρνές	Αλίμου	10	thom.tsap@outlook.gr	\N	\N	\N	\N
\.


--
-- Data for Name: events; Type: TABLE DATA; Schema: public; Owner: -
--

COPY events (prov_id, event_id, name, date, tickets, price, description, tags, images, long, lat, duration) FROM stdin;
5	1	Βόλτα στα Μελίσσια	2018-03-15 09:20:00	30	10.00	Πεζοπορία, πάρκα, φύση	sports , other , 	\N	23.8511922000000141	38.0638580999999974	\N
5	2	Βόλτα στα Μελίσσια	2018-03-15 09:20:00	30	10.00	Πεζοπορία, πάρκα, φύση	sports , other , 	\N	23.8511922000000141	38.0638580999999974	60
5	3	Βόλτα στα Μελίσσια	2018-03-16 09:20:00	30	10.00	φύση, παιχνίδια, πάρκα, κοινωνία	sports , other , 	\N	23.8511922000000141	38.0638580999999974	60
5	4	Βόλτα στα Μελίσσια	2018-03-17 09:20:00	30	10.00	Πεζοπορία, φύση, πάρκα, παιχνίδια	sports , other , 	\N	23.8511922000000141	38.0638580999999974	60
5	5	Βόλτα στα Μελίσσια	2018-03-16 09:15:00	30	10.00	Πεζοπορία, παιχνίδια, φύση, πάρκα	sports , other , 	\N	23.8511922000000141	38.0638580999999974	60
5	6	Βόλτα στα Μελίσσια	2018-03-16 10:30:00	30	15.00	φύση, παιχνίδια, πάρκα, κοινωνία	sports , other , 	\N	23.8511922000000141	38.0638580999999974	60
5	7	Βόλτα στα Μελίσσια	2018-03-15 10:30:00	30	10.00	Πεζοπορία, παιδιά, φύση, παιχνίδια, πάρκα	sports , other , 	\N	23.8511922000000141	38.0638580999999974	60
5	8	Γυμναστική στην πόλη	2018-04-06 08:15:00	15	6.00	Δεν περιγράφω άλλο...	sports , other , 	\N	23.7396532000000207	37.9274944000000005	120
5	9	loldkf	2018-03-13 11:50:00	10	3.00	farbystsvec	theatre , music , 	\N	23.7531930000000102	38.0554245999999878	67
5	10	Χορεύοντας στο πάρκο	2018-03-13 20:30:00	30	5.00	Χορευτική παράσταση για παιδιά με θέματα από διάφορα παραμύθια.	sports , theatre , other , 	\N	23.7402511999999888	37.9229746000000034	120
5	11	Κάτι καλό	2018-03-15 20:30:00	15	20.00	Χορός,τραγούδια, μουσική	music , other , 	\N	23.7194196000000375	37.9062475000000134	60
5	12	Epic motivational	2018-03-22 23:50:00	42	11.00	Χορός, τραγούδι, μουσική	music , other , 	\N	23.650519499999973	37.9565123	60
5	13	Epic motivational	2018-03-17 08:00:00	21	30.00	Χορός, τραγούδι μουσική	music , other , 	\N	23.7294211999999334	38.0547979999999981	60
5	14	Κάτι καλό	2018-03-20 10:40:00	16	8.00	Ζωγραφική για παιδιά, εκμάθηση τεχνικών και τεχνοτροπιών	workshop , other , 	\N	23.6492852000000084	37.9760443999999993	60
\.


--
-- Data for Name: providers; Type: TABLE DATA; Schema: public; Owner: -
--

COPY providers (prov_id, username, password, full_name, afm, iban, m_first_name, m_last_name, m_phone, phone, postal_code, address, address_num, city, email, subscription, long, lat, disabled, blocked) FROM stdin;
2	codac4win	$2a$10$1VunkK0oH6c6BOxLKdhUv.RYGshXV4uL9A3WWh0ffo2SfolwNcGQ2	Codac	123456789	12345678912345678912345	jim	bam	6987745447	2103695455	17456	terpsis	10	Los Alimos	jim.bam@gmail.com	\N	\N	\N	\N	\N
3	kouklos	$2a$10$S9/jrHZd9Nsy9HNQMryihepam/jCl23Z9eR07m5w4b1VPfADeyx4O	Κουκλοθέατρο Ε.Π.Ε.	124569783	12345678912345678912345	Μάρκος	Ιωαννίδης	6973225588	2109758468	26223	Κορίνθου	105	Πάτρα	koyklo@gmail.com	2018-03-01 02:07:35.926	\N	\N	\N	\N
4	nionios	$2a$10$i1CIsQiOxtV0Y1wIC2ruPOIGXEbiZyX7iW.SfHEubSBj8Gb/tu.Gm	Καραγκιόζης	124569783	12345678912345678912345	Δημήτρης	Σπαθάς	6973225588	2109758468	11523	Λεωφόρος Κηφισίας	25	Αθήνα	karagiozo@gmail.com	2018-03-01 02:23:03.906	\N	\N	\N	\N
5	BeesFun	$2a$10$XzHzDtdQXqqkyRJ9itOkG.Bj4etU5aDT/nkqb6TWb43KNSgVo3N2m	Χαρούμενο Μελίσσι	147258369	12345678912345678912345	Κατερίνα	Χαλκιά	6945870011	2115846789	17456	Πλατεία Εκτελωνιστών	10	Άλιμος	melissi.chara@yahoo.gr	2019-02-02 17:34:35.301	\N	\N	\N	\N
6	SpringTh	$2a$10$u6wyAv8Scb4A3LFgdS0raeUBl10Mfqfc1c.x7IalecsRHz5SLd2mm	Θέατρο Άνοιξη Α.Ε.	134567783	12345678912345678912345	Αλέξης	Μητρόπουλος	6933024655	2114532899	11473	Λεωφόρος Αλεξάνδρας	33	Αθήνα	spring.theatre@yahoo.gr	2018-03-03 02:07:53.652	\N	\N	\N	\N
\.


--
-- Data for Name: wallet; Type: TABLE DATA; Schema: public; Owner: -
--

COPY wallet (user_id, balance) FROM stdin;
1	0.00
4	0.00
6	0.00
5	290.00
\.


--
-- Name: admins_admin_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('admins_admin_id_seq', 2, true);


--
-- Name: clients_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('clients_user_id_seq', 6, true);


--
-- Name: events_event_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('events_event_id_seq', 14, true);


--
-- Name: providers_prov_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('providers_prov_id_seq', 6, true);


--
-- Name: admins admins_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY admins
    ADD CONSTRAINT admins_pkey PRIMARY KEY (admin_id);


--
-- Name: clients clients_email_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY clients
    ADD CONSTRAINT clients_email_key UNIQUE (email);


--
-- Name: clients clients_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY clients
    ADD CONSTRAINT clients_pkey PRIMARY KEY (user_id);


--
-- Name: clients clients_username_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY clients
    ADD CONSTRAINT clients_username_key UNIQUE (username);


--
-- Name: events events_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY events
    ADD CONSTRAINT events_pkey PRIMARY KEY (event_id);


--
-- Name: providers providers_email_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY providers
    ADD CONSTRAINT providers_email_key UNIQUE (email);


--
-- Name: providers providers_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY providers
    ADD CONSTRAINT providers_pkey PRIMARY KEY (prov_id);


--
-- Name: providers providers_username_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY providers
    ADD CONSTRAINT providers_username_key UNIQUE (username);


--
-- Name: wallet wallet_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY wallet
    ADD CONSTRAINT wallet_pkey PRIMARY KEY (user_id);


--
-- Name: events events_prov_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY events
    ADD CONSTRAINT events_prov_id_fkey FOREIGN KEY (prov_id) REFERENCES providers(prov_id) ON DELETE CASCADE;


--
-- Name: wallet wallet_user_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY wallet
    ADD CONSTRAINT wallet_user_id_fkey FOREIGN KEY (user_id) REFERENCES clients(user_id);


--
-- PostgreSQL database dump complete
--

