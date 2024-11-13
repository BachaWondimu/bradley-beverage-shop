# Bradley Beverage Shop

## Project Overview
The **Bradley Beverage Shop** application simulates a small beverage shop's order management system, supporting various beverage types (Coffee, Alcohol, Smoothie) with different customization options. The system allows creating and processing orders, generating monthly reports, and calculating total sales.

This project demonstrates key OOP concepts such as inheritance, polymorphism, interfaces, aggregation, and abstract classes. The application is built in Java, using ArrayLists to manage orders and beverages.

## Features
- **Order Management**: Create, add, and manage beverages in orders.
- **Beverage Customization**: Choose beverage type, size, and specific add-ons (e.g., extra shot for Coffee, protein powder for Smoothie).
- **Monthly Sales Report**: Generate and display sales information for a one-month period.
- **Order Filtering and Sorting**: Using search, selection sort, and enumeration to manage orders.
- **Object-Oriented Design Principles**: Implemented using interfaces, abstract classes, and polymorphism.

## Class Structure
### Key Classes
- **BevShop**: Main class managing orders and sales data.
- **Beverage (Abstract Class)**: Parent class for `Coffee`, `Alcohol`, and `Smoothie` subclasses.
- **Order**: Manages an individual customer's order, including beverages and customer details.
- **Customer**: Stores information about the customer (name and age).

### Interfaces
- **OrderInterface**: Specifies methods for `Order` management.
- **BevShopInterface**: Specifies methods for `BevShop` management.

### Enumerations
- **DAY**: Days of the week (e.g., MONDAY, TUESDAY).
- **SIZE**: Beverage sizes (SMALL, MEDIUM, LARGE).
- **TYPE**: Beverage types (COFFEE, SMOOTHIE, ALCOHOL).

## Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/BachaWondimu/bradley-beverage-shop
