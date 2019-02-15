package se.lexicon.vending_machine;

import java.util.Scanner;

public class Buy_more {
	static Scanner in = new Scanner (System.in);
	
	public static boolean buyAgain(String answer) {
		
		String upperCaseString = answer.toUpperCase();
 		switch(upperCaseString) {
 		case "Y":
 			System.out.println("Welcome Back");
 			return true;
 		default:
 			System.out.println("welcome");
 			return false;
}
}
	
	public static String GetbuyAgainsAnswer() {
			return in.nextLine();
}

}
