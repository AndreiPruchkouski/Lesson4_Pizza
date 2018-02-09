package by.htp.pizza.runner;

import by.htp.pizza.service.Console;
import by.htp.pizza.service.Delivery;
import by.htp.pizza.service.Ordering;
import by.htp.pizza.service.Pizza;

public class MainApp {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		
		Ordering order = new Ordering();
		Console input = new Console();
		Delivery deliver = new Delivery();
		
		
		
		//Greetings 
		order.greetCustomer();
		
		int pizzaName = input.readName();
		int pizzaSize = input.readSize();
		int pizzaBuff = input.readDuff();
		int deliveryDistrict = input.readDistrict();
		String deliveryAddress = input.readAddress();
		
		pizza1 = order.cookPizza(pizzaName, pizzaSize, pizzaBuff);
				
		order.getBill(pizza1.name, pizza1.description, pizza1.img, pizza1.buff, pizza1.weight, pizza1.size, pizza1.price);
		deliver.delivery(deliveryDistrict, deliveryAddress);
		
		//Bye
		order.goodbye();
		
	}

}
