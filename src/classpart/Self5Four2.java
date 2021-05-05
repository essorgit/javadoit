package classpart;

public class Self5Four2 {
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.OrderNo = "201803120001";
		order1.OrderId = "abc123";
		order1.OrderDate = "2018년 3월 12일";
		order1.OrderName = "홍길동";
		order1.OrderProductNo = "PD0345-12";
		order1.OrderAddress = "서울시 영등포구 여의도동 20번지";

		System.out.println("주문번호 : " + order1.OrderNo);
		System.out.println("주문아이디 : " + order1.OrderId);
		System.out.println("주문날짜 : " + order1.OrderDate);
		System.out.println("주문자 이름 : " + order1.OrderName);
		System.out.println("주문 상품 번호 : " + order1.OrderProductNo);
		System.out.println("배송 주소 : " + order1.OrderAddress);
	}

}
