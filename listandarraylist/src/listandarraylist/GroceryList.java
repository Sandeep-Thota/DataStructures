package listandarraylist;

import java.io.InputStream;
import java.util.ArrayList;

public class GroceryList {
	
	ArrayList<String> groceryList = new ArrayList<>();
	
public void addGroceryItem(String in) {
	groceryList.add(in);
}

public void printGroceyItem() {
	for(int i = 0; i< groceryList.size() ; i++) {
		System.out.println(" groceries included are " +groceryList.get(i));
	}
}
public void modifyGroceryItem(int index, String newItem) {
	String olditem = groceryList.get(index);
	String nItem = groceryList.set(index, newItem);
}

public void removeGroceryItem(String item) {
	groceryList.remove(item);
}

public void findItem(String item) {
	if(groceryList.contains(item)) {
		System.out.println("Found groery: "+item);
	}
	else {
		System.out.println("Item not present");
	}
}

}
