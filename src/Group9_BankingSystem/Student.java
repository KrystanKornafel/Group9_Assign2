import java.util.Scanner;
/**
 * Date: Wednesday, Oct 8, 2025;
 * @author Krystan Kornafel, Hailey Owen, and Ahmed Eldesouki
 * <p>Class: SEG2105
 * <p>Assignment: Assignment 2
 *
 * <p>Description: This is the Adult class, used to store the information of the Student's account. 
 **/
public class Student implements Client {
	
	
	/** No arg constructor*/
	public Student () {
	}
	
	/**
	 * Parameterized constructor to allow data to be passed into the object. The data can then be used to create the checking account for a particular client.
	 * @param clientName represents the name of the client
	 * 
	 * 
	 */
	public Student (String name, boolean isBMOMember, Account account) {
		super.(name, isBMOMember, account); //takes the information from the super class, which is Client 
	}

	/**
	 * Implements the Client's add method
	 */
	@Override
	public void addAccount() {
		
	}
	
	/**
	 * Implements the Client's remove method
	 */
	@Override
	public void removeAccount() {
		
	}
}
