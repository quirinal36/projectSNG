package kr.ba.first;

/**
 * page 32.
 * 유형 3) 홀짝 판별을 이용한 반복 계산
 * (-1) * 2 * (-3) * ... * 100
 * @author leehg
 *
 */
public class Page32 {
	public static void main(String[] args) {
		int i = 0;
		long J = 1;
		while(i < 100) {
			i = i + 1;
			if(i % 2 == 0) {
				// 짝수 일때
				J = J * i;
			}else {
				// 홀수 일때
				J = J * -1 * i;
			}
			System.out.println("i: " + i +"/J: " + J);
		}
		System.out.println("J: " + J);
	}
}
