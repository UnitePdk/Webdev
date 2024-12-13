create database ProductManager;
use ProductManager;

create table product(
	# 제품번호 제품명 가격
    num int unsigned auto_increment,
    name varchar(32) not null,
    price int not null,
    primary key(num)
);

select * from product;
update product set name="easy", price="3000" where num=1;