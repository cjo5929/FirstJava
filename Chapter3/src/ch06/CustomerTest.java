package ch06;

import java.util.ArrayList;

//��� ����
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
		System.out.println("======�� ���� ���========");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("======�������� ���ʽ�����Ʈ ���======");
		
		int price =10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+ "���� " + cost + "���� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName()+ "���� ���ʽ� ����Ʈ��"+ customer.bonusPoint + "�� �Դϴ�.");
		}
}
}