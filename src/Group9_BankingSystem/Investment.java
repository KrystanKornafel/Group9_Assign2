import java.util.Scanner;
/**
 * Date: Wednesday, Oct 8, 2025;
 * @author Krystan Kornafel, Hailey Owen, and Ahmed Eldesouki
 * <p>Class: SEG2105
 * <p>Assignment: Assignment 2
 *
 * <p>Description: This is the Investment class, used to collect the information of each investment a client has.
 */
//This class implements the ___ class
class Investment {
	
	/** The parameter accountNum is used to get the account number for a particular client **/
	private long acountNum;
	/** The parameter nickname is used to get the nickname for a particular account **/
	private String nickname;
	/** Used to store the client's other information such as ageGroup and businessType **/
	private Client client;

	/** No arg constructor*/
	public Investment () {
	}
	
	/**
	 * Parameterized constructor to allow data to be passed into the object. The data can then be used to create the checking account for a particular client.
	 * @param accountNum is used to get the account number for the client
	 * @param nickname is used to get the nickname for the client's account
	 * @param client is used to get the information on the client object 
	 */
	public Investment (long accountNum, String nickname, Client client) {
		this.accountNum = accountNum;
		this.nickname = nickname;
		this.client = client;
	}

	
	//Getters and setters for the client's account number 
	protected getAccountNum(){
		return accountNum;
	}
	protected void setAccountNum(long accountNum) {
		this.accountNum = accountNum; //return this instance of accountNum
	}
	
	//Getters and setters for the nickname of a particular account 
	protected getNickname(){
		return nickname;
	}
	protected void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	//put the add and remove methods here
	
}

