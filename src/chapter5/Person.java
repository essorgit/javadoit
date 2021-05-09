package chapter5;

public class Person {
	String name;
	float height;
	float weight;

	public Person() {
	}

	public Person(String pname) {
		name = pname;
	}

//만약 처음 Person을 제외한 나머지는 아래 처럼 개별로 넣고, set~(05-4참고(p.143))을 써야함.
	public float setPerson(float pheight) {
		return height;
	}

//생성자가 한번에 생성하면서 값을 넣어주기 위해서는 아래 처럼 한꺼번에 초반에 모든 조건을 한 번에 설정
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}