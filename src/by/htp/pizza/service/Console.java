package by.htp.pizza.service;

import java.util.Scanner;

public class Console {

	public int readName() {
		
		System.out.println("Пожалуйста укажите номер названия пиццы для заказа (выбрать из списка): ");
		System.out.println("1. Филадельфия\n2. Четыре сезона\n3. Ранч пицца");
		System.out.print("Ваш выбор ---> ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		return value;
	}

	public int readSize() {
	
		System.out.println("\nУкажите номер размера пиццы на выбор: ");
		System.out.println("1. 30см\n2. 45см");
		System.out.print("Ваш выбор ---> ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		return value;
	}
	
	public int readDuff() {
		
		System.out.println("\nУкажите номер теста(основы): ");
		System.out.println("1. Тонкая (Ital)\n2. Пышная");
		System.out.print("Ваш выбор ---> ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		return value;
	}
	
	public int readDistrict() {
		
		System.out.println("\nУкажите номер района для доставки: ");
		System.out.println("1. Центральный\n2. Первомайский\n3. Советский\n4. Нет в списке");
		System.out.print("Ваш выбор ---> ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		return value;
	}
	
	public String readAddress() {
		
		System.out.print("\nУкажите адрес доставки: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		String address = sc.nextLine();
		
		return address;
	}
	
}
