--liquibase formatted sql
--change Danila Maslov:1
create table book_author (
     book_id uuid not null constraint fk_book_author_book references book (id),
     author_id uuid not null constraint fk_book_author_author references author (id),
     constraint uq_book_author_book_id_author_id unique (book_id, author_id)
);

--change Danila Maslov:1
insert into book_author (book_id, author_id)
values
    ('12254551', '1221'),
    ('3333', '1333')