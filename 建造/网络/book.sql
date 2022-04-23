/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Super
 * Created: 2022-3-21
 */


create database if not exists book default charset utf8;
use book;
create table book(
bid int primary key auto_increment,
bname varchar(30) not null,
bauthor varchar(30) not null,
bpublish varchar(40) not null,
bprice float(6,2) default 0
) default charset utf8;



insert into book (bname,bauthor,bpublish,bprice) values('java web开发技术','张三','清华大学出版社',45.5);
