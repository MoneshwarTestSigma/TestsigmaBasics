create table Students(
Name varchar(20),
Roll_no int primary key,
Standard int,
Section char(1),
Class_room int not null
);

-- drop table Students;
create table Teachers(
Name varchar(20),
Subject varchar(10),
Class_room int not null
);
-- drop table Teachers;

create table Marks(
Roll_no int primary key,
Maths int,
Science int
);

alter table Marks
add constraint f_key
foreign key (Roll_no) references Students(Roll_no);

