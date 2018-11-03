package kr.ba.first;

/**
 * 1 + 2 + 3 + ... + 100
 * 까지의 합을 구하는 알고리즘
 * 
 * @author leehg
 *
 */
public class Page24 {

	public static void main(String[] args) {
		int i=0;
		int J = 0;
		int SW = 0;
		
		while(i<100) {
			i = i + 1;
			System.out.print("i: " + i + " /SW: " + SW);
			if(SW == 0) {
				J = J + i;
				SW = 1;
			}else {
				J = J - i;
				SW = 0;
			}
			System.out.println(" /J: " + J);
		}
		
		System.out.println("i : " + i);
		System.out.println("J : " + J);
	}

}
