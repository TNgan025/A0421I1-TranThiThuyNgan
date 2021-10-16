create database Furama_management;
create table Vi_Tri (
IDViTri int not null primary key,
TenViTri varchar(50)
);
create table Trinh_Do(
IDTrinhDo int not null primary key,
TrinhDo varchar(45)
);
create table Bo_Phan(
IDBoPhan int not null primary key,
TenBoPhan varchar(45)
);
create table Nhan_Vien(
IDNhanVien int not null primary key,
HoTen varchar(50),
IDViTri int,
IDTrinhDo int,
IDBoPhan int,
NgaySinh date,
SoCMTND varchar(45),
Luong varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
foreign key (IDViTri) references Vi_Tri (IDViTri),
foreign key (IDTrinhDo) references Trinh_Do (IDTrinhDo),
foreign key (IDBoPhan) references Bo_Phan (IDBoPhan)
);
create table Dich_Vu_Di_Kem(
IDDichVuDiKem int not null primary key,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45)
);
create table Hop_Dong_Chi_Tiet(
IDHopDongChiTiet int not null primary key,
IDHopDong int,
IDDichVuDiKem int,
SoLuong int,
foreign key (IDDichVuDiKem) references Dich_Vu_Di_Kem (IDDichVuDiKem),
foreign key (IDHopDong) references Hop_Dong(IDHopDong)
);
create table Loai_Khach(
IDLoaiKhach int not null primary key,
TenLoaiKhach varchar(45)
);
create table Khach_Hang(
IDKhachHang int not null primary key,
IDLoaiKhach int,
HoTen varchar(45),
NgaySinh date,
SoCMTND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
foreign key (IDLoaiKhach) references Loai_Khach(IDLoaiKhach) );
create table Kieu_Thue(
IDKieuThue int primary key,
TenKieuThue varchar(45),
Gia int
);
create table Loai_Dich_Vu(
IDLoaiDichVu int not null primary key,
TenLoaiDichVu varchar(45)
);
create table Dich_Vu(
IDDichVu int not null primary key,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue int,
IDKieuThue int,
IDLoaiDichVu int,
TrangThai varchar(45),
foreign key (IDKieuThue) references Kieu_Thue(IDKieuThue),
foreign key (IDLoaiDichVu) references Loai_Dich_Vu(IDLoaiDichVu)
);
create table Hop_Dong(
IDHopDong int not null primary key,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int,
check(NgayKetThuc >=NgayLamHopDong)
foreign key (IDNhanVien) references Nhan_Vien(IDNhanVien),
foreign key (IDKhachHang) references Khach_Hang(IDKhachHang),
foreign key (IDDichVu) references Dich_Vu(IDDichVu)
);
insert into vi_tri
values
(1,'lễ tân'),
(2,'phục vụ'),
(3,'chuyên viên'),
(4,'giám sát'),
(5,'quản lí'),
(6,'giám đốc');
insert into trinh_do
values
(1,'trung cấp'),
(2,'cao đẳng'),
(3,'đại học'),
(4,'sau đại học');
insert into bo_phan
values
(1,'Sale – Marketing'),
(2,'Hành Chính'),
(3,'Phục vụ'),
(4,'Quản lý');
insert into nhan_vien
values
(1,'Trần Văn Khuê',6,4,2,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','Đà Nẵng'),
(2,'Nguyễn Son',1,1,1,'1999-12-12',206764234,5000000,090534345,'nguyenson@gmail.com','Đà Nẵng'),
(3,'Lê Văn An',1,1,3,'1988-04-13',206184291,5000000,0905768796,'vanan@gmail.com','Quảng Nam'),
(4,'Lê Trần Thu',2,3,4,'1995-02-12',206184291,10000000,0905453657,'lethu@gmail.com','Đà Nẵng'),
(5,'Trương Văn Tuấn',2,3,1,'1989-02-09',206915647,10000000,0909452456,'vantuan@gmail.com','Hồ Chí Minh'),
(6,'Trần Khánh Chi',3,3,2,'1991-12-17',202914563,20000000,0905567345,'tranchi@gmail.com','Hà Nội'),
(7,'Nguyễn Ngọc',3,3,1,'1988-02-12',206566914,20000000,09055467846,'nguyenngoc@gmail.com','Hai Phòng'),
(8,'La Thành',4,4,4,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','Đà Nẵng'),
(9,'Hồ Văn Chiến',6,4,2,'1978-02-18',20657478,30000000,0935678567,'vanchien@gmail.com','Đà Nẵng'),
(10,'Võ Anh Dũng',5,4,1,'1990-02-12',20656465,40000000,0905345768,'voanh@gmail.com','Quảng Nam');
insert into loai_khach
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');	
insert into khach_hang
values
(1,2,'Nguyễn Đoàn','1989-02-09','234345345','090543454','nguyendoan@gmail.com','Hai Phong'),
(2,3,'Nguyễn Anh','1991-12-17','223445398','095643457','nguyenanh@gmail.com','Quảng Bình'),
(3,1,'Lê Hùng','1990-02-12','342345456','0906456756','hung@gmail.com','Hai Dương'),
(4,4,'Đoàn Lĩnh','1978-02-12','234345665','0935678767','doanlinhgmail.com','Đà Nẵng'),
(5,5,'Tô Lâm','1995-02-12','323454345','090542546','tolam@gmail.com','Hà Nội');
insert into loai_dich_vu
values
(1,'Villa'),
(2,'House'),
(3,'Room');
insert into kieu_thue
values
(1,'năm',100000000),
(2,'tháng',12000000),
(3,'ngày',500000),
(4,'giờ',100000);
insert into dich_vu
values
(1,'thuê view biển villa',200,2,'12',5000000,3,1,'tốt nhất'),
(2,'thuê view biển house',100,2,'9',4000000,3,2,'tốt nhất'),
(3,'thuê view biển room',30,2,'3',3000000,3,3,'tốt nhất'),
(4,'thuê view trung tâm villa',200,2,'12',4000000,3,1,'tốt nhất'),
(5,'thuê view trung tâm house',100,2,'9',3000000,3,2,'tốt nhất'),
(6,'thuê view trung tâm room',30,2,'3',2000000,3,3,'tốt nhất');
insert into hop_dong
values
(1,2,1,1,'2020-12-12','2021-01-02',3000000,5000000),
(2,3,4,2,'2021-01-12','2021-01-20',400000,7000000),
(3,6,3,4,'2020-03-12','2021-03-22',5000000,10000000);
insert into dich_vu_di_kem
values
(1,'massage',500000,1,'hoàn thành'),
(2,'karaoke',400000,1,'một giờ'),
(3,'thức ăn',100000,1,'một khẩu phần'),
(4,'nước uống',20000,1,'chai'),
(5,'thuê xe di chuyển tham quan resort',1000000,1,'tour');
insert into hop_dong_chi_tiet
values
(1,1,2,3),
(2,2,1,2),
(3,3,4,2);
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.--
select HoTen 
from nhan_vien
where HoTen like 'H%' or 'T%'or 'K%' and length(HoTen) < 15;
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.--
select * from khach_hang
where DiaChi = "Đà Nẵng" or "Quảng Trị" and (select TIMESTAMPDIFF(year,NgaySinh,curdate())) between 18 and 50;
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. --
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.--
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.--
select kh.IDKhachHang, kh.IDLoaiKhach, kh.HoTen, lk.TenLoaiKhach, count(IDHopDong) as SoLuongDatPhong 
from khach_hang kh 
left join hop_dong hd on kh.IDKhachHang= hd.IDKhachHang
left join loai_khach lk on lk.IDLoaiKhach = kh.IDLoaiKhach
where TenLoaiKhach = 'Diamond'
group by IDKhachHang
order by SoLuongDatPhong asc;
-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, 
-- TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng.
--  (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select kh.IDKhachHang, kh.HoTen, lk.TenLoaiKhach,hd.IDHopDong,dv.TenDichVu,hd.IDHopDong,hd.IDHopDong , sum(dv.ChiPhiThue+hdct.soluong*dvdk.gia)as TongTien 
from khach_hang kh 
left join hop_dong hd on kh.IDKhachHang= hd.IDKhachHang
left join loai_khach lk on lk.IDLoaiKhach = kh.IDLoaiKhach
left join dich_vu dv on dv.IDDichvu = hd.IDDichvu
left join hop_dong_chi_tiet hdct on hdct.IDHopDong = hd.IDHopDong
left join dich_vu_di_kem dvdk on dvdk.IDDichvudikem = hdct.IDDichvudikem
group by IDKhachHang;
-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu
--  của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select dv.IDDichVu, dv.TenDichVu, dv.DienTich, dv.ChiPhiThue, ldv.TenLoaiDichVu
from dich_vu dv
left join loai_dich_vu ldv on dv.IDLoaiDichVu = ldv.IDLoaiDichVu
left join hop_dong hd on hd.IDDichVu = dv.IDDichVu
where NgayLamHopDong > '2019-03-31' or NgayKetThuc < '2019-01-01'
group by IDDichVu;
-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select dv.IDDichVu, dv.TenDichVu, dv.DienTich,dv.SoNguoiToiDa, dv.ChiPhiThue, ldv.TenLoaiDichVu
from dich_vu dv
left join loai_dich_vu ldv on dv.IDLoaiDichVu = ldv.IDLoaiDichVu
left join hop_dong hd on hd.IDDichVu = dv.IDDichVu
where hd.NgayLamHopDong >= '2018-01-01' and hd.NgayKetThuc <= '2018-12-31'
group by IDDichVu;
-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
-- Cách 1 --
select Hoten from Khach_hang group by Hoten;
group by HoTen;
-- Cách 2 --
select distinct Hoten from khach_hang;
-- Cách 3

-- 9.	Thực hiện thống kê doanh thu theo tháng, 
-- nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(NgayLamHopDong) as Thang, count(IDKhachHang) as SoLuongDatPhong from hop_dong
where year(Ngaylamhopdong) = 2019
group by month(NgayLamHopDong);
-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm 
-- IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hd.IDHopDong, hd.NgayLamHopDong, hd.NgayKetthuc, hd.TienDatCoc, count(IDHopDongChiTiet) as SoLuongDichVuDiKem
from hop_dong hd left join hop_dong_chi_tiet hdct on hd.IDHopDong = hdct.IDHopDong
group by hd.IDHopDong;
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có 
-- TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select dvdk.IDDichVuDiKem, TenDichVuDiKem, Gia, Donvi, TrangThaiKhaDung from dich_vu_di_kem dvdk 
left join hop_dong_chi_tiet hdct on hdct.IDDichVuDiKem = dvdk.IDDichVuDiKem
left join hop_dong hd on hd.IDHopDong = hdct.IDHopDong
left join khach_hang kh on kh.IDKhachHang = hd.IDKhachHang
left join loai_khach lk on lk.IDLoaiKhach = kh.IDLoaiKhach
where lk.TenLoaiKhach = 'Diamond'
and kh.DiaChi = 'Quảng Ngãi' or kh.DiaChi ='Vinh'
group by dvdk.IDDichVuDiKem;

