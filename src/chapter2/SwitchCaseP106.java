package chapter2;

public class SwitchCaseP106 {
	public static void main(String[] args) {
		int floor = 6;
		String storeName;

		switch (floor) {
		case 1:
			storeName = "�౹";
			break;
		case 2:
			storeName = "�����ܰ�";
			break;
		case 3:
			storeName = "�Ǻΰ�";
			break;
		case 4:
			storeName = "ġ��";
			break;
		case 5:
			storeName = "�ｺ Ŭ��";
			break;
		default:
			storeName = "���� ��";
		}
		System.out.println(floor + "���� " + storeName + "�Դϴ�.");
	}
}
