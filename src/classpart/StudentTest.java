package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student01 studentAhn = new Student01();
		studentAhn.studentName = "¾È½Â¿¬"; 
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}

