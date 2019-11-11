#1
CREATE SCHEMA IF NOT EXISTS employeesdb;

#2
CREATE TABLE IF NOT EXISTS employeesdb.departments(
	department_id int PRIMARY KEY,
    department_name VARCHAR(50)
);

#3
INSERT INTO departments VALUES(1,'ACCOUNTING'), (2, 'HR'), (3, 'DEVELOPMENT'), (4, 'SALES');

CREATE TABLE IF NOT EXISTS employeesdb.employees(
	employee_id int PRIMARY KEY,
    lastName VARCHAR(50) NOT NULL,
    firstName VARCHAR(50) NOT NULL,
    department_id int NOT NULL,
    FOREIGN KEY(department_id) REFERENCES departments(department_id)
);


#5
SELECT
	region_name AS 'Region Name', 
    MAX(country_name) AS 'Longest Country Name' 
FROM countries
JOIN regions USING (region_id)
GROUP BY region_id
ORDER BY region_name ASC;
