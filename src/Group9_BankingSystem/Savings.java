import java.util.Scanner;
/**
 * Date: Wednesday, Oct 8, 2025;
 * @author Krystan Kornafel, Hailey Owen, and Ahmed Eldesouki
 * <p>Class: SEG2105
 * <p>Assignment: Assignment 2
 *
 * <p>Description: This is the Savings class, used to collect the information for the client's savings account.
 */

//This class implements the ___ class
public class Savings implements Account {
	
	/** The parameter nickname is used to get the nickname for a particular account **/
	private String nickname;
	/** The parameter interestRate is used to determine the interest rate for a particular account **/
	private float interestRate;
	
	/** No arg constructor*/
	public Savings () {
	}
	
	/**
	 * Parameterized constructor to allow data to be passed into the object. The data can then be used to create the checking account for a particular client.
	 * @param accountNum is used to get the account number for the client
	 * @param nickname is used to get the nickname for the client's account
	 */
	public Savings (long accountNum, String nickname, float interestRate, Client client) {
		super.(accountNum, client); //inherits this number from the Account super class
		this.nickname = nickname;
		this.interestRate = interestRate;
	}
	
	//Getters and setters for the nickname of a particular account 
	protected getNickname(){
		return nickname;
	}
	protected void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	//Getters and setters for account's interest rate
	protected getInterestRate(){
		return interestRate;
	}
	protected void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	//put the add and remove methods here
	@Override
	public void addClient() {
		
	}
	
	@Override
	public void removeClient() {
		
	}
}



