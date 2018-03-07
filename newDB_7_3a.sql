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
    blocked boolean,
    dept numeric(1000,2)
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
    balance numeric(1000,2) NOT NULL,
    bonus numeric(100,2) NOT NULL
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
\.


--
-- Data for Name: clients; Type: TABLE DATA; Schema: public; Owner: -
--

COPY clients (user_id, username, password, first_name, last_name, postal_code, phone, city, address, address_num, email, long, lat, disabled, blocked) FROM stdin;
1	Brillakis	$2a$10$j2JFoaOiPlwB/w4Det6Hneo9qFU00uCYY1MDwLwJJIhtJDq./Ax6W	Βασίλης	Μπριλλάκης	17122	6945870011	Νέα Σμύρνη	Νίκαιας	17	billbrillakis@gmail.com	0	0	f	f
\.


--
-- Data for Name: events; Type: TABLE DATA; Schema: public; Owner: -
--

COPY events (prov_id, event_id, name, date, tickets, price, description, tags, images, long, lat, duration) FROM stdin;
\.


--
-- Data for Name: providers; Type: TABLE DATA; Schema: public; Owner: -
--

COPY providers (prov_id, username, password, full_name, afm, iban, m_first_name, m_last_name, m_phone, phone, postal_code, address, address_num, city, email, subscription, long, lat, disabled, blocked, dept) FROM stdin;
1	paidotropos	$2a$10$fErZhcd4qvwXthWBOOoFNO/w4/98YVgu9VK72xIucRwKtsKLV6XgS	Παιδοτρόπος Α.Ε.	124569783	12345678912345678912345	Μάρκος	Αλεξόπουλος	6978521432	2115846789	15354	Λεωφόρος Σπάτων	14	Γέρακας	alex.mark@yahoo.gr	2018-03-07 18:09:29.196	0	0	f	f	0.00
\.


--
-- Data for Name: wallet; Type: TABLE DATA; Schema: public; Owner: -
--

COPY wallet (user_id, balance, bonus) FROM stdin;
1	421.00	201.00
\.


--
-- Name: admins_admin_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('admins_admin_id_seq', 1, false);


--
-- Name: clients_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('clients_user_id_seq', 1, true);


--
-- Name: events_event_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('events_event_id_seq', 1, false);


--
-- Name: providers_prov_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('providers_prov_id_seq', 1, true);


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
    ADD CONSTRAINT wallet_user_id_fkey FOREIGN KEY (user_id) REFERENCES clients(user_id) ON DELETE CASCADE;


--
-- PostgreSQL database dump complete
--

