create database flight;
use flight;
create table time_table(
flight_no int primary key,
arrival_stop varchar(100),
arrival_time time,
destination_stop varchar(100),
destination_time time,
boarding_time time
);
insert into time_table values(1901,'Indore','08:23:00','Mumbai','11:43:00','07:00:00');
insert into time_table values(1902,'Indore','10:13:00','Delhi','14:34:00','09:00:00');
insert into time_table values(1903,'Indore','11:14:00','Pune','13:34:00','10:00:00');
insert into time_table values(1904,'Indore','13:45:00','Punjab','16:12:00','12:00:00');
insert into time_table values(1905,'Indore','15:56:00','Dubai','00:24:00','14:00:00');
insert into time_table values(1906,'Indore','17:08:00','London','05:32:00','16:00:00');
insert into time_table values(1907,'Indore','19:32:00','Paris','09:24:00','18:00:00');
insert into time_table values(1908,'Indore','21:45:00','Riyadh','14:33:00','20:00:00');
insert into time_table values(1909,'Indore','23:12:00','Washington','11:44:00','22:00:00');
insert into time_table values(1910,'Indore','01:45:00','Moscow','11:37:00','00:20:00');

create table seat_arr(
flight_no int primary key,
first_class int ,
business_class int,
economy_class int,
premimum_class int 
);
insert into seat_arr values(1901,50,20,30,10);
insert into seat_arr values(1902,50,20,30,10);
insert into seat_arr values(1903,50,20,30,10);
insert into seat_arr values(1904,50,20,30,10);
insert into seat_arr values(1905,50,20,30,10);
insert into seat_arr values(1906,50,20,30,10);
insert into seat_arr values(1907,50,20,30,10);
insert into seat_arr values(1908,50,20,30,10);
insert into seat_arr values(1909,50,20,30,10);
insert into seat_arr values(1910,50,20,30,10);

create table gates(
class varchar(100),
gate_no int 
);
insert into gates values('first class',1);
insert into gates values('business class',2);
insert into gates values('economy class',3);
insert into gates values('premimum class',4);
select * from gates;


create database user;
use user;
create table user_input(
name varchar (100),
age int,
contact varchar(100),
email varchar(100),
passport int,
gender varchar(100),
main varchar(100),
destination varchar(100),
flight_no int,
class varchar(100)
);
alter table user_input
add ticket_no int auto_increment primary key;







