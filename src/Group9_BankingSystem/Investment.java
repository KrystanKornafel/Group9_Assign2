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
public class Investment implements Account {
	
	/** The parameter nickname is used to get the nickname for a particular account **/
	private String nickname;

	/**
	 * Parameterized constructor to allow data to be passed into the object. The data can then be used to create the checking account for a particular client.
	 * @param accountNum is used to get the account number for the client
	 * @param nickname is used to get the nickname for the client's account
	 * @param client is used to get the information on the client object 
	 */
	public Investment (long accountNum, String nickname, Client client) {
		super.(accountNum, client); //Inherits this number from the Account super class
		this.nickname = nickname;
	}
	
	//Getters and setters for the nickname of a particular account 
	public getNickname(){
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}

