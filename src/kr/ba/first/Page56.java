package kr.ba.first;

import java.util.Scanner;

public class Page56 {
	public static void main(String[] args) {
		int A;
		System.out.print("A 를 입력하세요: ");
		Scanner in = new Scanner(System.in);

		A = in.nextInt();
		in.close();
		
		int i = A - 1;
		int J = 2;
		
		while(J <= i) {
			System.out.println("J: " + J);
			if(A % J == 0) {
				System.out.println("소수아님");
				return;
			}else {
				J = J + 1;
			}
		}
		System.out.println("소수");
	}
}
