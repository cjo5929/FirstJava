package ch05;

//	Queue LinkedList 로 구현하기
public class MyLinkedQueueTest {

	public static void main(String[] args) {

		MyLinkedQueue listQueue = new MyLinkedQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		listQueue.enQueue("D");
		listQueue.enQueue("E");
		
		System.out.println(listQueue.deQueue());
		listQueue.printAll();

	}

}
