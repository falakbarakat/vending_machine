package se.lexicon.vending_machine;
 

public class Drinks extends Products {
boolean validate_amount =true;
	
	public Drinks(String name,int price,int id) {
		super(name,price,id);
		this.name=getName();
		this.price=getPrice();
		
	}
		
}
	


