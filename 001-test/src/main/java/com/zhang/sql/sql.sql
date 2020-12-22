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

 	SELECT e.id id,e.last_name last_name,e.gender gender,e.dp_id d_id,
		d.id did,d.dep_name dept_name FROM tbl_employee e,tbl_department d
		WHERE e.dp_id=d.id AND e.id=1

		select id,dep_name deptName from tbl_department where id=1
		SELECT * from tbl_employee WHERE id=1


		   	SELECT d.id did,d.dep_name dept_name,
				e.id eid,e.last_name last_name,e.email email,e.gender gender
		FROM tbl_department d
		LEFT JOIN tbl_employee e
		ON d.id=e.dp_id
		WHERE d.id=1