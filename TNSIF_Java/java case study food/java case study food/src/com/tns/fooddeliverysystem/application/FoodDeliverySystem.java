package com.tns.fooddeliverysystem.application;

import java.util.Map;
import java.util.Scanner;

import com.tns.fooddeliverysystem.entities.Customer;
import com.tns.fooddeliverysystem.entities.DeliveryPerson;
import com.tns.fooddeliverysystem.entities.FoodItem;
import com.tns.fooddeliverysystem.entities.Order;
import com.tns.fooddeliverysystem.entities.Restaurant;
import com.tns.fooddeliverysystem.services.CustomerService;
import com.tns.fooddeliverysystem.services.FoodService;
import com.tns.fooddeliverysystem.services.OrderService;

public class FoodDeliverySystem {
	private static FoodService foodService = new FoodService();
	private static OrderService orderService = new OrderService();
	private static CustomerService customerService = new CustomerService();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n1. Admin Menu");
			System.out.println("2. Customer Menu");
			System.out.println("3. Exit");
			System.out.print("Choose an option: ");
			
			int choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					adminMenu(scanner);
					break;
				case 2:
					customerMenu(scanner);
					break;
				case 3:
					System.out.println("Exiting Admin Module");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice! Please try again.");
					break;
			}
		}
	}
	
	private static void adminMenu(Scanner scanner) {
		while (true) {
			System.out.println("\nAdmin Menu:");
			System.out.println("1. Add Restaurant");
			System.out.println("2. Add Food Item to Restaurant");
			System.out.println("3. Remove Food Item from Restaurant");
			System.out.println("4. View Restaurants and Menus");
			System.out.println("5. View Orders");
			System.out.println("6. Add Delivery Person");
			System.out.println("7. Assign Delivery Person to Order");
			System.out.println("8. Exit");
			System.out.print("Choose an option: ");
			
			int adminChoice = scanner.nextInt();
			
			switch (adminChoice) {
				case 1:
					addRestaurant(scanner);
					break;
				case 2:
					addFoodItemToRestaurant(scanner);
					break;
				case 3:
					removeFoodItemFromRestaurant(scanner);
					break;
				case 4:
					viewRestaurants();
					break;
				case 5:
					viewOrders();
					break;
				case 6:
					addDeliveryPerson(scanner);
					break;
				case 7:
					assignDeliveryPersonToOrder(scanner);
					break;
				case 8:
					System.out.println("Exiting Admin Module");
					return;
				default:
					System.out.println("Invalid choice! Please try again.");
					break;
			}
		}
	}
	
	private static void addRestaurant(Scanner scanner) {
		System.out.print("Enter Restaurant ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Restaurant Name: ");
		String name = scanner.nextLine();
		
		Restaurant restaurant = new Restaurant(id, name);
		foodService.addRestaurant(restaurant);
		System.out.println("Restaurant added successfully!");
	}
	
	private static void addFoodItemToRestaurant(Scanner scanner) {
		System.out.print("Enter Restaurant ID: ");
		int restaurantId = scanner.nextInt();
		System.out.print("Enter Food Item ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Food Item Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Food Item Price: ");
		double price = scanner.nextDouble();
		
		FoodItem foodItem = new FoodItem(id, name, price);
		foodService.addFoodItemToRestaurant(restaurantId, foodItem);
		System.out.println("Food item added successfully!");
	}
	
	private static void removeFoodItemFromRestaurant(Scanner scanner) {
		System.out.print("Enter Restaurant ID: ");
		int restaurantId = scanner.nextInt();
		System.out.print("Enter Food Item ID: ");
		int foodItemId = scanner.nextInt();
		
		foodService.removeFoodItemFromRestaurant(restaurantId, foodItemId);
		System.out.println("Food item removed successfully!");
	}
	
	private static void viewRestaurants() {
		System.out.println("\nRestaurants and Menus:");
		for (Restaurant restaurant : foodService.getAllRestaurants()) {
			System.out.println("Restaurant ID: " + restaurant.getId() + ", Name: " + restaurant.getName());
			for (FoodItem item : restaurant.getMenu()) {
				System.out.println("  - Food Item ID: " + item.getId() + ", Name: " + item.getName() + ", Price: Rs. " + item.getPrice());
			}
		}
	}
	
	private static void viewOrders() {
		System.out.println("\nOrders:");
		for (Order order : orderService.getOrders()) {
			System.out.println(order);
		}
	}
	
	private static void addDeliveryPerson(Scanner scanner) {
		System.out.print("Enter Delivery Person ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Delivery Person Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Contact No.: ");
		long contactNo = scanner.nextLong();
		
		DeliveryPerson deliveryPerson = new DeliveryPerson(id, name, contactNo);
		orderService.addDeliveryPerson(deliveryPerson);
		System.out.println("Delivery person added successfully!");
	}
	
	private static void assignDeliveryPersonToOrder(Scanner scanner) {
		System.out.print("Enter Order ID: ");
		int orderId = scanner.nextInt();
		System.out.print("Enter Delivery Person ID: ");
		int deliveryPersonId = scanner.nextInt();
		
		orderService.assignDeliveryPersonToOrder(orderId, deliveryPersonId);
		System.out.println("Delivery person assigned to order successfully!");
	}
	
	private static void customerMenu(Scanner scanner) {
		while (true) {
			System.out.println("\nCustomer Menu:");
			System.out.println("1. Add Customer");
			System.out.println("2. View Food Items");
			System.out.println("3. Add Food to Cart");
			System.out.println("4. View Cart");
			System.out.println("5. Place Order");
			System.out.println("6. View Orders");
			System.out.println("7. Exit");
			System.out.print("Choose an option: ");
			
			int customerChoice = scanner.nextInt();
			
			switch (customerChoice) {
				case 1:
					addCustomer(scanner);
					break;
				case 2:
					viewRestaurants();
					break;
				case 3:
					addFoodToCart(scanner);
					break;
				case 4:
					viewCart(scanner);
					break;
				case 5:
					placeOrder(scanner);
					break;
				case 6:
					viewCustomerOrders(scanner);
					break;
				case 7:
					System.out.println("Exiting Customer Module");
					return;
				default:
					System.out.println("Invalid choice! Please try again.");
					break;
			}
		}
	}
	
	private static void addCustomer(Scanner scanner) {
		System.out.print("Enter User ID: ");
		int userId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Username: ");
		String username = scanner.nextLine();
		System.out.print("Enter Contact No.: ");
		long contactNo = scanner.nextLong();
		
		Customer customer = new Customer(userId, username, contactNo);
		customerService.addCustomer(customer);
		System.out.println("Customer created successfully!");
	}
	
	private static void addFoodToCart(Scanner scanner) {
		System.out.print("Enter Customer ID: ");
		int customerId = scanner.nextInt();
		System.out.print("Enter Restaurant ID: ");
		int restaurantId = scanner.nextInt();
		System.out.print("Enter Food Item ID: ");
		int foodItemId = scanner.nextInt();
		System.out.print("Enter Quantity: ");
		int quantity = scanner.nextInt();
		
		Customer customer = customerService.getCustomer(customerId);
		if (customer == null) {
			System.out.println("Customer not found!");
			return;
		}
		
		Restaurant restaurant = foodService.getRestaurantById(restaurantId);
		if (restaurant == null) {
			System.out.println("Restaurant not found!");
			return;
		}
		
		FoodItem foodItem = null;
		for (FoodItem item : restaurant.getMenu()) {
			if (item.getId() == foodItemId) {
				foodItem = item;
				break;
			}
		}
		
		if (foodItem == null) {
			System.out.println("Food item not found!");
			return;
		}
		
		customer.getCart().addItem(foodItem, quantity);
		System.out.println("Food item added to cart!");
	}
	
	private static void viewCart(Scanner scanner) {
		System.out.print("Enter Customer ID: ");
		int customerId = scanner.nextInt();
		
		Customer customer = customerService.getCustomer(customerId);
		if (customer == null) {
			System.out.println("Customer not found!");
			return;
		}
		
		System.out.println("\nCart:");
		double totalCost = 0;
		for (Map.Entry<FoodItem, Integer> entry : customer.getCart().getItems().entrySet()) {
			FoodItem item = entry.getKey();
			int quantity = entry.getValue();
			double cost = item.getPrice() * quantity;
			totalCost += cost;
			System.out.println("Food Item: " + item.getName() + ", Quantity: " + quantity + ", Cost: Rs. " + cost);
		}
		System.out.println("Total Cost: Rs. " + totalCost);
	}
	
	private static void placeOrder(Scanner scanner) {
		System.out.print("Enter Customer ID: ");
		int customerId = scanner.nextInt();
		
		Customer customer = customerService.getCustomer(customerId);
		if (customer == null) {
			System.out.println("Customer not found!");
			return;
		}
		
		if (customer.getCart().getItems().isEmpty()) {
			System.out.println("Cart is empty! Add items to your cart before placing an order.");
			return;
		}
		
		Order order = new Order(orderService.getOrders().size() + 1, customer);
		scanner.nextLine();
		System.out.print("Enter Delivery Address: ");
		String address = scanner.nextLine();
		order.setDeliveryAddress(address);
		
		orderService.placeOrder(order);
		System.out.println("Order placed successfully! Your order ID is: " + order.getOrderId());
		
		// Clear the cart after placing order
		customer.getCart().getItems().clear();
	}
	
	private static void viewCustomerOrders(Scanner scanner) {
		System.out.print("Enter Customer ID: ");
		int customerId = scanner.nextInt();
		
		System.out.println("\nOrders:");
		for (Order order : orderService.getOrders()) {
			if (order.getCustomer().getUserId() == customerId) {
				System.out.println(order);
			}
		}
	}
}
