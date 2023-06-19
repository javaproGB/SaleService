PGDMP                         {            saleservice    15.1    15.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    73782    saleservice    DATABASE        CREATE DATABASE saleservice WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Russian_Russia.1251';
    DROP DATABASE saleservice;
                postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
                pg_database_owner    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                   pg_database_owner    false    4            �            1259    73783    adverts    TABLE     A  CREATE TABLE public.adverts (
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
    DROP TABLE public.adverts;
       public         heap    postgres    false    4            �            1259    73788 
   categories    TABLE     �   CREATE TABLE public.categories (
    id uuid NOT NULL,
    description text,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);
    DROP TABLE public.categories;
       public         heap    postgres    false    4            �            1259    73793    roles    TABLE     �   CREATE TABLE public.roles (
    id uuid NOT NULL,
    description text,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);
    DROP TABLE public.roles;
       public         heap    postgres    false    4            �            1259    73798    users    TABLE     �   CREATE TABLE public.users (
    id uuid NOT NULL,
    username character varying(255),
    password character varying(255),
    email text,
    address text,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);
    DROP TABLE public.users;
       public         heap    postgres    false    4            �            1259    73803    users_roles    TABLE     Z   CREATE TABLE public.users_roles (
    user_id uuid NOT NULL,
    role_id uuid NOT NULL
);
    DROP TABLE public.users_roles;
       public         heap    postgres    false    4                      0    73783    adverts 
   TABLE DATA           �   COPY public.adverts (id, user_id, category_id, title, text, photo, price, sale, final_price, created_at, updated_at) FROM stdin;
    public          postgres    false    214   �                 0    73788 
   categories 
   TABLE DATA           M   COPY public.categories (id, description, created_at, updated_at) FROM stdin;
    public          postgres    false    215   �                 0    73793    roles 
   TABLE DATA           H   COPY public.roles (id, description, created_at, updated_at) FROM stdin;
    public          postgres    false    216   X                 0    73798    users 
   TABLE DATA           _   COPY public.users (id, username, password, email, address, created_at, updated_at) FROM stdin;
    public          postgres    false    217   �                 0    73803    users_roles 
   TABLE DATA           7   COPY public.users_roles (user_id, role_id) FROM stdin;
    public          postgres    false    218   �       u           2606    73807    adverts adverts_pk 
   CONSTRAINT     P   ALTER TABLE ONLY public.adverts
    ADD CONSTRAINT adverts_pk PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.adverts DROP CONSTRAINT adverts_pk;
       public            postgres    false    214            w           2606    73809    categories categories_pk 
   CONSTRAINT     V   ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pk PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.categories DROP CONSTRAINT categories_pk;
       public            postgres    false    215            y           2606    73811    roles roles_pk 
   CONSTRAINT     L   ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pk PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.roles DROP CONSTRAINT roles_pk;
       public            postgres    false    216            {           2606    73813    users users_pk 
   CONSTRAINT     L   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pk PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pk;
       public            postgres    false    217            }           2606    81975    users_roles users_roles_pk 
   CONSTRAINT     f   ALTER TABLE ONLY public.users_roles
    ADD CONSTRAINT users_roles_pk PRIMARY KEY (user_id, role_id);
 D   ALTER TABLE ONLY public.users_roles DROP CONSTRAINT users_roles_pk;
       public            postgres    false    218    218            ~           2606    73814    adverts adverts_fk    FK CONSTRAINT     q   ALTER TABLE ONLY public.adverts
    ADD CONSTRAINT adverts_fk FOREIGN KEY (user_id) REFERENCES public.users(id);
 <   ALTER TABLE ONLY public.adverts DROP CONSTRAINT adverts_fk;
       public          postgres    false    214    3195    217                       2606    73819    adverts adverts_fk_1    FK CONSTRAINT     |   ALTER TABLE ONLY public.adverts
    ADD CONSTRAINT adverts_fk_1 FOREIGN KEY (category_id) REFERENCES public.categories(id);
 >   ALTER TABLE ONLY public.adverts DROP CONSTRAINT adverts_fk_1;
       public          postgres    false    214    215    3191            �           2606    73824    users_roles users_roles_fk    FK CONSTRAINT     y   ALTER TABLE ONLY public.users_roles
    ADD CONSTRAINT users_roles_fk FOREIGN KEY (user_id) REFERENCES public.users(id);
 D   ALTER TABLE ONLY public.users_roles DROP CONSTRAINT users_roles_fk;
       public          postgres    false    3195    218    217            �           2606    73829    users_roles users_roles_fk_1    FK CONSTRAINT     {   ALTER TABLE ONLY public.users_roles
    ADD CONSTRAINT users_roles_fk_1 FOREIGN KEY (role_id) REFERENCES public.roles(id);
 F   ALTER TABLE ONLY public.users_roles DROP CONSTRAINT users_roles_fk_1;
       public          postgres    false    216    218    3193               �   x���MJ1���S� �PI*���`6�JEZdz��m<�'�7�� n���6�+���t�"@�3T��-��F\L�^\{��T�2d�$�F)�rR��{�(P����ZA�I�<�\��_M�v��g�xj����u>�9=���w�����{�0�+����!��S�Pцy h��Fd��AncCt�t���U�r���7�����,�'�J~	         �   x��ͱ�0 �O��ɒ,�̒��rB�&�g�4��|���z)n ,k��9����il�y�z�k?�!1�B�ąhA�9����++ذRs�L(еx�؆O����oC��� ��@b�hg-��{��zo���9�~�3Hk         �   x���;
�0 �9>E/� ˲,g+4�B?�4[��{�#t��!�^W�-j� �C
����r�Mʰ���w[�e $(`��8MH���������U���XKL�cѽ?_���?yM�����\:�`;T/�֨����������1?|e@�         �   x���;
1��z�
7p�}�9���I��;�t����i�cM�zc��b R�౤j��²�6hy�9��k{��C�mIu������qe^����kW��N(ew�'�n��D���vX|�|����7��z�%=1         u   x����! �w��%鿄\���r�N���S`S�)I�v��r]J��b 6�������#,��������)��c����ɗ�^GX��]����J4e����}�?9�9     