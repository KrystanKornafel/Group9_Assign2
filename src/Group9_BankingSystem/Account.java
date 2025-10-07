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
	private Client client;
	
	/** 
	 * No-arg constructor
	 */
	public Account() {
		
	}
	

	/** 
	 * Parameterized constructor
	 */
	public Account(long accountNum, Client client) {
		this.accountNum = accountNum;
		this.client = client; //this instance of the client object, retrieve and store it
	}
	
	//getters and setters for accountNum
		protected getAccountNum(){
			return accountNum;
		}
		protected void setAccountNum(long accountNum) {
			this.accountNum = accountNum;
		}
	
	public void addClient() {
		//implementation
	}
	public void removeClient() {
		//add implementation
	}
	

}
