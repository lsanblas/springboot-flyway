CREATE TABLE PERSON (
	id BIGINT GENERATED BY DEFAULT AS IDENTITY,
	first_name varchar(255) not null,
	last_name varchar(255) not null
);

create sequence person_sequence start with 1 increment by 1;

insert into PERSON (first_name, last_name) values ('John', 'Smith');