CREATE SCHEMA wecare;
CREATE TABLE wecare.cust (
  `customer_name` varchar(255) DEFAULT NULL,
  `customer_city` varchar(255) DEFAULT NULL,
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`customer_id`)
);

CREATE TABLE wecare.login (
`login_id` int(10) NOT NULL AUTO_INCREMENT,
`username` varchar(50) DEFAULT NULL,
  `password` varchar (50) default NULL,
  `is_locked` varchar (10) default NULL,
  PRIMARY KEY (`login_id`)
);

CREATE TABLE wecare.manager (

 `manager_name` varchar(255) DEFAULT NULL,
 `manager_email` varchar(255) DEFAULT NULL,
 `manager_dob` varchar(255) DEFAULT 19000101,
 `address_id` int(11) DEFAULT NULL,
 `manager_contact_no` varchar(14) DEFAULT NULL,
 `login_id` int(11) default NULL,
 `manager_id` int(11) NOT NULL AUTO_INCREMENT,

 PRIMARY KEY (`manager_id`)
 );
 
 CREATE TABLE wecare.client_schedule (

 `clientId` int(11) default NULL,
 `client_Schedule_Id` int(11) NOT NULL AUTO_INCREMENT,

 PRIMARY KEY (`client_Schedule_Id`)
 );