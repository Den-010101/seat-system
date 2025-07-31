create database if not exists seat_system;
use seat_system;

create table SeatingChart (
    FLOOR_SEAT_SEQ int primary key auto_increment,
    FLOOR_NO int not null,
    SEAT_NO varchar(10) not null
);

create table Employee (
    EMP_ID char(5) primary key,
    name varchar(50),
    EMAIL varchar(100),
    FLOOR_SEAT_SEQ int,
    foreign key (FLOOR_SEAT_SEQ) references SeatingChart(FLOOR_SEAT_SEQ)
);