--
-- PostgreSQL database cluster dump
--

-- Started on 2023-06-12 00:15:07

SET default_transaction_read_only = off;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;

--
-- Roles
--

CREATE ROLE postgres;
ALTER ROLE postgres WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS;

--
-- User Configurations
--








--
-- Databases
--

--
-- Database "template1" dump
--

\connect template1

--
-- PostgreSQL database dump
--

-- Dumped from database version 15.1
-- Dumped by pg_dump version 15.1

-- Started on 2023-06-12 00:15:07

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

-- Completed on 2023-06-12 00:15:08

--
-- PostgreSQL database dump complete
--

--
-- Database "saleservice" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 15.1
-- Dumped by pg_dump version 15.1

-- Started on 2023-06-12 00:15:08

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3354 (class 1262 OID 73782)
-- Name: saleservice; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE saleservice WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Russian_Russia.1251';


ALTER DATABASE saleservice OWNER TO postgres;

\connect saleservice

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 214 (class 1259 OID 73783)
-- Name: adverts; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.adverts (
    id uuid NOT NULL,
    user_id uuid,
    category_id uuid,
    title character varying(255),
    text text,
    photo character varying(255),
    price money,
    sale money,
    final_price money,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);


ALTER TABLE public.adverts OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 73788)
-- Name: categories; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.categories (
    id uuid NOT NULL,
    description text,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);


ALTER TABLE public.categories OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 73793)
-- Name: roles; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.roles (
    id uuid NOT NULL,
    description text,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);


ALTER TABLE public.roles OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 73798)
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    id uuid NOT NULL,
    username character varying(255),
    password character varying(255),
    email text,
    address text,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);


ALTER TABLE public.users OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 73803)
-- Name: users_roles; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users_roles (
    user_id uuid NOT NULL,
    role_id uuid
);


ALTER TABLE public.users_roles OWNER TO postgres;

--
-- TOC entry 3344 (class 0 OID 73783)
-- Dependencies: 214
-- Data for Name: adverts; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.adverts (id, user_id, category_id, title, text, photo, price, sale, final_price, created_at, updated_at) FROM stdin;
\.


--
-- TOC entry 3345 (class 0 OID 73788)
-- Dependencies: 215
-- Data for Name: categories; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.categories (id, description, created_at, updated_at) FROM stdin;
\.


--
-- TOC entry 3346 (class 0 OID 73793)
-- Dependencies: 216
-- Data for Name: roles; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.roles (id, description, created_at, updated_at) FROM stdin;
\.


--
-- TOC entry 3347 (class 0 OID 73798)
-- Dependencies: 217
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (id, username, password, email, address, created_at, updated_at) FROM stdin;
\.


--
-- TOC entry 3348 (class 0 OID 73803)
-- Dependencies: 218
-- Data for Name: users_roles; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users_roles (user_id, role_id) FROM stdin;
\.


--
-- TOC entry 3189 (class 2606 OID 73807)
-- Name: adverts adverts_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.adverts
    ADD CONSTRAINT adverts_pk PRIMARY KEY (id);


--
-- TOC entry 3191 (class 2606 OID 73809)
-- Name: categories categories_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pk PRIMARY KEY (id);


--
-- TOC entry 3193 (class 2606 OID 73811)
-- Name: roles roles_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pk PRIMARY KEY (id);


--
-- TOC entry 3195 (class 2606 OID 73813)
-- Name: users users_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pk PRIMARY KEY (id);


--
-- TOC entry 3197 (class 2606 OID 73835)
-- Name: users_roles users_roles_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users_roles
    ADD CONSTRAINT users_roles_pk PRIMARY KEY (user_id);


--
-- TOC entry 3198 (class 2606 OID 73814)
-- Name: adverts adverts_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.adverts
    ADD CONSTRAINT adverts_fk FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3199 (class 2606 OID 73819)
-- Name: adverts adverts_fk_1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.adverts
    ADD CONSTRAINT adverts_fk_1 FOREIGN KEY (category_id) REFERENCES public.categories(id);


--
-- TOC entry 3200 (class 2606 OID 73824)
-- Name: users_roles users_roles_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users_roles
    ADD CONSTRAINT users_roles_fk FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3201 (class 2606 OID 73829)
-- Name: users_roles users_roles_fk_1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users_roles
    ADD CONSTRAINT users_roles_fk_1 FOREIGN KEY (role_id) REFERENCES public.roles(id);


-- Completed on 2023-06-12 00:15:08

--
-- PostgreSQL database dump complete
--

-- Completed on 2023-06-12 00:15:08

--
-- PostgreSQL database cluster dump complete
--

