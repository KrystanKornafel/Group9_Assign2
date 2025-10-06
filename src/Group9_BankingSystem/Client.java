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
class Client {
	
	/** Used to determine if the client in a minor, student or adult **/
	private String ageGroup;
	/** Used to determine if client is an investor, individual, small business, or large business **/
	private String businessType;
	/** Since this application collects information for clients from other banks, see if the client is from BMO.
	* Use the bollean variable to determine if the client is from BMO.**/
	private boolean isBMOClient;
	
	/** No arg constructor*/
	public Client () {
	}
	
	/**
	 * Parameterized constructor to allow data to be passed into the object. The data can then be used to create the checking account for a particular client.
	 * @param accountNum is used to get the account number for the client
	 * @param nickname is used to get the nickname for the client's account
	 * @param client is used to get the information on the client object 
	 */
	public Client (String ageGroup, String businessType, boolean isBMOClient) {
		this.ageGroup = ageGroup;
		this.businessType = businessType;
		this.isBMOClient = isBMOClient;
	}
	
	//Getters and setters for the client's age group
	protected getAgeGroup(){
		return ageGroup;
	}
	protected void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup; //return this instance of accountNum
	}
	
	//Getters and setters used to get the information about the business type of the client
	protected getBusinessType(){
		return businessType;
	}
	protected void setBusinessType(String businessType) {
		this.businessType = businessType; //return this instance of accountNum
	}
	
	//Getters and setters used to get the information about the business type of the client
	protected getIsBMOClient(){
		return isBMOClient;
	}
	protected void setIsBMOClient(boolean isBMOClient) {
		this.isBMOClient = isBMOClient; //return this instance of accountNum
	}
	
	//put the add and remove methods here
	
}