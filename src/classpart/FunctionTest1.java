package classpart;

public class FunctionTest1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int sum1 = minus(num1, num2);
		System.out.println(num1 + "-" + num2 + " = " + sum1 + "입니다");

		int sum2 = multiple(num1, num2);
		System.out.println(num1 + "*" + num2 + " = " + sum2 + "입니다");

		int sum3 = devide(num1, num2);
		System.out.println(num1 + "/" + num2 + " = " + sum3 + "입니다");

	}

	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result; // 결과 값 반환
	}

	public static int multiple(int n1, int n2) {
		int result = n1 * n2;
		return result; // 결과 값 반환
	}

	public static int devide(int n1, int n2) {
		int result = n1 / n2;
		return result; // 결과 값 반환

	}

}
