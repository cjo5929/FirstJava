package ch19;

// ���ڷ����� ������ Ȱ���� ������ Ŀ�� �ӽ� ���α׷�


public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee EtiopiaAmericano =new EtiopiaAmericano();
		EtiopiaAmericano.brewing();
		System.out.println();
		
		Coffee EtiopiaLatte =new Latte(EtiopiaAmericano);
		EtiopiaLatte.brewing();
		System.out.println();
		
		Coffee EtiopiaMocha = new Mocha(new Latte(new EtiopiaAmericano()));
		EtiopiaMocha.brewing();
		System.out.println();
		Coffee EtiopiaWhippedCream = new WhippedCream(new Mocha(new Latte(new EtiopiaAmericano())));
		EtiopiaWhippedCream.brewing();
		System.out.println();
		Coffee KenyaAll = new WhippedCream(new Mocha(new Latte(new KenyaAmericano())));
		KenyaAll.brewing();

	}

}
