package classpart;

public class Student01 {
	int studentID; // 학번
	String studentName; // 학생이름
	int grade; // 학년
	String address; // 사는 곳

	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // 이름, 주소 출력
	}

	public String getStudentName() {
		// TODO Auto-generated method stub
		return this.studentName;
	}
}
