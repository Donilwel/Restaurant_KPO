--liquibase formatted sql
--changeset Danila Maslov:1
create table book
(
    id uuid not null constraint pk_book primary key,
    title varchar(2048) not null,
    description text null
);