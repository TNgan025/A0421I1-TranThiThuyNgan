create database QuanLyBanHang;
create table Customer(
cID varchar(20) PRIMARY KEY,
cName varchar(50),
cAge int
);
create table `Order`(
oID varchar(20) Primary key,
cID varchar(20),
oDate datetime,
oTotalPrice int,
foreign key(cID) references Customer(cID)
);
create table Product(
pID varchar(20) primary key,
pName varchar(50),
pPrice int
);
create table OrderDetail(
oID varchar(20),
pID varchar(20),
odQTY int,
primary key(oID,pID),
foreign key(oID) references `Order`(oID),
foreign key(pID) references Product(pID)
);
