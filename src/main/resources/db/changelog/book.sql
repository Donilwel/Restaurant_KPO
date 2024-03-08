--liquibase formatted sql
--change Danila Maslov:1
create table book (
    id uuid not null constraint pk_book primary key,
    title varchar(2048) not null,
    description text null
);

--change Danila Maslov:1
insert into book (id, title)
values
    ('12421', '1221'),
    ('3333', 'DKDSKFKD')