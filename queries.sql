CREATE DATABASE expense;

USE expense;

CREATE TABLE expenses
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    expense_name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    expense_amount DOUBLE(5, 2) NOT NULL,
    category VARCHAR(255) NOT NULL,
    date DATE NOT NULL,
	created_at DATE NOT NULL,
    updated_at DATE NOT NULL,
    user_id bigint NOT NULL,
    PRIMARY KEY (`id`),
	CONSTRAINT `FK_USER_ID` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE
);


USE expense;

CREATE DATABASE expense;
CREATE TABLE users (
  id INT NOT NULL AUTO_INCREMENT,  
  email varchar(255) DEFAULT NULL,
  name varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  age bigint DEFAULT NULL,
  created_at datetime(6) NOT NULL,
  updated_at datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_EMAIL` (`email`)
);
