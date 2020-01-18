drop database if exists blog;
create database if not exists blog character set utf8mb4;

use blog;

create table user(
    id int primary key auto_increment,
    account varchar(20) unique not null,
    password varchar(50) not null
);

create table article(
    id int primary key auto_increment,
    title varchar(20) not null,
    content mediumtext not null,
    user_id int,
    create_time timestamp default CURRENT_TIMESTAMP not null,
    foreign key (user_id) references user(id)
);