drop database if exists testdb;
create database testdb;
use testdb;

create table sample_table(
user_no int,
user_name varchar(50),
user_age int,
user_mail varchar(50)

);

insert into sample_table values (1, 'Yamada', 21, 'xxx@yahoo.co.jp');
insert into sample_table values (2, 'Sato', 21, 'yyy@google.com');
insert into sample_table values (3, 'Harada', 39, 'zzz@yahoo.co.jp');