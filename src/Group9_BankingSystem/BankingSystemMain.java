import java.util.Scanner;
/**
 * Date: Wednesday, Oct 8, 2025;
 * @author Krystan Kornafel, Hailey Owen, and Ahmed Eldesouki
 * <p>Class: SEG2105
 * <p>Assignment: Assignment 2
 *
 * <p>Description: This is the BankingSystemMain class, used to do all the main processes of the application. It is responsible to
 * manage all the objects that are created, process and store the data, and access the data as needed.
 */
public class BankingSystemMain {
	public static Scanner input = new Scanner (System.in);
	private String inputVal = ""; //Used to see which option from the menu the user wants to select
	private String clientName = "";
	private String nickname = "";
	private boolean isBMOClient = false; //true = is a client. false = not a client. Starts as false in case not a client
	private long accountNum;
	private float interestRate;
	private String businessType;
	
	public static void main(String[] args){
		//design a lookup system to print the client information
		System.out.println("======= Welcome to the BMO program!  =======");
		String option;
		//Menu
		while (true) {
			System.out.println("c: Create a new client");
			System.out.println("a: Create a new account");
			System.out.println("da: Display an account");
			System.out.println("dc: Display a client");
			
			//prompt the user to choose an option from the menu
			System.out.print("\nPlease select one of the menu options: ");
			option = input.next();
			option = option.toLowerCase();
			
//			try {
				
		switch (option) {
			case "c":
				//prompt user for the information to create the client, and then pass the data into the client object
				System.out.println("Please enter the client name: ");
				//clientName = input.next(); THIS IS THROWING ERRORS
				System.out.println("Is this client a member of BMO? If so, enter 0. If not, enter 1: ");
				//isBMOClient = input.nextBoolean(); THIS IS THROWING ERRORS
				//create a new client object
				//Client client = new Client(clientName, isBMOClient); CLIENT IS ABSTRACT
				break;
			case "a":
				//prompt user for the information to create the account, and then pass the data into the account object
				
				//create a new account object
				//Account account = new Account(); ACCOUNT IS ABSTRACT
				break;
			case "da":
				//print out the information of the specified account
				break;
			case "dc":
				//print out the information of the specified client
				break;
			default:
				System.out.println("Error! You did not enter one of the menu options!");
		}
			
//			} catch () {
//				System.out.println("You did not select a proper menu option!");
		}
		
		
	}	 
}