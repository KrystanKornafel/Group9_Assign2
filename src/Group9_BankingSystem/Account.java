import java.util.Scanner;
/**
 * Date: Wednesday, Oct 8, 2025;
 * @author Krystan Kornafel, Hailey Owen, and Ahmed Eldesouki
 * <p>Class: SEG2105
 * <p>Assignment: Assignment 2
 *
 * <p>Description: This is the Savings class, used to collect the information for the client's savings account.
 */


public interface Account {

	/** The parameter accountNum is used to get the account number for a particular client **/
	private long acountNum;
	/** The parameter nickname is used to get the nickname for a particular account **/
	private String nickname;
	/** The parameter interestRate is used to determine the interest rate for a particular account **/
	private float interestRate;
	/** Used to store the client's other information such as ageGroup and businessType **/
	private Client client;
	
//	/** No arg constructor*/
//	public Account () {
//	}
//	
//	/**
//	 * Parameterized constructor to allow data to be passed into the object. The data can then be used to create the checking account for a particular client.
//	 * @param accountNum is used to get the account number for the client
//	 * @param nickname is used to get the nickname for the client's account
//	 */
//	public Account (long accountNum, String nickname,  Client client) {
//		this.accountNum = accountNum;
//		this.nickname = nickname;
//		this.client = client;
//	}
}
