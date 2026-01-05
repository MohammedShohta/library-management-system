# Library Management System

A small **Java** project for managing a library, demonstrating **Object-Oriented Programming (OOP)** and **Java Basics**.

## 🛠 Features

- Manage books and library members.
- Handle errors using **Exception Handling** for a stable program.
- Updated book management with **ArrayList** instead of array.
- Used Stream Api to Handling data.
- Sorting logic is now handled by **Library**, keeping **Book** as a data-only class.
- Legacy methods are marked as **@Deprecated**.
- Filter and sort available books using the Stream API.
- Implemented multiple filtering using Stream API for flexible data queries.
- Improved returnBook logic to ensure books are returned only if borrowed.
- Applied multithreading concepts.
- Added a NotificationService that executes tasks asynchronously using ExecutorService, 
  submitting notifications to a thread pool without blocking the main thread
-Refactored Main method by moving application logic to a separate Implementation class, improving readability and code organization.
-Implemented **Java Reflection** to dynamically discover and invoke library methods.
- Used method `borrowBookV2` is invoked dynamically using Reflection instead of direct calls.


  
## 🚀 Future Plans

- Learn and apply new **Java concepts**.
- Integrate the project with an **SQL database**.
- Expand the project using **Spring Framework** for a more robust and scalable application.

## ⚡ Usage

1. Clone the repository.
2. Open the project in a Java IDE.
3. Run the program and explore the current features.


## 📝 Notes

- Books have two states: **AVAILABLE** or **BORROWED**.
- Borrowing logic enforces proper business rules.
- Custom exceptions are thrown for invalid operations.
- Deprecated methods remain for backward compatibility but should be avoided in new code.
- Reflection is used for learning and flexibility, not as a replacement for normal method calls.

---

## 🎯 Purpose

This project is a **learning playground** to apply Java concepts incrementally before building a full production-ready project using **Spring Boot**.
