use quanlysinhvien;
select * from subject;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất--
select subname, credit from subject where credit = (select max(credit) as Max_credit from subject);
-- Hiển thị các thông tin môn học có điểm thi lớn nhất--
select * from subject where credit = (select max(credit) as Max_credit from subject);
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần --
select * from mark ;
select avg(mark) from mark group by StudentId;
select S.StudentId, S.StudentName, AVG(Mark)
from Student S join Mark M on S.StudentId = M.StudentId
group by S.StudentId, S.StudentName 
order by AVG(Mark) desc;