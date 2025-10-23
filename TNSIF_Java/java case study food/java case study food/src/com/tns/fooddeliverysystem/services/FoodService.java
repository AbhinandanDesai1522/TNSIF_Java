package com.tns.fooddeliverysystem.services;

import java.util.ArrayList;
import java.util.List;

import com.tns.fooddeliverysystem.entities.FoodItem;
import com.tns.fooddeliverysystem.entities.Restaurant;

public class FoodService {
	private List<Restaurant> restaurants = new ArrayList<>();
	
	public void addRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
	}
	
	public List<Restaurant> getAllRestaurants() {
		return restaurants;
	}
	
	public Restaurant getRestaurantById(int restaurantId) {
		for (Restaurant restaurant : restaurants) {
			if (restaurant.getId() == restaurantId) {
				return restaurant;
			}
		}
		return null;
	}
	
	public void addFoodItemToRestaurant(int restaurantId, FoodItem foodItem) {
		Restaurant restaurant = getRestaurantById(restaurantId);
		if (restaurant != null) {
			restaurant.addFoodItem(foodItem);
		}
	}
	
	public void removeFoodItemFromRestaurant(int restaurantId, int foodItemId) {
		Restaurant restaurant = getRestaurantById(restaurantId);
		if (restaurant != null) {
			restaurant.removeFoodItem(foodItemId);
		}
	}
}
