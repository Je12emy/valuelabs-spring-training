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

# Notes

- Don't update the Hibernate ORM dependency, else the application won't work!.
- If you are following Valuelab's training exercise, please check the `pom.xml` since a few dependencies had to be removed in order for this application to work (`Spring.Context`). You may also use Hibernate 5 instead of Hibernate 3!. Also a workaround was needed in the `SpringBootApplication` decorator read more [here](https://stackoverflow.com/questions/42476261/classcastexception-org-springframework-orm-jpa-entitymanagerholder-cannot-be-ca)
