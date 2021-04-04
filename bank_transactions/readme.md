# Programatic Transactions

This application is intended to perform programmatic transactions using spring framework. Please update the credentials located at `SpringPropTxsConfig.java`

Please create the following tables:

```sql
CREATE TABLE `deposit` (
  `accno` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `amount` int DEFAULT NULL,
  PRIMARY KEY (`accno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
```

Note: This was done using Mysql8

```sql
CREATE TABLE `withdraw` (
  `accno` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `amount` int DEFAULT NULL,
  PRIMARY KEY (`accno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
```

Note: This was done using Mysql8

Also insert the following data in order to use the provided API:

```sql
INSERT INTO withdraw VALUES(1, 'Ramesh', 1000);
INSERT INTO deposit VALUES(1, 'Balaji', 2000);
```

## API Usage

Execute the main method and use a API Client of your preference (Testing for this API has been done on Postman). Here's a list of the implemented controllers:

### /transactions

This is a list of endpoints for interacting with the transactions controller.

| Endpoint                          | Description                                             | Return Type |
| --------------------------------- | ------------------------------------------------------- | ----------- |
| `/{fromAccountId}/{toAccountId}/` | Withdraw and Deposit $100 from account A into account B | `void`      |
