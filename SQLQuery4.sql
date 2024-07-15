-- ALTER OPERATION
-- PART :- A
--1. Add two more columns City VARCHAR (20) and Pincode INT.
	ALTER TABLE DEPOSIT
	ADD CITY VARCHAR(20),PINCODE INT

	SELECT * FROM DEPOSIT
--2. Change the size of CNAME column from VARCHAR (50) to VARCHAR (35).
	ALTER TABLE DEPOSIT
	ALTER COLUMN CNAME VARCHAR(35)

	SELECT * FROM DEPOSIT
--3. Change the data type DECIMAL to INT in amount Column.
	ALTER TABLE DEPOSIT
	ALTER COLUMN AMOUNT INT 

	SELECT * FROM DEPOSIT 
--4. Rename Column ActNo to ANO.
	SP_RENAME 'DEPOSIT.ACTNO' , ANO

	SELECT * FROM DEPOSIT
--5. Delete Column City from the DEPOSIT table.
	ALTER TABLE DEPOSIT 
	DROP COLUMN CITY

	SELECT * FROM DEPOSIT
--6. Change name of table DEPOSIT to DEPOSIT_DETAIL.
	SP_RENAME 'DEPOSIT' , 'DEPOSIT_DETAIL'

	SELECT * FROM DEPOSIT_DETAIL


-- PART :- B
--1. Rename Column ADATE to AOPENDATE OF DEPOSIT_DETAIL table.
	SP_RENAME 'DEPOSIT_DETAIL.ADATE' , 'AOPENDATE'

	SELECT * FROM DEPOSIT_DETAIL
--2. Delete Column AOPENDATE from the DEPOSIT_DETAIL table.
	ALTER TABLE DEPOSIT_DETAIL
	DROP COLUMN AOPENDATE

	SELECT * FROM DEPOSIT_DETAIL
--3. Rename Column CNAME to CustomerName.
	SP_RENAME 'DEPOSIT_DETAIL.CNAME' , 'CUSTOMERNAME'

		SELECT * FROM DEPOSIT_DETAIL

-- PART :- C

	CREATE TABLE STUDENT_DETAIL(
	Enrollment_No VARCHAR(20),
	Name VARCHAR(25),
	CPI DECIMAL(5,2),
	Birthdate DATETIME
	);
	INSERT INTO STUDENT_DETAIL VALUES
	(23010101045,'JASMIN',9,'2006-8-8'),
	(23010101256,'HARSHIL',9,'2006-10-26'),
	(23010101145,'VIRAJ',9,'2006-8-18')

	

--1. Add two more columns City VARCHAR (20) (Not null) and Backlog INT (Null).
	ALTER TABLE STUDENT_DETAIL
	ADD CITY VARCHAR(20) NOT NULL DEFAULT 'RAJKOT' , BACKLOG INT NOT NULL DEFAULT 1

	SELECT * FROM STUDENT_DETAIL
	
--2. Change the size of NAME column of student_detail from VARCHAR (25) to VARCHAR (35).
	
--3. Change the data type DECIMAL to INT in CPI Column.
--4. Rename Column Enrollment_No to ENO.
--5. Delete Column City from the student_detail table.
--6. Change name of table student_detail to STUDENT_MASTER.
	DELETE FROM DEPOSIT_DETAIL
	WHERE AMOUNT >= 4000

	SELECT * FROM DEPOSIT_DETAIL
--2. Delete all the accounts CHANDI BRANCH.
	DELETE FROM DEPOSIT_DETAIL
	WHERE BNAME = 'CHANDI'

	SELECT * FROM DEPOSIT_DETAIL
--3. Delete all the accounts having account number (ANO) is greater than 105.
	DELETE FROM DEPOSIT_DETAIL
	WHERE ANO > 105

	SELECT * FROM DEPOSIT_DETAIL
--4. Delete all the records of Deposit_Detail table. (Use Truncate)
	TRUNCATE TABLE DEPOSIT_DETAIL
--5. Remove Deposit_Detail table. (Use Drop)
	DROP TABLE DEPOSIT_DETAIL

-- PART :- B
	
	CREATE TABLE EMPLOYEE_MASTER(
		EmpNo INT,
		EmpName VARCHAR(25),
		JoiningDate DATETIME,
		Salary DECIMAL (8,2),
		City VARCHAR(20)
	);
	INSERT INTO EMPLOYEE_MASTER VALUES
	(101, 'Keyur', '2002-1-5' ,12000 ,'Rajkot'),
	(102, 'Hardik', '2004-2-15', 14000, 'Ahmedabad'),
	(103, 'Kajal', '2006-3-14', 15000, 'Baroda'),
	(104 ,'Bhoomi', '2005-6-23', 12500, 'Ahmedabad'),
	(105,'Harmit', '2004-2-15', 14000 ,'Rajkot'),
	(106, 'Mitesh' ,'2001-9-25' ,5000 ,'Jamnagar'),
	(107 ,'Meera', Null ,7000,'Morbi'),
	(108 ,'Kishan' ,'2003-2-6', 10000,  NULL)

	SELECT * FROM EMPLOYEE_MASTER

--1. Delete all the records of Employee_MASTER table having salary greater than and equals to 14000.
	DELETE FROM EMPLOYEE_MASTER 
	WHERE SALARY >= 14000
--2. Delete all the Employees who belongs to �RAJKOT� city.
	DELETE FROM EMPLOYEE_MASTER 
	WHERE CITY = 'RAJKOT'
--3. Delete all the Employees who joined after 1-1-2007.
	DELETE FROM EMPLOYEE_MASTER 
	WHERE JOININGDATE > '2007-1-1'
--4. Delete the records of Employees whose joining date is null and Name is not null.
	DELETE FROM EMPLOYEE_MASTER
	WHERE JOININGDATE IS NULL AND EMPNAME IS NOT NULL
--5. Delete the records of Employees whose salary is 50% of 20000.
	DELETE FROM EMPLOYEE_MASTER
	WHERE SALARY = 20000*0.5
--6. Delete the records of Employees whose City Name is not empty.
	DELETE FROM EMPLOYEE_MASTER
	WHERE CITY IS NOT NULL
--7. Delete all the records of Employee_MASTER table. (Use Truncate)
	TRUNCATE TABLE EMPLOYEE_MASTER
--8. Remove Employee_MASTER table. (Use Drop)