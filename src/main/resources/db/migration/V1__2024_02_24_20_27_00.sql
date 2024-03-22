create table users(
id_user serial primary key,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(100) UNIQUE,
phone_number INT UNIQUE,
password VARCHAR(100)
);
