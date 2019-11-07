#1 
SELECT first_name, last_name FROM employees
WHERE salary > (SELECT salary FROM employees WHERE last_name = 'Bull');

#2
SELECT first_name, last_name
FROM employees
WHERE department_id
IN (SELECT department_id FROM departments WHERE department_name = 'IT');

#3
SELECT first_name, last_name FROM employees
WHERE manager_id IN (SELECT employee_id from employees where department_id in
					 (SELECT department_id from departments where location_id in
					  (SELECT location_id from locations where country_id = 'US')));