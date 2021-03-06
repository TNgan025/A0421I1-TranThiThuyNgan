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
(1,'l??? t??n'),
(2,'ph???c v???'),
(3,'chuy??n vi??n'),
(4,'gi??m s??t'),
(5,'qu???n l??'),
(6,'gi??m ?????c');
insert into trinh_do
values
(1,'trung c???p'),
(2,'cao ?????ng'),
(3,'?????i h???c'),
(4,'sau ?????i h???c');
insert into bo_phan
values
(1,'Sale ??? Marketing'),
(2,'H??nh Ch??nh'),
(3,'Ph???c v???'),
(4,'Qu???n l??');
insert into nhan_vien
values
(1,'Tr???n V??n Khu??',6,4,2,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','???? N???ng'),
(2,'Nguy???n Son',1,1,1,'1999-12-12',206764234,5000000,090534345,'nguyenson@gmail.com','???? N???ng'),
(3,'L?? V??n An',1,1,3,'1988-04-13',206184291,5000000,0905768796,'vanan@gmail.com','Qu???ng Nam'),
(4,'L?? Tr???n Thu',2,3,4,'1995-02-12',206184291,10000000,0905453657,'lethu@gmail.com','???? N???ng'),
(5,'Tr????ng V??n Tu???n',2,3,1,'1989-02-09',206915647,10000000,0909452456,'vantuan@gmail.com','H??? Ch?? Minh'),
(6,'Tr???n Kh??nh Chi',3,3,2,'1991-12-17',202914563,20000000,0905567345,'tranchi@gmail.com','H?? N???i'),
(7,'Nguy???n Ng???c',3,3,1,'1988-02-12',206566914,20000000,09055467846,'nguyenngoc@gmail.com','Hai Ph??ng'),
(8,'La Th??nh',4,4,4,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','???? N???ng'),
(9,'H??? V??n Chi???n',6,4,2,'1978-02-18',20657478,30000000,0935678567,'vanchien@gmail.com','???? N???ng'),
(10,'V?? Anh D??ng',5,4,1,'1990-02-12',20656465,40000000,0905345768,'voanh@gmail.com','Qu???ng Nam');
insert into loai_khach
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');	
insert into khach_hang
values
(1,2,'Nguy???n ??o??n','1989-02-09','234345345','090543454','nguyendoan@gmail.com','Hai Phong'),
(2,3,'Nguy???n Anh','1991-12-17','223445398','095643457','nguyenanh@gmail.com','Qu???ng B??nh'),
(3,1,'L?? H??ng','1990-02-12','342345456','0906456756','hung@gmail.com','Hai D????ng'),
(4,4,'??o??n L??nh','1978-02-12','234345665','0935678767','doanlinhgmail.com','???? N???ng'),
(5,5,'T?? L??m','1995-02-12','323454345','090542546','tolam@gmail.com','H?? N???i');
insert into loai_dich_vu
values
(1,'Villa'),
(2,'House'),
(3,'Room');
insert into kieu_thue
values
(1,'n??m',100000000),
(2,'th??ng',12000000),
(3,'ng??y',500000),
(4,'gi???',100000);
insert into dich_vu
values
(1,'thu?? view bi???n villa',200,2,'12',5000000,3,1,'t???t nh???t'),
(2,'thu?? view bi???n house',100,2,'9',4000000,3,2,'t???t nh???t'),
(3,'thu?? view bi???n room',30,2,'3',3000000,3,3,'t???t nh???t'),
(4,'thu?? view trung t??m villa',200,2,'12',4000000,3,1,'t???t nh???t'),
(5,'thu?? view trung t??m house',100,2,'9',3000000,3,2,'t???t nh???t'),
(6,'thu?? view trung t??m room',30,2,'3',2000000,3,3,'t???t nh???t');
insert into hop_dong
values
(1,2,1,1,'2020-12-12','2021-01-02',3000000,5000000),
(2,3,4,2,'2021-01-12','2021-01-20',400000,7000000),
(3,6,3,4,'2020-03-12','2021-03-22',5000000,10000000);
insert into dich_vu_di_kem
values
(1,'massage',500000,1,'ho??n th??nh'),
(2,'karaoke',400000,1,'m???t gi???'),
(3,'th???c ??n',100000,1,'m???t kh???u ph???n'),
(4,'n?????c u???ng',20000,1,'chai'),
(5,'thu?? xe di chuy???n tham quan resort',1000000,1,'tour');
insert into hop_dong_chi_tiet
values
(1,1,2,3),
(2,2,1,2),
(3,3,4,2);
-- 2.	Hi???n th??? th??ng tin c???a t???t c??? nh??n vi??n c?? trong h??? th???ng c?? t??n b???t ?????u l?? m???t trong c??c k?? t??? ???H???, ???T??? ho???c ???K??? v?? c?? t???i ??a 15 k?? t???.--
select HoTen 
from nhan_vien
where HoTen like 'H%' or 'T%'or 'K%' and length(HoTen) < 15;
-- 3.	Hi???n th??? th??ng tin c???a t???t c??? kh??ch h??ng c?? ????? tu???i t??? 18 ?????n 50 tu???i v?? c?? ?????a ch??? ??? ??????? N???ng??? ho???c ???Qu???ng Tr??????.--
select * from khach_hang
where DiaChi = "???? N???ng" or "Qu???ng Tr???" and (select TIMESTAMPDIFF(year,NgaySinh,curdate())) between 18 and 50;
-- 4.	?????m xem t????ng ???ng v???i m???i kh??ch h??ng ???? t???ng ?????t ph??ng bao nhi??u l???n. --
-- K???t qu??? hi???n th??? ???????c s???p x???p t??ng d???n theo s??? l???n ?????t ph??ng c???a kh??ch h??ng.--
-- Ch??? ?????m nh???ng kh??ch h??ng n??o c?? T??n lo???i kh??ch h??ng l?? ???Diamond???.--
select kh.IDKhachHang, kh.IDLoaiKhach, kh.HoTen, lk.TenLoaiKhach, count(IDHopDong) as SoLuongDatPhong 
from khach_hang kh 
left join hop_dong hd on kh.IDKhachHang= hd.IDKhachHang
left join loai_khach lk on lk.IDLoaiKhach = kh.IDLoaiKhach
where TenLoaiKhach = 'Diamond'
group by IDKhachHang
order by SoLuongDatPhong asc;
-- 5.	Hi???n th??? IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, 
-- TongTien (V???i TongTien ???????c t??nh theo c??ng th???c nh?? sau: ChiPhiThue + SoLuong*Gia, v???i SoLuong v?? Gi?? l?? t??? b???ng DichVuDiKem) 
-- cho t???t c??? c??c Kh??ch h??ng ???? t???ng ?????t ph???ng.
--  (Nh???ng Kh??ch h??ng n??o ch??a t???ng ?????t ph??ng c??ng ph???i hi???n th??? ra).
select kh.IDKhachHang, kh.HoTen, lk.TenLoaiKhach,hd.IDHopDong,dv.TenDichVu,hd.IDHopDong,hd.IDHopDong , sum(dv.ChiPhiThue+hdct.soluong*dvdk.gia)as TongTien 
from khach_hang kh 
left join hop_dong hd on kh.IDKhachHang= hd.IDKhachHang
left join loai_khach lk on lk.IDLoaiKhach = kh.IDLoaiKhach
left join dich_vu dv on dv.IDDichvu = hd.IDDichvu
left join hop_dong_chi_tiet hdct on hdct.IDHopDong = hd.IDHopDong
left join dich_vu_di_kem dvdk on dvdk.IDDichvudikem = hdct.IDDichvudikem
group by IDKhachHang;
-- 6.	Hi???n th??? IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu
--  c???a t???t c??? c??c lo???i D???ch v??? ch??a t???ng ???????c Kh??ch h??ng th???c hi???n ?????t t??? qu?? 1 c???a n??m 2019 (Qu?? 1 l?? th??ng 1, 2, 3).
select dv.IDDichVu, dv.TenDichVu, dv.DienTich, dv.ChiPhiThue, ldv.TenLoaiDichVu
from dich_vu dv
left join loai_dich_vu ldv on dv.IDLoaiDichVu = ldv.IDLoaiDichVu
left join hop_dong hd on hd.IDDichVu = dv.IDDichVu
where NgayLamHopDong > '2019-03-31' or NgayKetThuc < '2019-01-01'
group by IDDichVu;
-- 7.	Hi???n th??? th??ng tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- c???a t???t c??? c??c lo???i d???ch v??? ???? t???ng ???????c Kh??ch h??ng ?????t ph??ng trong n??m 2018 nh??ng ch??a t???ng ???????c Kh??ch h??ng ?????t ph??ng  trong n??m 2019.
select dv.IDDichVu, dv.TenDichVu, dv.DienTich,dv.SoNguoiToiDa, dv.ChiPhiThue, ldv.TenLoaiDichVu
from dich_vu dv
left join loai_dich_vu ldv on dv.IDLoaiDichVu = ldv.IDLoaiDichVu
left join hop_dong hd on hd.IDDichVu = dv.IDDichVu
where hd.NgayLamHopDong >= '2018-01-01' and hd.NgayKetThuc <= '2018-12-31'
group by IDDichVu;
-- 8.	Hi???n th??? th??ng tin HoTenKhachHang c?? trong h??? th???ng, v???i y??u c???u HoThenKhachHang kh??ng tr??ng nhau.
-- H???c vi??n s??? d???ng theo 3 c??ch kh??c nhau ????? th???c hi???n y??u c???u tr??n
-- C??ch 1 --
select Hoten from Khach_hang group by Hoten;
group by HoTen;
-- C??ch 2 --
select distinct Hoten from khach_hang;
-- C??ch 3

-- 9.	Th???c hi???n th???ng k?? doanh thu theo th??ng, 
-- ngh??a l?? t????ng ???ng v???i m???i th??ng trong n??m 2019 th?? s??? c?? bao nhi??u kh??ch h??ng th???c hi???n ?????t ph??ng.
select month(NgayLamHopDong) as Thang, count(IDKhachHang) as SoLuongDatPhong from hop_dong
where year(Ngaylamhopdong) = 2019
group by month(NgayLamHopDong);
-- 10.	Hi???n th??? th??ng tin t????ng ???ng v???i t???ng H???p ?????ng th?? ???? s??? d???ng bao nhi??u D???ch v??? ??i k??m. K???t qu??? hi???n th??? bao g???m 
-- IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (???????c t??nh d???a tr??n vi???c count c??c IDHopDongChiTiet).
select hd.IDHopDong, hd.NgayLamHopDong, hd.NgayKetthuc, hd.TienDatCoc, count(IDHopDongChiTiet) as SoLuongDichVuDiKem
from hop_dong hd left join hop_dong_chi_tiet hdct on hd.IDHopDong = hdct.IDHopDong
group by hd.IDHopDong;
-- 11.	Hi???n th??? th??ng tin c??c D???ch v??? ??i k??m ???? ???????c s??? d???ng b???i nh???ng Kh??ch h??ng c?? 
-- TenLoaiKhachHang l?? ???Diamond??? v?? c?? ?????a ch??? l?? ???Vinh??? ho???c ???Qu???ng Ng??i???.
select dvdk.IDDichVuDiKem, TenDichVuDiKem, Gia, Donvi, TrangThaiKhaDung from dich_vu_di_kem dvdk 
left join hop_dong_chi_tiet hdct on hdct.IDDichVuDiKem = dvdk.IDDichVuDiKem
left join hop_dong hd on hd.IDHopDong = hdct.IDHopDong
left join khach_hang kh on kh.IDKhachHang = hd.IDKhachHang
left join loai_khach lk on lk.IDLoaiKhach = kh.IDLoaiKhach
where lk.TenLoaiKhach = 'Diamond'
and kh.DiaChi = 'Qu???ng Ng??i' or kh.DiaChi ='Vinh'
group by dvdk.IDDichVuDiKem;

