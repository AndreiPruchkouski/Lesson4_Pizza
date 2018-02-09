package by.htp.pizza.service;

public class Delivery {
	
	public void delivery(int deliveryDistrict, String deliveryAdress) {
		
		switch(deliveryDistrict) {
		case 1:
			System.out.println("\nДоставка будет осуществлена по адресу: " + deliveryAdress);
			System.out.println("Время доставки составит: 30 минут");
			break;
		case 2: 
			System.out.println("\nДоставка будет осуществлена по адресу: " + deliveryAdress);
			System.out.println("\nВремя доставки составит: 45 минут");
			break;
		case 3:
			System.out.println("\nДоставка будет осуществлена по адресу: " + deliveryAdress);
			System.out.println("\nВремя доставки составит: 30 минут");
			break;
		case 4:
			System.out.println("\nИзвините, но мы не осуществляем доставку в ваш район.");
			break;
		default:
			System.out.println("\nИзвините, но мы не осуществляем доставку в ваш район.");
			break;
		}
		

	}	
	
}
