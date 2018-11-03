package kr.ba.first;

/**
 * 팩토리얼 합계 
 * 곱하기가 누적된다면 초기값을 1로 맞춘다.
 * 
 * @author leehg
 *
 */
public class Page43 {

	public static void main(String[] args) {
		int i = 1;
		int K = 1;
		int J = 1;
		
		while(i < 10) {
			i = i + 1;
			J = J * i;
			K = K + J;
			
			System.out.println("J: " + J + " /i: " + i +" /K: " + K);
		}
		
		System.out.println("10 까지의 팩토리얼의 합계: " + K);
	}

}
