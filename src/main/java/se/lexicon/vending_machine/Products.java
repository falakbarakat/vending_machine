package se.lexicon.vending_machine;

public class Products {
	
	int id;
	String name;
	int price;
	int balance=0;
	
	public Products(String name,int price, int id) {
	 this.name=name;
	 this.id=id;
	 this.price=price;
	}

	
	public int getId() {
		return id;
	}
   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
