package homeWork3;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setId(1);
		student1.setFirstName("Zeynep");
		student1.setLastName("TOPRAK");
		student1.setEmail("zeynep@hotmail.com");
		student1.setPassword(12345);
		student1.setCourseCompletionRate("% 50'si tamamland�");
		
		Instructor �nstructor1=new Instructor();
		�nstructor1.setId(1);
		�nstructor1.setFirstName("Engin");
		�nstructor1.setLastName("DEM�RO�");
		�nstructor1.setEmail("engin@hotmail.com");
		�nstructor1.setPassword(678910);
		�nstructor1.setCourseGiven("Kurs verildi");
		
		
		
		UserManager userManager=new UserManager();
		userManager.add(student1);
		
		StudentManager studentManager=new StudentManager();
		studentManager.completedCourse();
		
		
		InstructorManager �nstructorManager=new InstructorManager(); 
		�nstructorManager.deletedCourse();
		
		
	

	
	}

	

}
