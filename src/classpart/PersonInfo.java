package classpart;

public class PersonInfo {
	String personName;
	String personAge;
	String personMarry;
	int personChildren;

	public String getPersonName() {
		return personName;
	}

	public static void main(String[] args) {
		PersonInfo personJames = new PersonInfo();
		personJames.personName = "이름은 " + "James" + " 입니다";
		personJames.personMarry = "He " + "is Married";
		personJames.personAge = "40";
		personJames.personChildren = 3;

		System.out.println(personJames.personName);
		System.out.println(personJames.personMarry);
		System.out.println(personJames.personAge);
		System.out.println(personJames.personChildren);

		PersonInfo personTom = new PersonInfo();
		personTom.personAge = "20";
		System.out.println(personTom.personAge + personJames.personAge); // Age가 int가 아닌 string으로 선언 시, 문자가 이어짐.

	}
}
