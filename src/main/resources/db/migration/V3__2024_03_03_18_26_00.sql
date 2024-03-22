create table loans(
    id_loan serial primary key,
    id_user int,
    id_book int,
    loan_date date,
    return_date date,
    foreign key (id_user) references users(id_user),
    foreign key (id_book) references books(id_book)
);

insert into loans
values (1,1,1,'2023-03-03','2023-03-13');

create table admins(
    id_admin serial primary key,
    username varchar(255),
    password varchar(255)
);

insert into admins
values (1,'admin','$2a$10$5FfIHjW56M/9gLP7dnj32.CbLJsXicgWRN/Q7Eblr2tQy/Qw6HXAi');

create table reviews(
    id_review serial primary key,
    id_user int,
    id_book int,
    message varchar(255),
    start int,
    foreign key (id_user) references users(id_user),
    foreign key (id_book) references books(id_book)
);

insert into reviews
values (1,1,1,'Daca mai da odata intelliju crash sau iar apar 100 erori, bag sula in programare',5);

create table subscription(
    id_subscription serial primary key,
    id_user int,
    subscription_date date,
    expiration_date date,
    expired int,
    foreign key (id_user) references users(id_user)
);

insert into subscription
values (1,1,'2023-03-03','2023-04-03',0);
