
create table Customer(
id 			bigint(10) 		not null,
firstname 	varchar(20) 	default null,
lastname 	varchar(20)		default null,
phoneno 	integer			default null,
primary key(id)
);


create table deliveryinformation(
id 			bigint(10) 		not null,
address 	varchar(100) 	default null,
customerid 	integer			default null,
primary key(id),
foreign key(id)
	references customer(id)
    on delete cascade
);

create table billinginformation(
id 			bigint(10) 		not null,
package 	varchar(50)		default null,	
rate 		varchar(15)		default null,
customerid 	integer			default null,
primary key(id),
foreign key(customerid)
references customer(id)
);

create table orderinformation
(
id 			bigint(10) 		not null,
customerid 	integer			default null,
billingnumber bigint		default null,
itemtype 	varchar(50)		default null,
primary key(id),
foreign key(customerid)
	references customer(id)
    on delete cascade,
foreign key(billingnumber)
	references billinginformation(id)
    on delete cascade
);
