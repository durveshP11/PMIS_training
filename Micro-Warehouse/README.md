# Micro-Warehouse Inventory & Fulfillment Hub

## Project Description

Micro-Warehouse Inventory & Fulfillment Hub is a Java-based inventory management system developed using Spring Boot and MySQL. The application helps manage warehouse operations, including product registration, stock management, customer order processing, and sales reporting.

It provides separate Admin and Customer menus to perform different operations efficiently. Admins can add new products, view available inventory, replenish stock, monitor low-stock products, and generate sales reports. Customers can view available products and place orders containing multiple items.

The system also ensures reliable order processing using transaction management. If any product in an order has insufficient stock, the entire order is rejected without deducting stock from other products.

## Key Features

- **Product Management:** Add and view warehouse products.
- **Inventory Management:** Update and replenish product stock.
- **Low Stock Alerts:** Identify products with insufficient inventory.
- **Order Management:** Place orders containing multiple products.
- **Automatic Stock Deduction:** Update inventory after successful orders.
- **Transaction Management:** Maintain data consistency during order processing.
- **Sales Reports:** Calculate total revenue from confirmed and dispatched orders.
- **Top-Selling Products:** Identify products with the highest sales quantities.

## Technologies Used

- Java 21
- Spring Boot
- Spring JDBC
- JdbcTemplate
- MySQL
- Maven
- Git & GitHub

## Architecture

The project follows a layered architecture:

1. **UI Layer:** Handles user interaction through Admin and Customer menus.
2. **Service Layer:** Contains business logic and validation.
3. **Repository Layer:** Performs database operations using JdbcTemplate.
4. **Database Layer:** Stores product, order, and order item information in MySQL.

## Database Tables

- `products` – Stores product details and available stock.
- `orders` – Stores customer order information and order status.
- `order_items` – Stores individual products associated with each order.

## Project Objective

The main objective of this project is to simplify warehouse inventory management and order fulfillment while maintaining accurate stock levels and reliable database transactions.
