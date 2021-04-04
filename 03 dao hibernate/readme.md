# Spring-DAO

This application is intended to perform Data Access Object (DAO) operations using pure JDBC API. This example includes all types of wirings such as Explicit Wiring, Auto Wiring Annotaton Based Wiring and Autodiscovery. All these wirings will be explained in both Xml Based Configuration and Java Based Configuration.

Please create a database named: `value_spring` or change the credentials in the `applicationContext.xml` files and create the following table.

```sql
CREATE TABLE `customer` (
  `cno` int NOT NULL,
  `cname` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` bigint DEFAULT NULL,
  PRIMARY KEY (`cno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci |
```

Note: This project was done using Mysql 8.
