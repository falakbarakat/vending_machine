package se.lexicon.vending_machine;

public class Products_food_transactions {
	ProDoa_List ProSell = new ProDoa_List();
	boolean validate_amount = true ; 
	
	Food falafel_sandwich=new Food("falafel",30,1);
	Food chawerma_sandwich=new Food("chawerma",40,2);
	Food chicken=new Food("chicken",80,3);
	
	int balance=0;
	
	public void choose_food() {
    
	System.out.println("Select id for food you will buy");
	System.out.println(falafel_sandwich.getId()+" " +falafel_sandwich.getName() + " " +falafel_sandwich.getPrice());
	System.out.println(chawerma_sandwich.getId() + " " +chawerma_sandwich.getName() + " " +chawerma_sandwich.getPrice());
	System.out.println(chicken.getId() + " " +chicken.getName()+" " +chicken.getPrice());
	
	int id=Get_valid_nomber.get_valid_nom();
	

		
	    switch (id) {
	    
	    	case 1:
	    	System.out.println("You select " + falafel_sandwich.getName());
	    	System.out.println("input money_amount");
	    	balance = Get_valid_nomber.get_valid_nom();
	    	ProSell.buy(balance, falafel_sandwich.getPrice());
	    	
	    	break;
	    
	    	case 2:
		    	System.out.println("You select " + chawerma_sandwich.getName());
		    	System.out.println("input money_amount");
		    	
		    	balance = Get_valid_nomber.get_valid_nom();
		    	System.out.println("Amount deposit " + balance);
		    	ProSell.buy(balance,chawerma_sandwich.getPrice());
		    	break;
	    		
	    	case 3:
		    	System.out.println("You select " + chicken.getName());
		    	System.out.println("input money_amount");
		    	
		    	balance = Get_valid_nomber.get_valid_nom();
		    	System.out.println("Amount deposit " + balance);
		    	ProSell.buy(balance,chicken.getPrice());
	            break;
	            
	    		default:
	    			System.out.println("not valid");
	    }
	    		
	}	
	    
	   }


