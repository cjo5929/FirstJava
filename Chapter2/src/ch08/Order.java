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
		System.out.println("�ֹ� ���� ��ȣ :"+ orderNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ: " + customerPhoneNum);
		System.out.println("�ֹ� �� �ּ�: " + customerAddress);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ� �ð�: " + orderTime);
		System.out.println("�ֹ� ����: " + orderPrice);
		System.out.println("�޴� ��ȣ: " + menuNum);
	}

}
