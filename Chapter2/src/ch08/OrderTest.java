package ch08;

public class OrderTest {

	public static void main(String[] args) {
			Order order =new Order();
			order.orderNum = 20202020;
			order.customerPhoneNum ="01045055929";
			order.customerAddress = "용인시 처인구";
			order.orderDate ="20210812";
			order.orderTime = "0815";
			order.orderPrice = 30000;
			order.menuNum = 2000;
			
			order.showOrderInfo();
	}
	
}