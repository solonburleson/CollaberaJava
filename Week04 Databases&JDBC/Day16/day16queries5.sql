CREATE TABLE IF NOT EXISTS jobs (
	JOB_ID varchar(10) NOT NULL UNIQUE,
    JOB_TITLE varchar(35) NOT NULL,
    MIN_SALARY decimal(6,0)
);

insert into jobs values(1001,'OFFICER', 8000);

select * from jobs;

drop table countries;

CREATE TABLE IF NOT EXISTS countries (
	COUNTRY_ID integer NOT NULL auto_increment PRIMARY KEY,
    COUNTRY_NAME varchar(35) NOT NULL,
    REGION_ID integer NOT NULL
);

INSERT INTO countries(COUNTRY_NAME,REGION_ID) VALUES('India',105);

select * from countries;

drop table countries;

CREATE TABLE IF NOT EXISTS countries (
	COUNTRY_ID integer NOT NULL auto_increment PRIMARY KEY,
    COUNTRY_NAME varchar(35) NOT NULL DEFAULT 'N/A',
    REGION_ID integer NOT NULL
);

INSERT INTO countries(COUNTRY_NAME,REGION_ID) VALUES('India',105);

INSERT INTO countries(Region_ID) values(109);

select * from countries;

drop table jobs;

CREATE TABLE IF NOT EXISTS jobs (
	JOB_ID integer NOT NULL UNIQUE PRIMARY KEY,
    JOB_TITLE varchar(35) NOT NULL DEFAULT ' ',
    MIN_SALARY decimal(6,0) DEFAULT 8000,
    MAX_SALARY decimal(6,0) DEFAULT 20000
);

insert into jobs(job_id,job_title) values(1001,'OFFICER');
insert into jobs(job_id,job_title) values(1002,'CLERK');

select * from jobs;

/*
CREATE TABLE job_history (
	EMPLOYEE_ID integer NOT NULL PRIMARY KEY,
    JOB_ID integer NOT NULL,
    DEPARTMENT_ID integer DEFAULT NOT NULL,
    FOREIGN KEY (job_id) REFERENCES jobs(job_id)
);
*/