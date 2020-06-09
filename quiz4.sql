create database q4;
use q4;

-------------- list ----------------------------------------------------
create table personDetail(
id int primary key auto_increment,
lastname varchar(255) not null,
firstname varchar(255) not null,
middlename varchar(255),
age int not null
);

create table course(
id int primary key auto_increment,
course varchar(100) not null,
idx int,
stud_id int
);

-------------- Map ----------------------------------------------------
create table personDetail(
id int primary key auto_increment,
lastname varchar(255) not null,
firstname varchar(255) not null,
middlename varchar(255)  null,
age int not null
);

create table course(
id int primary key auto_increment,
course_type varchar(100),
course varchar(100),
stud_id int
);

-------------- Set ----------------------------------------------------
create table personDetail(
id int primary key auto_increment,
lastname varchar(255) not null,
firstname varchar(255) not null,
middlename varchar(255)  null,
age int not null
);

create table course(
id int primary key auto_increment,
course varchar(100),
stud_id int
);

-------------- one to many ----------------------------------------------------
create table personDetail(
id int primary key auto_increment,
lastname varchar(255) not null,
firstname varchar(255) not null,
middlename varchar(255)  null,
age int not null
);

create table course(
id int primary key auto_increment,
course varchar(100),
persons_id int,
CONSTRAINT fk_persons_id FOREIGN KEY (persons_id) REFERENCES personDetail(id)
);

-- select A.lastname, B.course, B.stud_id from persondetail A inner join course B where A.Id = 1;
-- select * from persondetail;
-- select * from persondetail inner join course;

-- drop table persondetail;
-- drop table course;
