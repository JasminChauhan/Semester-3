CREATE TABLE Student_INFO (
    RNo INT,
    Name VARCHAR(50),
    Branch VARCHAR(50),
    SPI DECIMAL(5, 2),
    Bklog INT
);

INSERT INTO Student_INFO (RNo, Name, Branch, SPI, Bklog) VALUES

(101, 'Raju', 'CE', 8.80, 0),
(102, 'Amit', 'CE', 2.20, 3),
(103, 'Sanjay', 'ME', 1.50, 6),
(104, 'Neha', 'EC', 7.65, 1),
(105, 'Meera', 'EE', 5.52, 2),
(106, 'Mahesh', 'EC', 4.50, 3);

	Select * From Student_INFO
--Part – A:
--Views (First create a view then display all views)

--1. Create a view Personal with all columns.
	Create View Personal 
	As
	Select * From Student_INFO

--2. Create a view Student_Details having columns Name, Branch & SPI.
	Create View Student_Details 
	AS 
	Select Name,Branch, SPI 
	From Student_INFO

--3. Create a view AcademicData having columns RNo, Name, Branch.
	Create View AcademicData
	AS 
	Select RNO,Name,Branch
	From Student_INFO

--4. Create a view Student_ bklog having all columns but students whose bklog more than 2.
	Create View Student_bklog
	AS
	Select * From Student_INFO
	Where Bklog > 2

--5. Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four
--letters.
	Create View Student_Pattern 
	AS
	Select RNo,Name,Branch 
	From Student_INFO
	Where Name Like '____'

--6. Insert a new record to AcademicData view. (107, Meet, ME)
	Insert Into AcademicData Values
	(107,'Meet','ME')

--7. Update the branch of Amit from CE to ME in Student_Details view.
	Update Student_Details 
	Set Branch = 'ME'
	Where Name = 'Amit' and Branch = 'CE'

--8. Delete a student whose roll number is 104 from AcademicData view.
	Delete From AcademicData
	Where RNo = 104

--Part – B:

--1. Create a view that displays information of all students whose SPI is above 8.5
	Create View Student_SPI
	AS
	Select * From Student_INFO
	Where SPI > 8

	Select * From Student_SPI
--2. Create a view that displays 0 backlog students.
	Create View Student_NoBklog
	AS
	Select * From Student_INFO
	Where Bklog = 0
	
	Select * From Student_NoBklog

--3. Create a view Computerview that displays CE branch data only.	Create View ComputerView 	As	Select * from Student_INFO	Where Branch = 'CE'	Select * From ComputerView --Part – C:

--1. Create a view Result_EC that displays the name and SPI of students with SPI less than 5 of branch EC.
	Create View Result_EC
	AS
	Select Name,SPI
	From Student_INFO
	Where SPI < 5 and Branch = 'EC'

	Select * From Result_EC

--2. Update the result of student MAHESH to 4.90 in Result_EC view.
	Update Result_Ec
	Set SPI = 4.9
	Where Name = 'Mahesh'

--3. Create a view Stu_Bklog with RNo, Name and Bklog columns in which name starts with ‘M’ and having
--bklogs more than 5.
	Create View Stu_Bklog
	As 
	Select RNo,Name,Bklog
	From Student_INFO
	Where Name Like 'M%' and Bklog > 5
	
	Select * From Stu_Bklog
--4. Drop Computerview form the database
	Drop View ComputerView