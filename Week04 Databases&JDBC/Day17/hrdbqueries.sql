#1
#UPDATE employees SET email = 'AVAILABLE'
UPDATE employees SET email = concat(substring(first_name,1,1),UPPER(last_name))
WHERE employee_id = 205;

select * from employees;

#2

UPDATE employees SET email = 'not available', commission_pct = 0.10
WHERE employee_id = 205;

select * from employees WHERE employee_id = 205;

#3

UPDATE employees SET commission_pct = 0.10
WHERE department_id = 110;

select * from employees WHERE department_id = 110;

#4

UPDATE employees SET commission_pct = 0.10
WHERE department_id = 80 AND commission_pct < 0.20;

SELECT * FROM employees WHERE department_id = 80;

#5
UPDATE employees SET commission_pct = 0.10
WHERE department_id = (SELECT department_id from departments WHERE department_name = 'ACCOUNTING');

SELECT * FROM employees WHERE department_id = (SELECT department_id from departments WHERE department_name = 'ACCOUNTING');

#6

UPDATE employees SET SALARY = 8000
WHERE employee_id = 105 AND SALARY < 5000;

SELECT * FROM employees WHERE employee_id = 105;

#7

UPDATE employees SET job_id = 'SH_CLERK'
WHERE
	employee_id		= 118 AND
    department_id	= 30 AND 
    NOT JOB_ID		LIKE 'SH%';
    
SELECT * FROM employees WHERE employee_id = 118;

#8

UPDATE employees 
SET SALARY = 
	CASE department_id
		WHEN department_id = 40 THEN SALARY * 1.40
		WHEN department_id = 90 THEN SALARY * 1.15
		WHEN department_id = 110 THEN SALARY * 1.10
		ELSE SALARY
	END;

select * from employees WHERE department_id in (40,90,110);

#9

select * from employees WHERE employees.JOB_ID = 'PU_CLERK';
UPDATE employees, jobs
SET jobs.MIN_SALARY          = jobs.MIN_SALARY + 2000,
	jobs.MAX_SALARY          = jobs.MAX_SALARY + 2000,
	employees.SALARY         = employees.SALARY* 1.2,
    employees.COMMISSION_PCT = employees.COMMISSION_PCT * 1.1
WHERE employees.JOB_ID = 'PU_CLERK' AND
	  jobs.job_id = 'PU_CLERK';