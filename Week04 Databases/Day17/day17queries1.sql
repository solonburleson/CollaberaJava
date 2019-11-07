CREATE TABLE IF NOT EXISTS departments ( 
	DEPARTMENT_ID integer NOT NULL,
    DEPARTMENT_NAME varchar(30) NOT NULL,
    MANAGER_ID integer NOT NULL,
    LOCATION_ID integer DEFAULT NULL,
    PRIMARY KEY (department_id,manager_id)
);

insert into departments value(60,'SALES',201,89);
insert into departments value(61,'ACCOUNTS',201,89);
insert into departments value(80,'FINANCE',211,90);

select * from departments;

CREATE TABLE IF NOT EXISTS employees (
	EMPLOYEE_ID integer NOT NULL PRIMARY KEY,
    FIRST_NAME varchar(20) DEFAULT NULL,
    LAST_NAME varchar(25) NOT NULL,
    JOB_ID varchar(10) NOT NULL,
    SALARY decimal(8,2) DEFAULT NULL,
    MANAGER_ID integer NOT NULL,
    DEPARTMENT_ID integer NOT NULL,
    FOREIGN KEY(DEPARTMENT_ID,MANAGER_ID)
    REFERENCES departments(DEPARTMENT_ID,MANAGER_ID)
);

INSERT INTO employees VALUES(510,'Alex','Hanes','CLERK',18000,201,60);
INSERT INTO employees VALUES(511,'Kim','Leon','CLERK',18000,211,80);
INSERT INTO employees VALUES(512,'Joe','Doe','IT',18000,333,88);

select * from employees;