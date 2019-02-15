package se.lexicon.vending_machine;

import java.util.Scanner;
public class Get_valid_nomber {
	
	static int   nom;
    static Scanner se1=new Scanner (System.in);
    
    public static int get_valid_nom() {
    	
        System.out.println("input valid  int_nomber");
        if (se1.hasNextDouble()) {
        	nom=se1.nextInt();
        }
        else 
        	System.out.println("not int nom");

    	
    return nom;	
    }
   
}
