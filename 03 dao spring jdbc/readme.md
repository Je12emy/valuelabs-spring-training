# Spring-DAO

This application is intended to perform database operations using JdbcTemplate. This application also includes “Annotation Based Wiring”..

Please create a database named: `value_spring` or change the credentials in the `SpringDaoConfig.java` file and create the following table.

```sql
CREATE TABLE `employee` (
  `eno` int NOT NULL,
  `ename` varchar(100) DEFAULT NULL,
  `desig` varchar(100) DEFAULT NULL,
  `sal` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`eno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_cii
```

Note: This project was done using Mysql 8.
