create table author(
    id_author serial primary key,
    first_name varchar(255),
    last_name varchar(255)
);

insert into author
values (1,'Liviu','Rebreanu');

create table books(
    id_book serial primary key,
    title varchar(255),
    id_author integer,
    type varchar(255),
    publication_year date,
    foreign key (id_author) references author(id_author)
);

insert into books
values (1,'Padurea Spanzuratilor',1,'Roman','2023-01-01');