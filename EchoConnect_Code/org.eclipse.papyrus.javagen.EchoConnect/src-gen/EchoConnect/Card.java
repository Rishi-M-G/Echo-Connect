// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package EchoConnect;

import java.util.Date;
import java.util.Scanner;

public class Card {

	public int CardNo;
	public Date CardExpiryDate;
	public int CardCVV;
	public String CardHolderName;
	
	static void ManageCards() {
		System.out.println("Managing cards and making payments");
		
		System.out.println("1. Manage Existing Cards");
		System.out.println("2. Add New Card");
		
		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		
		switch (userChoice) {
		case 1:
			System.out.println("Managing existing cards...");
			break;
		case 2:
			System.out.println("Adding New Card..");
			AddNewCard();
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
	
	private static void AddNewCard() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Card Number");
		int cardNo = scanner.nextInt();

        System.out.println("Enter Card CVV:");
        int cardCVV = scanner.nextInt();

        System.out.println("Enter Card Holder Name:");
        String cardHolderName = scanner.next();
        
        System.out.println("New card added successfully!");
	}
	

	/**
	 * 
	 */

	/**
	 * 
	 */
	public void ValidateCard() {
		System.out.println("Card Validated");
	}
}
