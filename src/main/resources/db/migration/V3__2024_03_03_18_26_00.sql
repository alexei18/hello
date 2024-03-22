create table loans(
    id_loan serial primary key,
    id_user int,
    id_book int,
    loan_date date,
    return_date date,
    foreign key (id_user) references users(id_user),
    foreign key (id_book) references books(id_book)
);


create table admins(
    id_admin serial primary key,
    username varchar(255),
    password varchar(255)
);

insert into admins
values (1,'admin','$2a$10$TtGLQVDMLHbbMDlbyim6l.kZplgUJLTwhOEb5p..ZMCRdoXNcqKT6'),
       (2,'andrei','$2a$10$Z1H1UnlmyTvSGL9TsZE0q.lguTOplYx63gjvXNlhGdpubbRoVP.mK');

create table reviews(
    id_review serial primary key,
    id_user int,
    id_book int,
    message varchar(255),
    start int,
    foreign key (id_user) references users(id_user),
    foreign key (id_book) references books(id_book)
);


create table subscription(
    id_subscription serial primary key,
    id_user int,
    subscription_date date,
    expiration_date date,
    expired int,
    foreign key (id_user) references users(id_user)
);


