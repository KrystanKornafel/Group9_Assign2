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
	private long accountNum;
	/** Used to store the client's other information such as ageGroup and businessType **/
	private Client[] clientArray;
	private int numClients;
	

	/** 
	 * Parameterized constructor
	 */
	protected Account(long accountNum, Client client) {
		this.accountNum = accountNum;
		this.clientArray = new Client[1];
		this.clientArray[0] = client;
		this.numClients = 1;
	}
	
	protected Client[] getClientArray(){
		return clientArray;
	}
	
	protected void setClientArray(Client[] clientArray){
		this.clientArray = clientArray;
	}
	
	//getters and setters for accountNum
	protected long getAccountNum(){
		return accountNum;
	}
	protected void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	
	protected boolean addClient(Client client) {
		if (numClients == 8) {
			System.out.println("Error: Too many clients");
			return false;
		} else {
			numClients++;
			Client[] newArray = new Client[numClients];
			for (int i = 0; i < numClients - 1; i++) {
				newArray[i] = clientArray[i];
			}
			newArray[numClients-1] = client;
			clientArray = newArray;
			return true;
		}
	}
	protected boolean removeClient(long clientNum) {
		if (numClients == 1) {
			System.out.println("Error: Too few clients");
			return false;
		}
		for (int i = 0; i < numClients; i++) {
			if (clientArray[i].getClientNumber() == clientNum) {
				numClients--;
				Client[] newArray = new Client[numClients];
				int k = 0;
				for (int j = 0; j < numClients; j++) {
					if (j == i) { k++; }
					newArray[j] = clientArray[k];
					k++;
				}
				this.clientArray = newArray;
				return true;
			}
		}
		System.out.println("Error: Invalid client number");
		return false;
	}
	protected void listClients() {
		for (int i = 0; i < numClients; i++) {
			System.out.println("Client " + (i+1) + ": " + clientArray[i].getName() + " (#" + clientArray[i].getClientNumber() + ")");
		}
	}
}
