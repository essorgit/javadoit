package chapter5;

public class PesronTestP157 {
	public static void main(String[] args) {
		PersonP157 personKim = new PersonP157();
		personKim.name = "김유신";
		personKim.height = 85.5F;
		personKim.weight = 180.0F;

		PersonP157 personLee = new PersonP157("이순신", 175, 75);
		//선언하고 안써서 그냥 왜 이거 안쓰니? 하고 알려주는 경고 메세지.
	}
}