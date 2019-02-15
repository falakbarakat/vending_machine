package se.lexicon.vending_machine;

public class Products_drinks_transactions {
	ProDoa_List ProSell_drink = new ProDoa_List();
	boolean validate_amount = true ; 
	
	Drinks orange_juice=new Drinks("orange_juice",25,1);
	Drinks lemone_juice=new Drinks("lemone_juice",20,2);
		
	int balance=0;
	
	public void choose_drink() {
    
	System.out.println("Select id for drinks you will buy");
	System.out.println(orange_juice.getId()+" " +orange_juice.getName() + " " +orange_juice.getPrice());
	System.out.println(lemone_juice.getId() + " " +lemone_juice.getName() + " " +lemone_juice.getPrice());
	
	int id=Get_valid_nomber.get_valid_nom();
	

		
	    switch (id) {
	    
	    	case 1:
	    	System.out.println("You select " + orange_juice.getName());
	    	System.out.println("input money_amount");
	    	balance = Get_valid_nomber.get_valid_nom();
	    	System.out.println("Amount deposit " + balance);
	    	ProSell_drink.buy(balance,orange_juice.getPrice());
	    	break;
	    
	    	case 2:
		    	System.out.println("You select " + lemone_juice.getName());
		    	System.out.println("input money_amount");
		    	balance = Get_valid_nomber.get_valid_nom();
		    	System.out.println("Amount deposit " + balance);
		    	ProSell_drink.buy(balance,lemone_juice.getPrice());
		    	break;
	    	
		    	
	    		default:
	    			System.out.println("not valid");
	    }
	    		
	}	
	 
}
