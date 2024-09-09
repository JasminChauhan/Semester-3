CREATE TABLE Stu_Info (
    Rno INT ,
    Name VARCHAR(50),
    Branch VARCHAR(50)
);

INSERT INTO Stu_Info (Rno, Name, Branch)
VALUES 
    (101, 'Raju', 'CE'),
    (102, 'Amit', 'CE'),
    (103, 'Sanjay', 'ME'),
    (104, 'Neha', 'EC'),
    (105, 'Meera', 'EE'),
    (106, 'Mahesh', 'ME');

CREATE TABLE Result (
	RNO INT,
    SPI DECIMAL(4, 2),
	);

INSERT INTO Result (Rno, SPI)
VALUES 
    (101, 8.8),
    (102, 9.2),
    (103, 7.6),
    (104, 8.2),
    (105, 7.0),
    (107, 8.9);  

CREATE TABLE EMPLOYEE_MASTER (
    EmployeeNo VARCHAR(50) ,
    Name VARCHAR(50),
    ManagerNo VARCHAR(50)
);

INSERT INTO EMPLOYEE_MASTER(EmployeeNo, Name, ManagerNo)
VALUES 
    ('E01', 'Tarun', NULL),
    ('E02', 'Rohan', 'E02'),
    ('E03', 'Priya', 'E01'),
    ('E04', 'Milan', 'E03'),
    ('E05', 'Jay', 'E01'),
    ('E06', 'Anjana', 'E04');


--Part – A:

--1. Combine information from student and result table using cross join or Cartesian product.
	Select * From Stu_Info
	Cross Join Result

--2. Perform inner join on Student and Result tables.
	Select * From Stu_Info
	INNER JOIN Result
	on Stu_Info.Rno = Result.RNO

--3. Perform the left outer join on Student and Result tables.
	Select * From Stu_Info
	LEFT OUTER JOIN Result
	on Stu_Info.Rno = Result.RNO

--4. Perform the right outer join on Student and Result tables.
	Select * From Stu_Info
	RIGHT OUTER JOIN Result
	on Stu_Info.Rno = Result.RNO

--5. Perform the full outer join on Student and Result tables.
	Select * From Stu_Info
	RIGHT OUTER JOIN Result
	on Stu_Info.Rno = Result.RNO

--6. Display Rno, Name, Branch and SPI of all students.
	Select Stu_Info.Rno, Stu_Info.Name, Stu_Info.Branch, Result.SPI
	From Stu_Info
	INNER JOIN Result
	on Stu_Info.Rno = Result.RNO

--7. Display Rno, Name, Branch and SPI of CE branch’s student only.
	Select Stu_Info.Rno, Stu_Info.Name, Stu_Info.Branch, Result.SPI
	From Stu_Info
	INNER JOIN Result
	on Stu_Info.Rno = Result.RNO
	Where Stu_Info.Branch = 'CE'

--8. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
	Select s.Rno, s.Name, s.Branch, r.SPI
	From Stu_Info s
	INNER JOIN Result r
	on s.Rno = r.RNO
	Where s.Branch = 'EC' 

--9. Display average result of each branch.
	Select s.Branch, Avg(r.SPI) as Avg
	From Stu_Info s
	INNER JOIN Result r 
	on s.Rno = r.RNO
	Group By s.Branch

--10. Display average result of CE and ME branch.
	Select s.Branch, Avg(r.SPI) as Avg
	From Stu_Info s
	INNER JOIN Result r 
	on s.Rno = r.RNO
	Group By s.Branch
	Having s.branch in ('CE','ME')

--Part – B:

--1. Display average result of each branch and sort them in ascending order by SPI.
	Select s.Branch, Avg(r.SPI) as Avg
	From Stu_Info s
	INNER JOIN Result r 
	on s.Rno = r.RNO
	Group By s.Branch
	Order By AVg(r.SPI) 

--2. Display highest SPI from each branch and sort them in descending order.
	Select s.Branch, MAX(r.SPI) as Max
	From Stu_Info s
	INNER JOIN Result r 
	on s.Rno = r.RNO
	Group By s.Branch
	Order By MAX(r.SPI) DESC 

--Part – C:
--1. Retrieve the names of employee along with their manager’s name from the Employee table.
	Select e.Name as Emplyee_name , m.Name as Manager_Name
	From  EMPLOYEE_MASTER e 
	INNER JOIN EMPLOYEE_MASTER m
	on m.EmployeeNo = e.ManagerNo
	