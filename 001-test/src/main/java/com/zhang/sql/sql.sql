CREATE TABLE tbl_employee(
  id int PRIMARY KEY auto_increment,
	last_name VARCHAR(255),
	gender char(1),
	email VARCHAR(255)

)ENGINE=INNODB DEFAULT CHARSET=utf8;




CREATE TABLE tbl_department(
   id int PRIMARY key auto_increment,
	 dep_name VARCHAR(100)

)ENGINE=INNODB DEFAULT CHARSET=utf8;

ALTER TABLE tbl_employee add COLUMN dp_id int(11);

ALTER TABLE tbl_employee add CONSTRAINT fk Foreign KEY (dp_id) REFERENCES
tbl_department(id)

DESC tbl_employee;