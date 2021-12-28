# NewsPaperBillingSystem

Requirements:

Netbeans: Version 12.0
JDK: Version 14.0.2
MySQL: Version >=8.0

Steps:
1.Go to the master branch:
2.Download the zip
3.Open Netbeans & Import Project using ZIP file
3.Create the database in your local MySQL Server with name "billingsystem"
5.Then create following tables with respective attributes

mysql> show tables;
+-------------------------+
| Tables_in_billingsystem |
+-------------------------+
| admin                   |
| customer                |
| customer_newspaper      |
| newspaper               |
+-------------------------+

mysql> describe admin;
+------------------+--------------+------+-----+---------+-------+
| Field            | Type         | Null | Key | Default | Extra |
+------------------+--------------+------+-----+---------+-------+
| admin_no         | int          | NO   | PRI | NULL    |       |
| admin_name       | varchar(100) | YES  |     | NULL    |       |
| admin_username   | varchar(30)  | YES  | UNI | NULL    |       |
| admin_password   | varchar(30)  | YES  |     | NULL    |       |
| admin_contact_no | varchar(10)  | YES  |     | NULL    |       |
| admin_email      | varchar(100) | YES  |     | NULL    |       |
| is_superadmin    | varchar(10)  | YES  |     | NULL    |       |
+------------------+--------------+------+-----+---------+-------+


mysql> describe customer;
+-----------------+--------------+------+-----+---------+-------+
| Field           | Type         | Null | Key | Default | Extra |
+-----------------+--------------+------+-----+---------+-------+
| cust_name       | varchar(100) | YES  |     | NULL    |       |
| cust_contact_no | varchar(10)  | NO   | PRI | NULL    |       |
| cust_email      | varchar(100) | YES  |     | NULL    |       |
| cust_address    | varchar(500) | YES  |     | NULL    |       |
| cust_gender     | varchar(20)  | YES  |     | NULL    |       |
+-----------------+--------------+------+-----+---------+-------+


mysql> describe newspaper;
+------------------------+--------------+------+-----+---------+-------+
| Field                  | Type         | Null | Key | Default | Extra |
+------------------------+--------------+------+-----+---------+-------+
| news_id                | int          | NO   | PRI | NULL    |       |
| news_name              | varchar(100) | NO   |     | NULL    |       |
| news_weekday_rate      | int          | NO   |     | NULL    |       |
| news_sunday_rate       | int          | YES  |     | NULL    |       |
| news_description       | varchar(200) | YES  |     | NULL    |       |
| news_activation_status | varchar(30)  | YES  |     | NULL    |       |
+------------------------+--------------+------+-----+---------+-------+


mysql> describe customer_newspaper;
+-----------------------+--------------+------+-----+---------+-------+
| Field                 | Type         | Null | Key | Default | Extra |
+-----------------------+--------------+------+-----+---------+-------+
| subscription_id       | int          | NO   | PRI | NULL    |       |
| cust_contact_no       | varchar(10)  | YES  | MUL | NULL    |       |
| cust_name             | varchar(100) | NO   |     | NULL    |       |
| news_id               | int          | YES  | MUL | NULL    |       |
| news_name             | varchar(100) | NO   |     | NULL    |       |
| subscription_date     | date         | YES  |     | NULL    |       |
| bill_start_date       | date         | YES  |     | NULL    |       |
| subscription_end_date | date         | YES  |     | NULL    |       |
| subscription_status   | varchar(20)  | YES  |     | NULL    |       |
| bill_pending          | varchar(20)  | YES  |     | NULL    |       |
| due_amount            | int          | YES  |     | NULL    |       |
+-----------------------+--------------+------+-----+---------+-------+


4.In ConnectionProvider.java file insert details such as IP address , database name, username and password.
5.Insert one record in Admin table for superadmin
6.Finally clean and Build and run the application.



![1](https://user-images.githubusercontent.com/59773594/147586988-1588ca94-7a96-4552-8df1-a8a66e16a64a.png)
![2](https://user-images.githubusercontent.com/59773594/147586992-351ab8df-67c1-4257-85cd-f8bf04b17914.png)
![3](https://user-images.githubusercontent.com/59773594/147587000-6810fba8-be64-46e1-9827-5f7f5310457d.png)



