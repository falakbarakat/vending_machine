package se.lexicon.vending_machine;

import java.util.Scanner;

public class App {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean running=true;
		while (running) {
			
		System.out.println("Welcome to our machine");
		System.out.println("please select from below list:");
		System.out.println("\n1=food" + "\n2=drinks");

		int choice = Get_valid_nomber.get_valid_nom();


		switch (choice) {

		case 1:

			Products_food_transactions PrFo = new Products_food_transactions();
			PrFo.choose_food();
			break;

		case 2:

			Products_drinks_transactions  PrDr = new Products_drinks_transactions ();
			PrDr.choose_drink();
			break;

			default :
				
				System.out.println("Wrong Entity");
		}
		
		System.out.println("Do You Want To Buy Again ? (Y/N)");
		String answer = Buy_more.GetbuyAgainsAnswer().toUpperCase();
		running = Buy_more.buyAgain(answer);
		

	}

}
}