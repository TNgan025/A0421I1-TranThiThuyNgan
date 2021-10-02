create database QuanLyKhoHang;
create table VatTu(
maVatTu varchar(20) primary key,
tenVatTu varchar(50)
);
create table PhieuXuat(
soPhieuXuat int primary key,
ngayXuat datetime,
donGiaXuat int,
soLuongXuat int,
maVatTu varchar(20),
foreign key(maVatTu) references VatTu(maVatTu)
);
create table NhaCungUng(
maNCC varchar(20) primary key,
tenNCC varchar(50),
diaChi varchar(100),
soDT int
);
create table DonDatHang(
soDH varchar(20) primary key,
ngayDH datetime,
maNCC varchar(20),
maVatTu varchar(20),
foreign key(maNCC) references NhaCungUng(maNCC),
foreign key(maVatTu ) references VatTu(maVatTu )
);
create table PhieuNhap(
soPN varchar(20) primary key,
ngayNhap datetime,
soLuongNhap int,
donGiaNhap int,
maVatTu varchar(20),
foreign key(maVatTu) references VatTu(maVatTu)
);