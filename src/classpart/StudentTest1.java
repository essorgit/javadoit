package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student01 student1 = new Student01(); // ù ��° �л� ����
		student1.studentName = "�ȿ���";
		System.out.println(student1.getStudentName());
		Student01 student2 = new Student01(); // �� ��° �л� ����
		student2.studentName = "�Ƚ¿�";
		System.out.println(student2.getStudentName());
	}

}
