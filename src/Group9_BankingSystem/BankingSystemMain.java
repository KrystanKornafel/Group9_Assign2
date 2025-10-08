import java.util.ArrayList;
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
	private boolean isBMOClient = false; //true if it is a client. false if it is not a client. Starts as false as default
	private long accountNum;
	private float interestRate;
	private String businessType;
	
	//New arraylists added to store created clients and accounts 

	//list of all clients
	private static ArrayList<Client> clients = new ArrayList<Client>(); 

	//list of all accounts
	private static ArrayList<Account> accounts = new ArrayList<Account>(); 
	
	public static void main(String[] args){
		//INITIAL CHECK TO CHECK IF THE FILE IS ACTUALLY BEING COMPILED. IM RUNNING INTO ERRORS 
		//System.out.println("NEW COMPILED FILE!");

		//Introduction to the bmo program
		System.out.println("======= Welcome to the BMO program!  =======");
		String option;
		//Menu
		while (true) {
			System.out.println("c: Create a new client");
			System.out.println("a: Create a new account");
			System.out.println("da: Display an account");
			System.out.println("dc: Display a client");
			System.out.println("q: Quit program");
			
			//prompt the user to choose an option from the menu
			System.out.print("\nPlease select one of the menu options: ");
			option = input.next();
			option = option.toLowerCase();
			
		switch (option) {
			case "c":
				//prompt user for the information to create the client, and then pass the data into the client object
				createClient(); //method to handle client creation
				break;
			case "a":
				//prompt user for the information to create the account, and then pass the data into the account object
				createAccount(); //method to handle account creation
				break;
			case "da":
				//print out the information of the specified account
				displayAccount(); //New method to print account info
				break;
			case "dc":
				//print out the information of the specified client
				displayClient(); //method added to print client info
				break;
			case "q":
				System.out.println("Thank you for using the BMO program!");
				return; 
			default:
				System.out.println("Error! You did not enter one of the menu options!");
		}
		}
		
		
	}	 
	
	
	// added methods below//
	
	
	/** 
	 * Method used to create a new Client object and add it to the list.
	 * It allows the user to select the type of client (Adult, Student, or Minor)
	 * and stores the data in the clients ArrayList.
	 */
	private static void createClient() {
		input.nextLine(); // consume newline
		
		System.out.print("Please enter the client name: ");
		String name = input.nextLine();
		
		System.out.print("Is this client a member of BMO? (y/n): ");
		String bmo = input.next().toLowerCase();
		boolean isBMOMember = bmo.startsWith("y");
		
		System.out.print("Please enter a unique client number: ");
		long clientNumber = input.nextLong();
		
		//check if client number already exists
		for (Client c : clients) {
			if (c.getClientNumber() == clientNumber) {
				System.out.println("Error: Client number already exists.");
				return;
			}
		}
		
		System.out.print("Enter client type (adult/student/minor): ");
		String type = input.next().toLowerCase();
		
		Client newClient = null;
		
		//Create the proper client type based on input
		switch (type) {
			case "adult":
				input.nextLine(); // consume newline
				System.out.print("Enter business type (investor/individual/small/large): ");
				String businessType = input.nextLine();
				newClient = new Adult(name, isBMOMember, null, clientNumber, businessType);
				break;
			case "student":
				newClient = new Student(name, isBMOMember, null, clientNumber);
				break;
			case "minor":
				newClient = new Minor(name, isBMOMember, null, clientNumber);
				break;
			default:
				System.out.println("Error: Invalid client type.");
				return;
		}
		
		//add to clients list
		clients.add(newClient);
		System.out.println("Client successfully created with ID #" + clientNumber);
	}
	
	
	/** 
	 * Method used to create a new Account (Savings, Checking, Loan, or Investment)
	 * and link it to an existing client.
	 */
	private static void createAccount() {
		input.nextLine(); //consume newline
		
		System.out.print("Enter account type (checking/savings/investment/loan): ");
		String type = input.next().toLowerCase();
		
		System.out.print("Enter unique account number: ");
		long accountNum = input.nextLong();
		
		//check if account number already exists
		for (Account a : accounts) {
			if (a.getAccountNum() == accountNum) {
				System.out.println("Error: Account number already exists.");
				return;
			}
		}
		
		//find client to attach account to
		System.out.print("Enter the client number to attach this account to: ");
		long clientNum = input.nextLong();
		Client client = null;
		for (Client c : clients) {
			if (c.getClientNumber() == clientNum) {
				client = c;
				break;
			}
		}
		
		if (client == null) {
			System.out.println("Error: Client not found.");
			return;
		}
		
		//nickname and interestRate depend on account type
		String nickname = "";
		float interestRate = 0.0f;
		
		if (type.equals("checking") || type.equals("savings") || type.equals("investment")) {
			input.nextLine(); //consume newline
			System.out.print("Enter nickname for this account: ");
			nickname = input.nextLine();
		}
		
		if (type.equals("savings") || type.equals("loan")) {
			System.out.print("Enter interest rate: ");
			interestRate = input.nextFloat();
		}
		
		Account account = null;
		
		//create the account based on type that the user has specified
		switch (type) {
			case "checking":
				account = new Checking(accountNum, nickname, client);
				break;
			case "savings":
				account = new Savings(accountNum, nickname, interestRate, client);
				break;
			case "investment":
				account = new Investment(accountNum, nickname, client);
				break;
			case "loan":
				account = new Loan(accountNum, interestRate, client);
				break;
			default:
				System.out.println("Error: Invalid account type.");
				return;
		}
		
		//add to the global account list
		accounts.add(account);
		
		//link to client via existing Client method
		client.addAccount(account);
		
		System.out.println("Account #" + accountNum + " successfully created and linked to client #" + clientNum);
	}
	
	
	/**
	 * Method used to print all information about any typ of  specific account.
	 *
	 */
	private static void displayAccount() {
		System.out.print("Enter account number to display: ");
		long accountNum = input.nextLong();
		
		Account found = null;
		for (Account a : accounts) {
			if (a.getAccountNum() == accountNum) {
				found = a;
				break;
			}
		}
		
		if (found == null) {
			System.out.println("Error: Account not found.");
			return;
		}
		
		System.out.println("\n======= Account Information =======");
		System.out.println("Account Number: " + found.getAccountNum());
		
		if (found instanceof Checking) {
			Checking c = (Checking) found;
			System.out.println("Type: Checking");
			System.out.println("Nickname: " + c.getNickname());
		}
		else if (found instanceof Savings) {
			Savings s = (Savings) found;
			System.out.println("Type: Savings");
			System.out.println("Nickname: " + s.getNickname());
			System.out.println("Interest Rate: " + s.getInterestRate());
		}
		else if (found instanceof Investment) {
			Investment i = (Investment) found;
			System.out.println("Type: Investment");
			System.out.println("Nickname: " + i.getNickname());
		}
		else if (found instanceof Loan) {
			Loan l = (Loan) found;
			System.out.println("Type: Loan");
			System.out.println("Interest Rate: " + l.getInterestRate());
		}
		
		System.out.println("Linked Clients:");
		found.listClients(); 
	}
	
	
	/**
	 * Method used to display all information for a specific client,
	 * including all the accounts they may have linked.
	 */
	private static void displayClient() {
		System.out.print("Enter client number to display: ");
		long clientNum = input.nextLong();
		
		Client found = null;
		for (Client c : clients) {
			if (c.getClientNumber() == clientNum) {
				found = c;
				break;
			}
		}
		
		if (found == null) {
			System.out.println("Error: Client not found.");
			return;
		}
		
		System.out.println("\n======= Client Information =======");
		System.out.println("Client Name: " + found.getName());
		System.out.println("Client Number: " + found.getClientNumber());
		System.out.println("BMO Member: " + (found.getIsBMOMember() ? "Yes" : "No"));
		
		//list all accounts belonging to the client
		System.out.println("Accounts linked to this client:");
		for (Account a : accounts) {
			//check if account belongs to this client
			if (a != null) {
				a.listClients();
			}
		}
	}
}
