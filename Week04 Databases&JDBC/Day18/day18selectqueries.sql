SELECT
	job_id,
    sum(salary) AS 'Sum Salary',
    max(salary) AS 'Max Salary',
    min(salary) AS 'Min Salary',
    round(avg(salary),2) AS 'Avg Salary'
from employees
WHERE department_id = 90
GROUP BY job_id;

SELECT 
	job_id,
    max(salary) AS 'Max Salary'
from employees
GROUP BY job_id
HAVING max(salary) >= 4000;