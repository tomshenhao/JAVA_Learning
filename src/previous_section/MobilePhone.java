package previous_section;
import java.util.ArrayList;

public class MobilePhone {
	
	private ArrayList<Contact> contactList;
	private String myNumber;
	private String name;
	
	public MobilePhone(String myNumber) {
		this.contactList = new ArrayList<Contact>();
		this.myNumber=myNumber;
		
	}

	private int searchContact(String name) {
		for(int i=0;i<contactList.size();i++) {
			if(contactList.get(i).getName()==name) {
				return i;
			} 
		}
		return -1;
	}
	
	public boolean addContact(Contact contact) {
		if(searchContact(name)>0) {
			System.out.println("Contact already exists");
			return false;
		} else {
			contactList.add(contact);
			return true;
		}				
	}
	
	public boolean modifyContact(String name, Contact newContact) {
		if(searchContact(name)>0) {
			contactList.set(searchContact(name), newContact);
			System.out.println("Contact: "+name+" replaced by"+newContact.getName()+" successfully");
			return true;
		}
		else {
			System.out.println("Contact not found in list");
			return false;
		}
	}
	
	public boolean removeContact(String name) {
		if(searchContact(name)>0) {
			contactList.remove(searchContact(name));
			System.out.println("Contact: "+name+" removed successfully");
			return true;
		}
		else {
			System.out.println("Contact not found in list");
			return false;
		}
	}
	
	public void printContact() {
		for(int i=0; i<contactList.size();i++) {
			System.out.println("Contact list: "+contactList.get(i).getName()+" --> "+contactList.get(i).getPhoneNumber());
		}
	}
			
}
