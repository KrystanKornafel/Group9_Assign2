import java.util.Scanner;
/**
 * Date: Wednesday, Oct 8, 2025;
 * @author Krystan Kornafel, Hailey Owen, and Ahmed Eldesouki
 * <p>Class: SEG2105
 * <p>Assignment: Assignment 2
 *
 * <p>Description: This is the Account class, used to store the data for each account.
 */


public abstract class Account {

	/** The parameter accountNum is used to get the account number for a particular client **/
	private long acountNum;
	/** Used to store the client's other information such as ageGroup and businessType **/
	private Client[] clientArray;
	private int numClients;
	
	/** 
	 * No-arg constructor
	 */
	public Account() {
		
	}
	

	/** 
	 * Parameterized constructor
	 */
	protected Account(long accountNum, Client client) {
		this.accountNum = accountNum;
		this.clientArray = new Client[1];
		this.clientArray[0] = client;
		this.numClients = 1;
	}
	
	//getters and setters for accountNum
	protected getAccountNum(){
		return accountNum;
	}
	protected void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	
	protected void addClient(Client client) {
		if (numClients == 8) {
			System.out.println("Error: Too many clients");
		} else {
			numClients++;
			Client[] newArray = new Client[numClients];
			for (int i = 0; i < numClients - 1; i++) {
				newArray[i] = clientArray[i];
			}
			newArray[numClients-1] = client;
			clientArray = newArray;
		}
	}
	protected void removeClient() {
		if (numClients == 1) {
			System.out.println("Error: Too few clients");
		}
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the client number of the client you wish to remove: ");
		int n = reader.nextInt();
		reader.close();
		for (int i = 0; i < numClients; i++) {
			if (clientArray[i].getClientNumber() == n) {
				numClients--;
				Client[] newArray = new Client[numClients];
				int k = 0;
				for (int j = 0; j < numClients - 1; j++) {
					if (j == i) { k++; }
					newArray[j] = clientArray[k];
					k++;
				}
				clientArray = newArray;
				return;
			}
		}
		System.out.println("Error: Invalid client number");
	}

}
