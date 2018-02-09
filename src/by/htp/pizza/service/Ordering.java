package by.htp.pizza.service;

public class Ordering {

	public void greetCustomer() {
		System.out.println(
				"Добро пожаловать в JavaПицца! \nПросим вас следовать процессу заказа, для получения вкуснейшей пиццы на Output!");
		System.out.println();
	}
	
	public Pizza cookPizza(int name, int size, int buff) {

		Pizza pizza = new Pizza();

		// Initialization pizza name
		switch (name) {
		case 1:
			pizza.name = "Филадельфия";
			pizza.description = "В состав входит: \nпицца-соус, филе лосося слабосоленое, сыр фета, лимон, свежие томаты, сыр моцарелла, базилик";
			pizza.img = "https://app.pzzby.com/uploads/photos/31hx2Xk2jU.jpg";
			break;
		case 2:
			pizza.name = "Четыре сезона";
			pizza.description = "В состав входит: \nчесночный соус, пепперони, ветчина, свежие шампиньоны, филе цыпленка, сыр моцарелла, базилик";
			pizza.img = "https://app.pzzby.com/uploads/photos/NIY3gJ8Svc.jpg";
			break;
		case 3:
			pizza.name = "Ранч пицца";
			pizza.description = "В состав входит: \nамериканский соус ранч, филе цыпленка, ветчина, свежие томаты, сыр моцарелла, базилик";
			pizza.img = "https://app.pzzby.com/uploads/photos/9NAinqPtux.jpg";
			break;
		default: 
			pizza.name = "Филадельфия (выбрана по-умолчанию)";
			pizza.description = "В состав входит: \nпицца-соус, филе лосося слабосоленое, сыр фета, лимон, свежие томаты, сыр моцарелла, базилик";
			pizza.img = "https://app.pzzby.com/uploads/photos/31hx2Xk2jU.jpg";
			break;
		}

		// Initialization pizza size
		switch (size) {
		case 1:
			pizza.size = 30;
			pizza.weight = "0,6 - 0,7 кг";
			pizza.price = 12.90;
			break;
		case 2:
			pizza.size = 45;
			pizza.weight = "0,8 - 0,9 кг";
			pizza.price = 16.50;
			break;
		default: 
			pizza.size = 30;
			pizza.weight = "0,6 - 0,7 кг";
			pizza.price = 12.90;
			break;
		}

		// Initialization pizza size
		switch (buff) {
		case 1:
			pizza.buff = "Тонкая (Ital)";
			break;
		case 2:
			pizza.buff = "Пышная";
			break;
		default:
			pizza.buff = "Пышная";
			break;
		}
		
		return pizza;
		
	}
	
	public void getBill(String name, String description, String img, String buff, String weight, int size, double price){
		System.out.println("\n#### Ваш заказ ####");
		System.out.println(name + " на тесте: " + buff);
		System.out.println(description);
		System.out.println("Выглядит так: " + img);
		System.out.println("Размер: " + size + "см ||  Весом: " + weight);
		System.out.println("Цена: " + price + " рублей");
	}
	
	public void goodbye() {
		System.out.println("Приятного аппетита! Всегда рады вам в JavaПицца!");
	}
	
	
	
}
