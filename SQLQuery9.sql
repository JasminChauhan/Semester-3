--Sub Queries--

CREATE TABLE Stu_Detail (
    Rno INT,
    Name VARCHAR(50),
    City VARCHAR(50),
    DID INT,
);

INSERT INTO Stu_Detail (Rno, Name, City, DID) VALUES
(101, 'Raju', 'Rajkot', 10),
(102, 'Amit', 'Ahmedabad', 20),
(103, 'Sanjay', 'Baroda', 40),
(104, 'Neha', 'Rajkot', 20),
(105, 'Meera', 'Ahmedabad', 30),
(106, 'Mahesh', 'Baroda', 10);

CREATE TABLE Academic (
    Rno INT,
    SPI DECIMAL(3, 1),
    Bklog INT
);

INSERT INTO Academic (Rno, SPI, Bklog) VALUES
(101, 8.8, 0),
(102, 9.2, 2),
(103, 7.6, 1),
(104, 8.2, 4),
(105, 7.0, 2),
(106, 8.9, 3);

CREATE TABLE Department (
    DID INT,
    DName VARCHAR(50)
);

INSERT INTO Department (DID, DName) VALUES
(10, 'Computer'),
(20, 'Electrical'),
(30, 'Mechanical'),
(40, 'Civil');

--Part – A:
--1. Display details of students who are from computer department.
	Select *
		from Stu_Detail
		Where DID IN (
			Select DID 
			from Department 
			where Dname = 'Computer'
		) 
--2. Displays name of students whose SPI is more than 8.
	Select Name 
		from Stu_Detail
		where Rno IN (
			Select Rno
			from Academic 
			where SPI > 8
		)
--3. Display details of students of computer department who belongs to Rajkot city.
	Select *
		from Stu_Detail
		Where DID IN (
			Select DID 
			from Department 
			where Dname = 'Computer' and City = 'Rajkot'
		) 
--4. Find total number of students of electrical department.
	Select COUNT(Rno) AS Total_Student_Electrical
		from Stu_Detail
		Where DID IN (
			Select DID 
			from Department 
			where Dname = 'Electrical'
		) 
--5. Display name of student who is having maximum SPI.
	Select Name 
		From Stu_Detail
		Where Rno = (
			Select RNo 
			from Academic
			Where Spi = (
				Select MAX(Spi)
				From Academic
		) 
	)
------------------------- Or --------------------
	Select Name 
		from Stu_Detail
		Where Rno In (
			Select Top 1 rno
			from Academic
			Order By Spi DESC
		)
--6. Display details of students having more than 1 backlog.	Select * 		from Stu_Detail		Where Rno In (			Select Rno 				from Academic 				Where Bklog > 1		)--Part – B:
--1. Display name of students who are either from computer department or from mechanical department.
	Select Name 
		from Stu_Detail
		where DID IN (
			Select DID 
				From Department 
				Where DName IN ('Computer' , 'Mechanical')
		)
--2. Display name of students who are in same department as 102 studying in.	Select Name		from Stu_Detail		Where DID = (			Select DID			From Stu_Detail			Where rno = 102		)--Part – C:
--1. Display name of students whose SPI is more than 9 and who is from electrical department.
	Select Name 
		From Stu_Detail
		Where Rno In (
			Select Rno 
				from Academic 
				Where Spi > 9
		) AND 
		DID IN (
			Select DID 
			From Department 
			Where DName = 'Electrical'
		)	
--2. Display name of student who is having second highest SPI.
	Select  Top 1 Name 
		from Stu_Detail
		Where Rno In (
			Select Top 2 RNo
			from Academic
			Order By Spi DESC
		)
		Order By Rno Desc
		

--3. Display city names whose students branch wise SPI is 9.2		Select City 		From Stu_Detail		Where rno in (			Select Rno , AVG(Spi)			FRom Academic 			Group By Rno		) 		--SET Operators
--Part – A:

CREATE TABLE Computer (
    RollNo INT,
    Name VARCHAR(50)
);

INSERT INTO Computer (RollNo, Name) VALUES
(101, 'Ajay'),
(109, 'Haresh'),
(115, 'Manish');

CREATE TABLE Electrical (
    RollNo INT PRIMARY KEY,
    Name VARCHAR(50)
);

INSERT INTO Electrical (RollNo, Name) VALUES
(105, 'Ajay'),
(107, 'Mahesh'),
(115, 'Manish');

--1. Display name of students who is either in Computer or in Electrical.
	Select Name from Computer 
	Union 
	Select Name from Electrical
--2. Display name of students who is either in Computer or in Electrical including duplicate data.
	Select Name from Computer 
	Union all 
	Select Name from Electrical
--3. Display name of students who is in both Computer and Electrical.
	Select Name from Computer 
	Intersect 
	Select Name from Electrical
--4. Display name of students who are in Computer but not in Electrical.
	Select Name from Computer 
	Except 
	Select Name from Electrical
--5. Display name of students who are in Electrical but not in Computer.
	Select Name from Electrical 
	Except 
	Select Name from Computer
--6. Display all the details of students who are either in Computer or in Electrical.
	Select * from Computer
	Union 
	Select * from Electrical
--7. Display all the details of students who are in both Computer and Electrical.	Select * from Computer 	Intersect	Select * from Electrical