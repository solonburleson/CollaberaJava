#1
SELECT 
	first_name AS 'First Name',
    last_name AS 'Last Name'
from employees;

#2
SELECT DISTINCT department_id FROM employees;

#3
SELECT *
	FROM employees
    ORDER BY first_name;
    
#4
SELECT 
	first_name, 
    last_name, 
    salary, 
    salary *.15 AS 'PF'
FROM employees;

#5
SELECT first_name, last_name, salary
FROM employees
ORDER BY salary ASC;

#6
SELECT sum(salary) AS TotalSalary from employees;

#7
SELECT
	min(salary) AS 'MinSalary',
    max(salary) AS 'MaxSalary'
from employees;

#8
SELECT
	avg(salary) AS 'AvgSalary',
    count(employee_id) AS 'Employee Count'
from employees;

#9
SELECT count(*) 'Count' FROM employees;

#10
SELECT count(DISTINCT job_id) AS 'Distinct Jobs' from employees;

#11
SELECT UPPER(first_name) from employees;

#17
SELECT * from employees WHERE first_name REGEXP '[0-9]';
SELECT * from employees WHERE first_name REGEXP '^sh'; #begins with sh
SELECT * from employees WHERE first_name REGEXP 'th$'; #ends with th
SELECT * from employees WHERE first_name REGEXP 'en$|th$'; # end with en or th

#18
select employee_id, first_name from employees limit 10;

#19
select first_name, last_name, round(salary/12,2) as 'Monthly Salary'
	from employees;