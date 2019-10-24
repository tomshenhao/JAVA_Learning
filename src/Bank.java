import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Branch> branchs;
	
	public Bank(String name) {
		this.name = name;
		this.branchs=new ArrayList<Branch>();
	}
	
	public boolean addBranch(String branchName) {
		if(findBranch(branchName) == null) {
			this.branchs.add(new Branch(branchName));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		Branch branch=findBranch(branchName);
		if(branch!=null) {
			return branch.newCustomer(customerName, initialAmount);
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branch branch=findBranch(branchName);
		if(branch!=null) {
			return branch.addCustomerTransaction(customerName, amount);
		}		
		return false;
	}

	private Branch findBranch(String branchName) {
		for(int i=0; i<this.branchs.size();i++) {
			Branch checkedBranch=this.branchs.get(i);
			if(checkedBranch.getName().equals(branchName)) {
				return checkedBranch;
			}
		}
		return null;
	}
	
	public boolean listCustomers(String branchName, boolean showTranscations) {
		Branch branch=findBranch(branchName);
		if(branch !=null) {
			System.out.println("Customer details for branchs "+branch.getName());
			
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for(int i=0;i<branchCustomers.size();i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer:"+branchCustomer.getName()+"["+(i+1)+"]");
				if(showTranscations) {
					System.out.println("Transactions");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for(int j=0;j<transactions.size();j++) {
						System.out.println("["+(j+1)+"] Amount "+transactions.get(j));
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
}
