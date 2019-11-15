Create schema if not exists week5;

create table if not exists employees (
	id int Primary key auto_increment,
    firstName VARCHAR(50) not null,
    lastName VARCHAR(50) not null
);