import java.util.Scanner;
/**
 * Date: Wednesday, Oct 8, 2025;
 * @author Krystan Kornafel, Hailey Owen, and Ahmed Eldesouki
 * <p>Class: SEG2105
 * <p>Assignment: Assignment 2
 *
 * <p>Description: This is the Client class, responsible for collecting all the data for each client.
 * <p> This class will also be used to record which accounts, investments and loans they have.
 */

	public abstract class Client {
	
	/** Used to get the name of the client **/
	private String name;
	/** Since this application collects information for clients from other banks, see if the client is from BMO.
	* Use the bollean variable to determine if the client is from BMO.**/
	private boolean isBMOMember;
	/** Account object, used to store and retrieve information of a client's specific account **/
	/** Used to store the client's other information such as ageGroup and businessType **/
	private Account[] accountArray;
	
	private long clientNumber;
	private int numAccounts;
	/** 
	 * Parameterized constructor
	 */
	public Client(String name, boolean isBMOMember, long clientNumber) {
		this.name = name;
		this.isBMOMember = isBMOMember;
		this.accountArray = new Account[0];
		this.numAccounts = 0;
		this.clientNumber = clientNumber;
	}
	
	protected Account[] getAccountArray(){
		return accountArray;
	}
	
	protected void setAccountArray(Account[] accountArray) {
		this.accountArray = accountArray;
	}
	
	//Getters and setters used to get the information about the business type of the client
	protected String getName(){
		return name;
	}
	protected void setName(String name) {
		this.name = name; //return this instance of clientName
	}
	
	protected long getClientNumber() {
		return clientNumber;
	}
	protected void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}
	
	//Getters and setters used to get the information about the business type of the client
	protected boolean getIsBMOMember(){
		return isBMOMember;
	}
	protected void setIsBMOMember(boolean isBMOMember) {
		this.isBMOMember = isBMOMember; //return this instance of isBMOMember
	}
	
	//put the add and remove methods here
	protected void addAccount(Account account) {
		numAccounts++;
		Account[] newArray = new Account[numAccounts];
		for (int i = 0; i < numAccounts - 1; i++) {
			newArray[i] = accountArray[i];
		}
		newArray[numAccounts-1] = account;
		accountArray = newArray;
	}
	protected void removeAccount(long accountNum) {
		if (numAccounts == 0) {
			System.out.println("Error: No account to remove");
			return;
		}
		for (int i = 0; i < numAccounts; i++) {
			if (accountArray[i].getAccountNum() == accountNum) {
				numAccounts--;
				Account[] newArray = new Account[numAccounts];
				int k = 0;
				for (int j = 0; j < numAccounts; j++) {
					if (j == i) { k++; }
					newArray[j] = accountArray[k];
					k++;
				}
				this.accountArray = newArray;
				return;
			}
		}
		System.out.println("Error: Invalid account number");
	}
	
}
