package se.lexicon.vending_machine;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ProDoa_List implements Pro_DOA{
	
	Scanner sc = new Scanner (System.in);
	
	int balance ; 
	
	@Override
	public int buy(int balance,int price) {
		
		if (balance==0 ||balance<price ) {
			System.out.println("input more money");
			int moreAmount = Get_valid_nomber.get_valid_nom();
			balance += moreAmount;
			return buy(balance,price);
		}else {
			
		System.out.println("Amount :"+balance +"\nProduct Price :"+price);
		int Balance=balance-price;
		System.out.println("your Balance :" + Balance);
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime time=LocalTime.now();
		System.out.println(time);

		}
		return balance;
}

	public int getBalance() {
		return balance;
	}
	
	
}