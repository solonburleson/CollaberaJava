#1
SELECT job_id, GROUP_CONCAT(employee_id, ' ') 'Employees ID'
FROM employees GROUP BY job_id;

#2
UPDATE employees
SET phone_number = REPLACE(phone_number, '124', '999')
WHERE phone_number LIKE '%124%';

#3
SELECT * 
FROM employees 
WHERE LENGTH(FIRST_NAME) >= 8;

#4
SELECT job_id, LPAD(max_salary,7,'0') 'Max Salary', LPAD(min_salary,7,'0') 'Min Salary'
from jobs;

#5
UPDATE employees SET email = CONCAT(email, '@example.com');

#6
SELECT employee_id, first_name, MID(hire_date,6,2) as hire_month FROM employees;

#7
SELECT employee_id, REVERSE(SUBSTR(REVERSE(email),4)) as email_id
from employees;