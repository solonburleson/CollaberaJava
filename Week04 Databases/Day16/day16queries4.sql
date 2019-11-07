/*
CREATE TABLE IF NOT EXISTS job_history (
	EMPLOYEE_ID decimal(6,0) NOT NULL,
    START_DATE date NOT NULL,
    END_DATE date NOT NULL,
    CHECK(END_DATE LIKE '--/--/----'),
    JOB_ID varchar(10) NOT NULL,
    DEPARTMENT_ID decimal(4,0) NOT NULL
);
desc job_history;
*/
/*
drop table countries;
CREATE TABLE IF NOT EXISTS countries ( 
	COUNTRY_ID varchar(2) NOT NULL,
    COUNTRY_NAME varchar(40) NOT NULL,
    REGION_ID decimal(10,0) NOT NULL,
    UNIQUE(COUNTRY_ID)
);
desc countries;
*/
CREATE TABLE IF NOT EXISTS jobs (
	JOB_ID varchar(10) NOT NULL UNIQUE,
    JOB_TITLE varchar(35) NOT NULL DEFAULT ' ',
    MIN_SALARY decimal(6,0) DEFAULT 8000,
    MAX_SALARY decimal(6,0) DEFAULT NULL
);

/*
INSERT into jobs(job_id) values('QQ');
*/
select * from jobs;
/*
drop table countries;
CREATE TABLE IF NOT EXISTS countries ( 
	COUNTRY_ID int NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
    COUNTRY_NAME varchar(40) NOT NULL,
    REGION_ID decimal(10,0) NOT NULL
);
*/
/*
INSERT INTO countries(country_name, region_id)
VALUES('BB', 33);
*/
select * from countries;

/*
drop table job_history;
*/
CREATE TABLE IF NOT EXISTS job_history (
	EMPLOYEE_ID decimal(6,0) NOT NULL UNIQUE,
    START_DATE date NOT NULL,
    END_DATE date NOT NULL,
    CHECK(END_DATE LIKE '--/--/----'),
    JOB_ID varchar(10) NOT NULL,
    DEPARTMENT_ID decimal(4,0) NOT NULL,
    foreign key(job_id) REFERENCES jobs(job_id)
);

desc job_history;

INSERT INTO countries VALUES('','');