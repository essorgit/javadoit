package chapter2;

public class SwitchCaseP106 {
	public static void main(String[] args) {
		int floor = 6;
		String storeName;

		switch (floor) {
		case 1:
			storeName = "약국";
			break;
		case 2:
			storeName = "정형외과";
			break;
		case 3:
			storeName = "피부과";
			break;
		case 4:
			storeName = "치과";
			break;
		case 5:
			storeName = "헬스 클럽";
			break;
		default:
			storeName = "없는 층";
		}
		System.out.println(floor + "층은 " + storeName + "입니다.");
	}
}
