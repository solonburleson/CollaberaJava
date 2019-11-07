#1
ALTER TABLE countries RENAME country_new;

#2
ALTER TABLE locations
ADD region_id INT;

desc locations;

ALTER TABLE locations
DROP COLUMN region_id;

#3
ALTER TABLE locations
ADD ID INT FIRST;

desc locations;

ALTER TABLE locations
DROP COLUMN ID;

#4
ALTER TABLE locations
ADD region_id INT
AFTER state_province;

desc locations;

ALTER TABLE locations
DROP COLUMN region_id;

#5
ALTER TABLE locations
MODIFY country_id INT;

desc locations;

#6
ALTER TABLE locations
DROP city;

desc locations;

ALTER TABLE locations
ADD city varchar(30);

#7
ALTER TABLE locations
DROP state_province,
ADD state varchar(25)
AFTER city;

desc locations;

#8
ALTER TABLE locations
ADD PRIMARY KEY(location_id);

ALTER TABLE locations DROP PRIMARY KEY;

#9
ALTER TABLE locations
ADD PRIMARY KEY(location_id,country_id);

#10
ALTER TABLE locations DROP PRIMARY KEY;

#11
ALTER TABLE job_history ADD FOREIGN KEY(job_id) REFERENCES jobs(job_id); 

#12
ALTER TABLE job_history ADD CONSTRAINT fk_job_id FOREIGN KEY(job_id)
REFERENCES jobs(job_id) ON UPDATE RESTRICT ON DELETE CASCADE;

#13
ALTER TABLE job_history DROP FOREIGN KEY fk_job_id;

#14
ALTER TABLE job_history
ADD INDEX indx_job_id(job_id);

#15
ALTER TABLE job_history DROP INDEX indx_job_id;