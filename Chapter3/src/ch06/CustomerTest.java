package ch06;

import java.util.ArrayList;

//상속 예제
public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerA = new Customer(10000, "AAA");
		Customer customerB = new Customer(10001, "BBB");
		Customer customerC = new GoldCustomer(10002, "CCC");
		Customer customerD = new GoldCustomer(10003, "DDD");
		Customer customerE = new VipCustomer(10004, "EEE",55);
		
		customerList.add(customerA);
		customerList.add(customerB);
		customerList.add(customerC);
		customerList.add(customerD);
		customerList.add(customerE);
		System.out.println("======고객 정보 출력========");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("======할인율과 보너스포인트 계산======");
		
		int price =10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+ "님이 " + cost + "원을 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+ "님의 보너스 포인트는"+ customer.bonusPoint + "점 입니다.");
		}
}
}