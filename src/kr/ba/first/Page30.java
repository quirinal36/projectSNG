package kr.ba.first;

/**
 * Page 30.
 * 유형 2) 순서에 의한 반복 계산
 *
 * 1 - 2 + 3 - 4 + 5 - 6 + ... - 98 + 99 까지의 합계를 구하는 순서도
 * 
 * @author leehg
 *
 */
public class Page30 {
	public static void main(String[] args) {
		int i = 0;
		int J = 0;
		
		while(true) {
			i = i + 1;
			J = J + i;
			
			if(i == 99) {
				break;
			}
			
			i = i + 1;
			J = J - i;
		}
		
		System.out.println("J : " + J);
	}
}
