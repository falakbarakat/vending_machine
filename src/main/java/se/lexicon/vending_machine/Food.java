package se.lexicon.vending_machine;

public class Food  extends Products {
	
	boolean validate_amount =true;
	
	public Food(String name,int price,int id) {
		super(name,price,id);
		this.name=getName();
		this.price=getPrice();
		
	}
}
