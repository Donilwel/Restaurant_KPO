--liquibase formatted sql
--change Danila Maslov:1
create table author (
     id uuid not null constraint pk_author primary key,
     first_name varchar(1024) not null,
     last_name varchar(1024) not null
);

--change Danila Maslov:1
insert into author (id, first_name, last_name)
values
    ('12254551', 'Nikolay', 'Nosov'),
    ('1333', 'Илья', 'Ильф')