CREATE TABLE IF NOT EXISTS jobs(
	job_id		varchar(10) 	NOT NULL,
	job_title 	varchar(35) 	NOT NULL,
	min_salary 	decimal(6,0),
	max_salary 	decimal(6,0)
	CHECK(max_salary <= 25000)
);

/*
INSERT INTO jobs(job_id, job_title, min_salary, max_salary)
VALUES('QQ', 'ADMIN', 1000, 30000);
*/

DESC jobs;
SELECT * FROM jobs;