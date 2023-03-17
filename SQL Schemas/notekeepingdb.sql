create database NoteKeepingDB;
use NoteKeepingDB;

create TABLE user(
f_name varchar(20),
User_ID int primary key
);

create TABLE notes(
note text,
note_ID int primary key
);

create TABLE aboutNotes(
ID int primary key,
Date_details date
);

alter table notes
add constraint p_key
foreign  key (note_ID) references aboutNotes(ID);