package Assignment1;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FoodManagementSystem extends Order{
public FoodManagementSystem(String f, String c, int p, int id) {
		super(f, c, p, id);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Food items: ");
	ArrayList food_item = new ArrayList();
	food_item.add("Rice");
	food_item.add("Dal Makhni");
	food_item.add("Shawrma");
	food_item.add("Chole Bature");
	
	for(Object items : food_item)
	{
		System.out.println(items);
	}
	System.out.println();
	System.out.print("Choose one food item:");
	String food = sc.next();
	
	if(food_item.contains(food))
	{
		System.out.println("Item is availabe");
	}
	else
	{
		System.out.println("Item not available");
	}
	System.out.println();
}
}
