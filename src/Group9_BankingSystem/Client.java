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
	private Account account;
	
	/** 
	 * No-arg constructor
	 */
	public Client() {
		
	}
	
	/** 
	 * Parameterized constructor
	 */
	public Client(String name, boolean isBMOMember, Account account) {
		this.name = name;
		this.isBMOMember = isBMOMember;
		this.account = account; //get this instance of the account object and store it for later use
	}
	
	//Getters and setters used to get the information about the business type of the client
		protected getName(){
			return name;
		}
		protected void setName(String name) {
			this.name = name; //return this instance of clientName
		}
	
	//Getters and setters used to get the information about the business type of the client
	protected getIsBMOMember(){
		return isBMOMember;
	}
	protected void setIsBMOMember(boolean isBMOMember) {
		this.isBMOMember = isBMOMember; //return this instance of isBMOMember
	}
	
	//put the add and remove methods here
	public void addAccount() {
		//add implementation
	}
	public void removeAccount() {
		//add implementation
	}
	
}