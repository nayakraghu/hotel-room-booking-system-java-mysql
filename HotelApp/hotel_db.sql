CREATE DATABASE IF NOT EXISTS hotel_db; USE hotel_db;
CREATE TABLE IF NOT EXISTS users(id INT AUTO_INCREMENT PRIMARY KEY,username VARCHAR(50),password VARCHAR(50));
INSERT INTO users(username,password) VALUES('admin','admin123');
CREATE TABLE IF NOT EXISTS rooms(id INT AUTO_INCREMENT PRIMARY KEY,room_number VARCHAR(10),type VARCHAR(50),guest_name VARCHAR(100),price_per_night DOUBLE,check_in DATE,check_out DATE,status VARCHAR(20));
INSERT INTO rooms(room_number,type,guest_name,price_per_night,check_in,check_out,status) VALUES('101','Single','Amit Sharma',1500,'2024-01-10','2024-01-15','Booked'),('102','Double','N/A',2500,'2024-01-01','2024-01-01','Available'),('201','Suite','Priya Mehta',5000,'2024-01-12','2024-01-20','Booked'),('202','Single','N/A',1500,'2024-01-01','2024-01-01','Available');
