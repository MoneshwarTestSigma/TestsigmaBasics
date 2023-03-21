create table productcategory  ( 
id			bigint(10) 		NOT NULL, 
name 		varchar(10) 	default null,
description varchar(100)	default null,
primary key(id) 
 );

create table product(
id 			bigint(10)		not null,
name 		varchar(10)		default null,
description varchar(200)   	default null,
price 		float(10,2)		default null,
category_id	bigint(10)		not null,
primary key(id),
foreign key(category_id)
	references productcategory(id)
	on delete cascade
	on update cascade
);

create table customer
(id bigint(10)   not null     auto_increment,
 firstname       varchar(20)  default null,
 lastname        varchar(20)  default null,
 phoneno         bigint(10)   default null,
 primary key(id)
);

create table deliveryinformation
(
    id 			BIGINT(10) 		NOT NULL AUTO_INCREMENT,
    address 	VARCHAR(100) 	DEFAULT NULL,
    customerid 	integer 		DEFAULT NULL,
    primary key(id),
    foreign key(customerid)
        references customer(id)
        ON DELETE CASCADE
);
