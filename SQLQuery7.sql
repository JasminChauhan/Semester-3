	CREATE TABLE EMP(
		EID INT,
		EName VARCHAR(50),
		Department VARCHAR(50), 
		Salary INT,
		JoiningDate DATE,
		City VARCHAR(20)
	);

	INSERT INTO EMP(EID ,EName, Department, Salary, JoiningDate, City) VALUES
	(101 ,'Rahul', 'Admin', 56000, '1990-Jan-1' ,'Rajkot'),
	(102, 'Hardik', 'IT', 18000 ,'1990-Sep-25', 'Ahmedabad'),
	(103, 'Bhavin', 'HR', 25000, '1991-May-14', 'Baroda'),
	(104, 'Bhoomi' ,'Admin', 39000 ,'1991-Feb-8', 'Rajkot'),
	(105, 'Rohit', 'IT' ,17000 ,'1990-Jul-23' ,'Jamnagar'),
	(106, 'Priya', 'IT',9000 ,'1990-Oct-18', 'Ahmedabad'),
	(107, 'Bhoomi', 'HR', 34000 ,'1991-Dec-25', 'Rajkot')

	SELECT * FROM EMP


-- LAB:- 7
--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
	SELECT MAX(SALARY) AS MAX_SALARY , MIN(SALARY) AS MIN_SALARY
	FROM EMP
--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal,
--respectively.
	SELECT SUM(SALARY) AS TOTAL_SALARY , AVG(SALARY) AS AVERAGE_SALARY
	FROM EMP 
--3. Find total number of employees of EMPLOYEE table.
	SELECT COUNT(ENAME) AS TOTAL_EMPLOYEES
	FROM EMP
--4. Find highest salary from Rajkot city.
	SELECT MAX(SALARY) AS MAX_SALARY_RAJKOT
	FROM EMP 
	WHERE CITY = 'RAJKOT'
--5. Give maximum salary from IT department.
	SELECT MAX(SALARY) AS MAX_SALARY_IT
	FROM EMP 
	WHERE DEPARTMENT = 'IT'
--6. Count employee whose joining date is after 8-feb-91.
	SELECT COUNT(ENAME)
	FROM EMP 
	WHERE JOININGDATE > '1991-FEB-8'
--7. Display average salary of Admin department.
	SELECT AVG(SALARY) AS AVERAGE_SALARY_ADMIN
	FROM EMP 
	WHERE DEPARTMENT = 'ADMIN'
--8. Display total salary of HR department.
	SELECT SUM(SALARY) AS TOTAL_SALARY_HR
	FROM EMP 
	WHERE DEPARTMENT = 'HR'
--9. Count total number of cities of employee without duplication.
	SELECT COUNT(DISTINCT CITY)
	FROM EMP
--10. Count unique departments.
	SELECT COUNT(DISTINCT DEPARTMENT)
	FROM EMP
--11. Give minimum salary of employee who belongs to Ahmedabad.
	SELECT MIN(SALARY) AS MIN_SALARY_AHMEDABAD
	FROM EMP 
	WHERE CITY = 'AHMEDABAD'
--12. Find city wise highest salary.
	SELECT CITY , MAX(SALARY) AS MAX_SALARY
	FROM EMP
	GROUP BY CITY
--13. Find department wise lowest salary.
	SELECT DEPARTMENT , MIN(SALARY) AS MIN_SALARY
	FROM EMP 
	GROUP BY DEPARTMENT 
--14. Display city with the total number of employees belonging to each city.
	SELECT CITY , COUNT(ENAME) AS TOTAL_EMPLOYEES
	FROM EMP 
	GROUP BY CITY
--15. Give total salary of each department of EMP table.
	SELECT DEPARTMENT , SUM(SALARY) AS TOTAL_SALARY
	FROM EMP
	GROUP BY DEPARTMENT
--16. Give average salary of each department of EMP table without displaying the respective department
--name.
	SELECT AVG(SALARY) AS AVG_SALARY
	FROM EMP 
	GROUP BY DEPARTMENT 


-- PART:- B
--1. Count the number of employees living in Rajkot.
	SELECT COUNT(ENAME) AS TOTAL_EMPLOYEES_RAJKOT
	FROM EMP 
	WHERE CITY = 'RAJKOT'
--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
	SELECT MAX(SALARY) AS MAX_SALARY , MIN(SALARY) AS MIN_SALARY , MAX(SALARY) - MIN(SALARY) AS DIFFERENCE 
	FROM EMP 
--3. Display the total number of employees hired before 1st January, 1991.	SELECT COUNT(ENAME)	FROM EMP 	WHERE JOININGDATE < '1991-JAN-1'-- PART :- C--1. Count the number of employees living in Rajkot or Baroda.
	SELECT COUNT(ENAME)
	FROM EMP 
	WHERE CITY IN ('RAJKOT','BARODA')
--2. Display the total number of employees hired before 1st January, 1991 in IT department.
	SELECT COUNT(ENAME)
	FROM EMP
	WHERE JOININGDATE < '1991-JAN-1' OR DEPARTMENT = 'IT'
--3. Find the Joining Date wise Total Salaries.
	SELECT JOININGDATE , SUM(SALARY)
	FROM EMP
	GROUP BY JOININGDATE 
--4. Find the Maximum salary department & city wise in which city name starts with ‘R’.
	SELECT DEPARTMENT , CITY,  MAX(SALARY)
	FROM EMP
	WHERE CITY LIKE 'R%'
	GROUP BY DEPARTMENT , CITY