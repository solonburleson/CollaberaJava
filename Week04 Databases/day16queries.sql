/*
create database day16;
*/

CREATE TABLE IF NOT EXISTS countries(
COUNTRY_ID varchar(2),
COUNTRY_NAME varchar(40),
REGION_ID decimal(10,0)
);


DESC countries;

/*
select * from countries;
*/

CREATE TABLE IF NOT EXISTS dup_countries
LIKE countries;

DESC dup_countries;