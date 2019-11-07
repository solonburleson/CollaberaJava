#1
SELECT first_name, last_name, salary
FROM employees
WHERE salary NOT BETWEEN 10000 AND 15000;

#2
SELECT first_name, last_name, department_id
FROM employees
WHERE department_id in (30, 100)
ORDER BY department_id ASC;

#3
SELECT first_name, last_name, salary, department_id
FROM employees
WHERE salary NOT BETWEEN 10000 AND 15000
AND department_id IN (30, 100);

#4 
SELECT first_name, last_name, hire_date
from employees
WHERE YEAR(hire_date) = 1987;

#5
SELECT first_name
FROM employees
WHERE first_name LIKE '%b%'
AND first_name LIKE '%c%';

#6
SELECT last_name, job_id, salary
FROM employees
WHERE job_id IN ('IT_PROG', 'SH_CLERK')
AND salary NOT IN (4500,10000);

#7
SELECT last_name FROM employees WHERE last_name LIKE '______';
SELECT last_name FROM employees WHERE length(last_name) = 6;

#8
SELECT last_name FROM employees WHERE last_name LIKE '__e%';
SELECT last_name FROM employees WHERE substring(last_name,3,1) = 'e';

#9
SELECT DISTINCT job_id FROM employees;

#10
SELECT first_name, last_name, salary, salary * .15 AS PercentSalary FROM employees;

#11
SELECT * FROM employees WHERE last_name IN ('JONES', 'BLAKE', 'SCOTT','KING', 'FORD');