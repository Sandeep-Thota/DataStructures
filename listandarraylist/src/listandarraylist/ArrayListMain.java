package listandarraylist;

import java.util.Scanner;

public class ArrayListMain {

	public static Scanner scanner = new Scanner(System.in);
	public static GroceryList groceryList = new GroceryList();
	public static void main(String[] args) {
		
		
		
		boolean quit = false;
		int select = 0;
		System.out.println("Started");
		printList();
		while(!quit){
		select = scanner.nextInt();
		switch(select) {
		case 1:
			printList();
			break;
		case 2:
			addGroceryItem();
			break;
		case 3:
			modifyItems();
			
		case 4:
			printGrocery();
			break;
		default:
			quit = true;
			break;
		
		}
		}

	}
public static void printList() {
	System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of grocery items.");
    System.out.println("\t 2 - To add an item to the list.");
    System.out.println("\t 3 - To modify an item in the list.");
    System.out.println("\t 4 - To remove an item from the list.");
    System.out.println("\t 5 - To search for an item in the list.");
    System.out.println("\t 6 - To quit the application.");
}
public static void printGrocery() {
	groceryList.printGroceyItem();
	scanner.nextLine();
}
public static void addGroceryItem() {
	scanner.nextLine();
	System.out.print("Enter Item");
	groceryList.addGroceryItem(scanner.nextLine());
}

public static void modifyItems() {
	System.out.println("Enter itemno");
	int itemno = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter new Item");
	String newItem = scanner.nextLine();
	groceryList.modifyGroceryItem(itemno-1, newItem);
	
	
}
}
