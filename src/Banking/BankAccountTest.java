package Banking;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;


public class BankAccountTest {
	
	private BankAccount account; 
	private static int count;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("This executes before any test cases. Count = "+count++);
	}	
	
	@Before
	public void setup() {
		account = new BankAccount("Tom","Shen", 1000.00);
		System.out.println("running a test...");
	}	

	@Test
	public void testDeposit() {
		double balance = account.deposit(200, true);
		assertEquals(1200.00, balance,0);
		assertEquals(1200.00, account.getBalance(),0);
	}

	@Test
	public void testWithdraw() {
		account.withdraw(200, true);
		}

	@Test
	public void testGetBalance_deposit() {
		account.deposit(200, true);
		assertEquals(1200.00, account.getBalance(),0);
	}	
	
	@Test
	public void testGetBalance_withdraw() {
		account.withdraw(200, true);
		assertEquals(800.00, account.getBalance(),0);
	}	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("This executes after any test cases. Count = "+ count++);
	}
	
	@After
	public void teardown() {
		System.out.println("Count = "+count++);
	}
	
}
