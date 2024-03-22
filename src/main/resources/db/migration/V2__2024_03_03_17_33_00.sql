create table author(
    id_author serial primary key,
    first_name varchar(255),
    last_name varchar(255)
);

insert into author
values (1,'Liviu','Rebreanu'),(2,'Mihai','Eminescu');

create table books(
    id_book serial primary key,
    title varchar(255),
    id_author integer,
    type varchar(255),
    publication_year date,
    image_url VARCHAR(255),
    foreign key (id_author) references author(id_author)
);

insert into books (id_book, title, id_author, type, publication_year, image_url)
values
    (1,'Padurea Spanzuratilor',1,'Roman','2023-01-01','https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1382993429i/778267.jpg'),
    (2,'Floarea Albastra', 2, 'Poezie', '2019-04-03','https://albastra.ro/wp-content/uploads/2024/01/Floare-Albastra-Mihai-Eminescu.jpg'),
    (3,'Luceafarul', 2, 'Poezie', '2019-04-05','https://iticket.md/public/store/covers/a5583fabc56031654729a4d2f970d7d0/a5583fabc56031654729a4d2f970d7d0.jpg');
