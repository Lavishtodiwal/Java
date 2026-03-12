-- emp101 table created
CREATE TABLE emp101 (
    emp_id NUMBER(5) PRIMARY KEY,
    emp_name VARCHAR2(50),
    salary NUMBER(10,2)
);


-- insert data into emp101
BEGIN
   FOR i IN 1..100 LOOP
      INSERT INTO emp101 (emp_id, emp_name, salary)
      VALUES (
         i,
         'Employee_' || i,
         2000 + (i * 50)   -- salary increases with ID
      );
   END LOOP;
   COMMIT;
END;
/

--STUDENT table created

CREATE TABLE student101 (
    student_id NUMBER(5) PRIMARY KEY,
    student_name VARCHAR2(50),
    salary NUMBER(10,2)
);


-- insert data into STUDENT

BEGIN
   FOR i IN 1..100 LOOP
      INSERT INTO student101 (student_id, student_name, salary)
      VALUES (
         i,
         'Student_' || i,
         1500 + (i * 40)   -- salary increases with ID
      );
   END LOOP;
   COMMIT;
END;
/

