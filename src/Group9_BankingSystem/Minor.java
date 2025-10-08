import java.util.Scanner;
/**
 * Date: Wednesday, Oct 8, 2025;
 * @author Krystan Kornafel, Hailey Owen, and Ahmed Eldesouki
 * <p>Class: SEG2105
 * <p>Assignment: Assignment 2
 *
 * <p>Description: This is the Minor class, used to store the information of the Minor clients.
 **/

public class Minor extends Client {
	
	
	/**
	 * Parameterized constructor to allow data to be passed into the object. The data can then be used to create the checking account for a particular client.
	 * @param clientName represents the name of the client
	 * 
	 * 
	 */
	public Minor (String name, boolean isBMOMember, Account account, long clientNumber) {
		super(name, isBMOMember, account, clientNumber); //takes the information from the super class, which is Client 
	}

}
