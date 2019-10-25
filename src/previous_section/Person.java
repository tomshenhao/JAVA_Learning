package previous_section;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setFirstName(String name) {
		firstName=name;
	}
	
	public void setLastName(String name) {
		lastName=name;
	}
	
	public void setAge(int number) {
		if (number<0 |number > 100) {
			age=0;
		} else {
			age=number;
		}
	}
	
	public boolean isTeen() {
		if (age > 12 & age < 20) {
			return true;
		} else {
			return false;
		}	
	}
	
	public String getFullName() {
		if (firstName.isEmpty() & lastName.isEmpty()) {
			return "";
		} else if (lastName.isEmpty()) {
			return firstName;
		} else if (firstName.isEmpty()) {
			return lastName;
		} else {
			return firstName+" "+lastName;
		}
	}
}
