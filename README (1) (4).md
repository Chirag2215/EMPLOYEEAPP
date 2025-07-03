# Java JDBC CRUD Application

This project is a simple Java console-based CRUD application that connects to a MySQL database using JDBC. It allows users to **Add**, **View**, **Update**, and **Delete** records from the `users` table.

## 🛠 Technologies Used

- Java
- JDBC (Java Database Connectivity)
- MySQL
- VS Code / IntelliJ / Eclipse

---

## 📂 Project Structure

```
JavaJDBCProject/
│
├── src/
│   ├── DBConnection.java         # Manages database connection
│   ├── User.java                 # User model
│   ├── UserDAO.java              # CRUD operations
│   └── Main.java                 # Main application runner
│
├── README.md
└── schema.sql                   # SQL to create database and table
```

---

## 🧾 Database Schema

```sql
CREATE DATABASE IF NOT EXISTS javadb;

USE javadb;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);
```

---

## ⚙️ How to Run

1. **Install MySQL** and create the database using the `schema.sql` file.
2. **Configure database URL, username, and password** in the `DBConnection.java`.
3. **Compile and run** the `Main.java` file.

```bash
javac -d bin src/*.java
java -cp bin Main
```

---

## ✅ Features

- Add a new user
- View all users
- Update user details
- Delete user by ID

---

## 📌 Note

Ensure the MySQL JDBC driver (`mysql-connector-java`) is added to your project classpath.
