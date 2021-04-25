package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student01 student1 = new Student01(); // 첫 번째 학생 생성
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		Student01 student2 = new Student01(); // 두 번째 학생 생성
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}

}
