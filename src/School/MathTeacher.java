package School;

public class MathTeacher extends SchoolStuff implements CourseInstructor  {

	@Override
	public void teach() {
		System.out.println("teaching math");		
	}

}
