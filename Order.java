
package Assignment1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Order {
	private String food_name;
	private String cust_name;
	private int price;
	private int cust_id;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  cust_id+" "+food_name+" "+cust_name+" "+price;
	}
	
	
	public Order(String f,String c,int p,int id)
	{
		food_name = f;
		cust_name = c;
		price = p;
		cust_id = id;
	}
	
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	
	public static void main(String[] args)throws Exception {
		Order o1 = new Order("Rice","Kasturi",300,1);
		Order o2 = new Order("Chole Bature","Ramesh",250,2);
		Order o3 = new Order("Dal Makhni","Elvish",200,3);
		Order o4 = new Order("Shawrma","Navin",150,4);
		Order o5 = new Order("Rice","vivan",150,5);
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(o1.toString());
		pq.add(o2.toString());
		pq.add(o3.toString());
		pq.add(o4.toString());
		pq.add(o5.toString());
		
		for(Object o : pq)
		{
			System.out.println(o);
		}

	}
	
	
	
	
	
}
