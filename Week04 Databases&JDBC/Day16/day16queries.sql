/*
create database day16;
*/

drop table countries;


CREATE TABLE IF NOT EXISTS countries(
COUNTRY_ID varchar(2),
COUNTRY_NAME varchar(40),
REGION_ID decimal(10,0)
);

DESC countries;

INSERT INTO countries VALUES('C2','India',1001);

INSERT INTO countries(country_id, country_name) VALUES('C2','India');

INSERT INTO countries(country_id) VALUES('C2');

INSERT INTO countries VALUES('C1','India', 1001), ('C2','United States', 1007), ('C3', 'United Kingdom', 1003);

select * from countries;
INSERT INTO country_new

/*
CREATE TABLE IF NOT EXISTS country_new
AS SELECT * FROM countries;
*/

SELECT * FROM country_new;

/*
select * from countries;
*/

/*
CREATE TABLE IF NOT EXISTS dup_countries
LIKE countries;
*/

/*
DESC dup_countries;
*/