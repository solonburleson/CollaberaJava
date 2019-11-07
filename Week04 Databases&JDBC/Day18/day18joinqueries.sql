#1
SELECT location_id, street_address, city, state_province, country_name
FROM locations
NATURAL JOIN countries;

#2 
SELECT first_name, last_name, department_id, department_name
from employees
JOIN departments USING (department_id);

#3
SELECT e.first_name, e.last_name, e.job_id, e.department_id, d.department_name, l.city
FROM employees e
JOIN departmentS d	
	ON (e.department_id = d.department_id)
JOIN locations l ON
	(d.location_id = l.location_id)
WHERE city = 'London';

#4
SELECT e.employee_id 'Emp_ID', e.last_name 'Employee', m.employee_id, m.last_name 'Manager'
from employees e
JOIN employees m	
	ON (e.manager_id = m.employee_id);

#5
SELECT e.first_name, e.last_name, e.hire_date
FROM employees e
JOIN employees j
	ON (j.last_name = 'Jones')
WHERE j.hire_date < e.hire_date;

#6 
SELECT department_name AS 'Department Name', count(employees.DEPARTMENT_ID) AS 'No of Employees'
FROM departments
INNER JOIN employees
ON employees.DEPARTMENT_ID = departments.DEPARTMENT_ID
GROUP BY departments.DEPARTMENT_ID
ORDER BY department_name;

#7
select jh.employee_id, j.job_title, jh.end_date-jh.start_date Days 
from job_history jh
INNER JOIN jobs j
on jh.JOB_ID = j.job_id
where jh.department_id = 90;

#8
SELECT d.department_id, d.department_name, d.manager_id, e.first_name
FROM departments d
INNER JOIN employees e
ON (d.manager_id = e.employee_id);

#9
SELECT d.department_name, e.first_name, l.city
FROM departments d
JOIN employees e	
	ON (d.manager_id = e.employee_id)
JOIN locations l USING (location_id);

#10
SELECT job_title, AVG(salary)
from employees
NATURAL JOIN jobs
GROUP BY job_title;

#11
SELECT job_title, first_name, salary - min_salary 'Salary - Min Salary'
FROM employees
NATURAL JOIN jobs;

#12
SELECT jh.* FROM job_history jh
JOIN employees e
WHERE e.salary > 10000;

#13
SELECT d.department_name, CONCAT(e.first_name, ' ', e.last_name) AS 'Manager Name', e.hire_date, e.salary
from departments d
JOIN employees e
	ON(D.MANAGER_ID = e.employee_id)
WHERE DATEDIFF(now(), e.hire_date)/365 > 15;