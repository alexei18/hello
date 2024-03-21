create table users(
id_user serial primary key,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(100) UNIQUE,
phone_number INT UNIQUE,
password VARCHAR(100)
);

insert into users
values (1,'Andrei','Spinu','andrei0spinu@gmail.com',067100271,'123QWE123');