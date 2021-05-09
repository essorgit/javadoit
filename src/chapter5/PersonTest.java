package chapter5;

public class PersonTest {
	
	public static void main(String[] args) {
		Person personLee = new Person();
		personLee.name = "이정재";
		personLee.weight = 70F;
		personLee.height = 180F;
		
		Person personBae = new Person("배수지",47,168);
		personBae.name = "배수지";
		personBae.weight = 47F;
		personBae.height = 168F;
	}
}
