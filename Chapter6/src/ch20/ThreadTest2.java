package ch20;

//Runnable ¾²·¹µå
class MyThread2 implements Runnable{

	public void run(){
		
		int i;
		for(i=0; i<200; i++){
			
			System.out.print(i + "\t");
	
			
		}
	}
}


public class ThreadTest2 {

	public static void main(String[] args) {

		System.out.println("main start");
		
		MyThread thw= new MyThread();
		Thread th1 =new Thread(thw);
		th1.start();
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		
		System.out.println("main end");
	}

}
