CREATE TABLE wecare.caregiver (

 `caregiver_name` varchar(255) DEFAULT NULL,
 `caregiver_experience` varchar(255) DEFAULT NULL,
 `caregiver_specialization` varchar(255) DEFAULT 19000101,
 `caregiver_about` varchar(500) DEFAULT NULL,
 `caregiver_email` varchar(50) DEFAULT NULL,
 `caregiver_review` varchar(500) DEFAULT NULL,
 `caregiver_dob` varchar(14) DEFAULT NULL,
 `caregiver_contact_no` varchar(14) DEFAULT NULL,
 `address_id` int(11) default NULL,
 `login_id` int(11) default NULL,
 `caregiver_id` int(11) NOT NULL AUTO_INCREMENT,

 PRIMARY KEY (`caregiver_id`)
 );
 
 CREATE TABLE wecare.payment (
`payment_id` int(10) NOT NULL AUTO_INCREMENT,
`payment_amount` varchar(20) DEFAULT NULL,
`payment_type` varchar(20) DEFAULT NULL,
`client_id` int(10),
PRIMARY KEY (`payment_id`)	
);