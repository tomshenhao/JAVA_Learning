package School;

public class SchoolStuff {
	private void makeAnnouncements() {
		System.out.println("making announcements");
	}
	
	private void takeAtendence() {
		System.out.println("take attendence");
	}
	
	private void collectPaperWork() {
		System.out.println("collect paper work");
	}
	
	private void conductHallwayDuties() {
		System.out.println("conduct hallway duties");
	}
	
	public void performOtherResponsibilities() {
		makeAnnouncements();
		takeAtendence();
		collectPaperWork();
		conductHallwayDuties();
	}
}
