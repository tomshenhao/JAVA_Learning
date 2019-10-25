package previous_section;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String args[]) {
		
		Bank bank=new Bank("National New Zealand Bank");
		
		bank.addBranch("Auckland");
		
		bank.addCustomer("Auckland", "Tom", 1.0);
		bank.addCustomer("Auckland", "Frances", 1.0);
		bank.addCustomer("Auckland", "Alvin", 1.0);
		
		bank.addBranch("Wellington");
		bank.addCustomer("Wellington", "Bob", 1.0);

		bank.addCustomerTransaction("Auckland", "Tom", 12.0);
		bank.addCustomerTransaction("Auckland", "Tom", 15.0);
		bank.addCustomerTransaction("Auckland", "Frances", 12.0);

		bank.listCustomers("Wellington", true);
	}	
}
