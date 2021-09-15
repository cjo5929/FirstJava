package ch15;
// 여러 인터페이스 구현
public class CustomerTest  {

	public static void main(String[] args) {
			Customer customer =new Customer();
			customer.buy();
			customer.sell();
			customer.hello();
			customer.order();
	}

}
