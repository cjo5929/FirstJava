package ch08;

public class Order {
	
	public int orderNum;
	public String customerPhoneNum;
	public String customerAddress;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	public int menuNum;
	
	public void showOrderInfo() {
		System.out.println("주문 접수 번호 :"+ orderNum);
		System.out.println("주문 핸드폰 번호: " + customerPhoneNum);
		System.out.println("주문 집 주소: " + customerAddress);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문 시간: " + orderTime);
		System.out.println("주문 가격: " + orderPrice);
		System.out.println("메뉴 번호: " + menuNum);
	}

}
