package ch01;
//�ڹ� �˰���
//01. ������ ������ �ּڰ��� �ִ� ���ϱ�
public class MinMaxPloblem {

	public static void main(String[] args) {
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		
		int min= numbers [0];
		int max= numbers [0];
		
		int minpos=0;
		int maxpos=0;
		
		for(int i=0; i<numbers.length; i++) {
			
			if(min > numbers[i]) {
				min= numbers[i];
				minpos =i+1;
			}
			if(max < numbers[i]) {
				max = numbers[i];
				maxpos =i+1;
			}
		}
		
		System.out.println("���� ū ���� " + max + "�̰�, ��ġ�� " + maxpos + "��° �Դϴ�.");
		System.out.println("���� ���� ���� " + min + "�̰�, ��ġ�� " + minpos + "��° �Դϴ�.");
	}

}
