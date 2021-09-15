package ch01;
//자바 알고리즘
//01. 나열된 수에서 최솟값과 최댓값 구하기
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
		
		System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxpos + "번째 입니다.");
		System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minpos + "번째 입니다.");
	}

}
