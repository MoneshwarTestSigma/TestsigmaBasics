create database ecommercedb;
create table productcategory  ( 
productcategoryno int, 
name varchar(10),
 description varchar(100),
 primary key(productcategoryno) );

create table product(
productno int,
product_name varchar(10),
product_description varchar(200),
product_price varchar(10),
productcategoryno int,
primary key(productno),
foreign key(productcategoryno)
references productcategory(productcategoryno)
);

create table user
(
user_id int,
username varchar(10),
password varchar(10),
first_name varchar(10),
last_name varchar(10),
mobile varchar(10),
address varchar(200),
primary key(user_id)
);

create table shopping_session
(
shopping_session_id int,
user_id int,
total decimal,
primary key(shopping_session_id),
foreign key(user_id)
references user(user_id)
);

create table cart
(
cart_id int,
shopping_session_id int,
productno int,
quantity int,
primary key(cart_id),
foreign key(shopping_session_id)
references shopping_session(shopping_session_id),
foreign key(productno)
references product(productno)
);

create table payment
(
payment_id int,
amount int,
status varchar(5),
provider varchar(5),
primary key(payment_id)
);
create table order_items
(
order_id int,
payment_id int,
productno int,
quantity varchar(3),
description varchar(100),
primary key(order_id),
foreign key(payment_id)
references payment(payment_id),
foreign key(productno)
references product(productno)
);