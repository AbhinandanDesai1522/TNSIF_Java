# Food Delivery System - Java Case Study

## Project Structure
```
FoodDeliverySystem/
├── src/
│   └── com/
│       └── tns/
│           └── fooddeliverysystem/
│               ├── application/
│               │   └── FoodDeliverySystem.java (Main Driver Class)
│               ├── entities/
│               │   ├── User.java
│               │   ├── Customer.java
│               │   ├── FoodItem.java
│               │   ├── Restaurant.java
│               │   ├── Cart.java
│               │   ├── Order.java
│               │   └── DeliveryPerson.java
│               └── services/
│                   ├── FoodService.java
│                   ├── CustomerService.java
│                   └── OrderService.java
```

## Description
An online food delivery application that enables customers to browse and order food items from various restaurants, manage their carts, and track orders. Features distinct roles including Admin who manages food items and restaurants, DeliveryPersons who handle order deliveries, and Users who can register as either Customers or Admin.

## Key Features
- **Admin Module**: Add/Remove restaurants, Manage food items, View orders, Add delivery persons, Assign delivery persons to orders
- **Customer Module**: Register as customer, Browse restaurants and menus, Add items to cart, Place orders, View order history
- **Order Management**: Track order status, Assign delivery persons, Manage deliveries

## Relationships
- One-to-One: Customer has exactly one Cart
- One-to-Many: Customer can place multiple Orders
- Many-to-Many: Order can include multiple FoodItems, FoodItem can be in multiple Orders
- Many-to-One: Order is delivered by one DeliveryPerson
- Many-to-Many: FoodItem can be in multiple Carts, Cart can contain multiple FoodItems
- Inheritance: Customer extends User
- Restaurant manages (add/remove) multiple FoodItems
- DeliveryPerson can deliver multiple Orders

## How to Run in Eclipse

1. **Import Project**:
   - Open Eclipse IDE
   - File → Open Projects from File System
   - Select the project folder: `c:\Users\abhin\Desktop\java case study food`
   - Click Finish

2. **Run the Application**:
   - Navigate to: `src/com/tns/fooddeliverysystem/application/FoodDeliverySystem.java`
   - Right-click on the file
   - Select "Run As" → "Java Application"

3. **Sample Workflow**:
   - Choose option 1 (Admin Menu)
   - Add restaurants (option 1)
   - Add food items to restaurants (option 2)
   - Add delivery persons (option 6)
   - Exit to main menu (option 8)
   - Choose option 2 (Customer Menu)
   - Add customer (option 1)
   - View food items (option 2)
   - Add food to cart (option 3)
   - View cart (option 4)
   - Place order (option 5)
   - View orders (option 6)

## Sample Test Data

### Admin Operations:
- **Restaurant 1**: ID: 101, Name: HariOmDhaba
- **Restaurant 2**: ID: 102, Name: ExpressInn
- **Food Items for Restaurant 101**:
  - ID: 1, Name: PanjalThali, Price: 340.0
  - ID: 2, Name: PavBhaji, Price: 140.0
- **Delivery Person**: ID: 1, Name: Manoj, Contact: 7087905078

### Customer Operations:
- **Customer**: ID: 1001, Username: Alpana, Contact: 7720092235
- **Add to Cart**: Restaurant 101, Food Item 2, Quantity: 2
- **Place Order**: Delivery Address: (Your address)

## Technologies Used
- Java SE
- Object-Oriented Programming (OOP)
- Collections Framework (ArrayList, HashMap)
- Inheritance and Polymorphism
