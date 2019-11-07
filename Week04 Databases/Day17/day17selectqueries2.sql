select 
	manager_id, 
    min(SALARY) 
from employees
GROUP BY manager_id;

select
	job_id,
	avg(salary)
from employees
where job_id != 'IT_PROG'
group by job_id;