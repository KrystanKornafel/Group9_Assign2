import java.util.Scanner;
/**
 * Date: Wednesday, Oct 8, 2025;
 * @author Krystan Kornafel, Hailey Owen, and Ahmed Eldesouki
 * <p>Class: SEG2105
 * <p>Assignment: Assignment 2
 *
 * <p>Description: This is the Adult class, used to store the information of the Adult clients
 **/
public class Adult extends Client {
	/** Used to determine if client is an investor, individual, small business, or large business **/
	private String businessType;
	
	/**
	 * Parameterized constructor to allow data to be passed into the object. The data can then be used to create the checking account for a particular client.
	 * @param accountNum is used to get the account number for the client
	 * @param nickname is used to get the nickname for the client's account
	 * @param client is used to get the information on the client object 
	 */
	public Adult (String name, boolean isBMOMember, Account account, long clientNumber, String businessType) {
		super(name, isBMOMember, account, clientNumber); //takes the information from the super class, which is Client
		this.businessType = businessType; 
	}
	
	//Getters and setters used to get the information about the business type of the client
	public String getBusinessType(){
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType; //return this instance of accountNum
	}
	
}
