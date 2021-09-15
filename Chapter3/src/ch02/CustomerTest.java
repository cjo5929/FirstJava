package ch02;

//상속 예제
public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("LEE");
		customerLee.setCustomerId(10010);
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(10000);
		
		customerLee.showInfo();
		System.out.println(price);
		
		
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(10020);
		customerKim.bonusPoint = 10000;
		customerKim.showInfo();
		price = customerKim.calcPrice(10000);
		
		
		System.out.println(price);
		
		Customer vs = new VipCustomer(); //업 캐스팅
		
		System.out.println(vs.calcPrice(500)); //가상 메서드 호출 
	}

}
