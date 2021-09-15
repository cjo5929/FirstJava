package ch02;

public class VipCustomer extends Customer {
	double salesRatio;
	private int agentId;
	
	public VipCustomer() {
		
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
	}
	

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * 0.05;
		price -= (int)(price * salesRatio);
		return price;
	}


	public int getAgentId() {
		return agentId;
	}
	

}
