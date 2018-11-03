package kr.ba.first;

/**
 * 합계가 누적된다면 초기값이 0이다.
 * 
 * @author leehg
 *
 */
public class Page41 {

	public static void main(String[] args) {
		int i = 0;
		int J = 0;
		int K = 0;
		int L = -1;
		
		while(i<19) {
			i = i + 1;
			J = J + i;
			L = L * -1;
			K = K + (J * L);
			System.out.println("J: " + J + " /L: " + L +" /K: " + K);
		}
		System.out.println("\n K: " + K);
		
	}

}
