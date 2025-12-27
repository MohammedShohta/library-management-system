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

## 🚀 Future Plans

- Learn and apply new **Java concepts**.
- Integrate the project with an **SQL database**.
- Expand the project using **Spring Framework** for a more robust and scalable application.
- Implement **member-book association** to track which member borrowed which book.

## ⚡ Usage

1. Clone the repository.
2. Open the project in a Java IDE.
3. Run the program and explore the current features.

## 📝 Notes

- Books have two states: **AVAILABLE** or **BORROWED**.
- Methods V2 enforce proper business rules for borrowing and returning.
- Custom exceptions are thrown for invalid operations.
- Deprecated methods remain for backward compatibility but should be avoided in new code.
