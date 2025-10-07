import java.util.Scanner;
/**
 * Date: Wednesday, Oct 8, 2025;
 * @author Krystan Kornafel, Hailey Owen, and Ahmed Eldesouki
 * <p>Class: SEG2105
 * <p>Assignment: Assignment 2
 *
 * <p>Description: This is the Account class, used to store the data for each account.
 */


public interface Account {

	/** The parameter accountNum is used to get the account number for a particular client **/
	private long acountNum;
	/** Used to store the client's other information such as ageGroup and businessType **/
	private Client client;
		
	//getters and setters for accountNum
		protected getAccountNum(){
			return accountNum;
		}
		protected void setAccountNum(long accountNum) {
			this.accountNum = accountNum;
		}
	
	public void addClient();
	public void removeClient();
	

}
