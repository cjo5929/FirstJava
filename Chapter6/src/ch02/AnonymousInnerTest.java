package ch02;

//AnonymousInner �͸� ���� Ŭ����, 
/* Runnable runnable =new Runnable(){
 * 
 * public void run(){
 * }
 * };
 */


class Outer2{
	int outNum= 10;
	static int sNum =200;
	
	Runnable getRunnable(int i) {
		int num=100;
		
		return new Runnable() {
			
			int localNum = 10;
			
			@Override
			public void run() {
				//num = 200;   //���� ��. ���������� ����� �ٲ�
				//i = 100;     //���� ��. �Ű� ���� ���� ��������ó�� ����� �ٲ�
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(�ܺ� Ŭ���� ���� ����)");
				}
			
		};
	
	}

}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}
