package kr.ba.first;

public class Page45 {

	public static void main(String[] args) {
		int A = 1;
		int B = 1;
		int HAP = A + B;
		int CNT = 2;
		while(true){
			int C = A + B;
			HAP = HAP + C;
			CNT = CNT + 1;
			
			System.out.println("a: " + A + "/ b: " +B +" /c: " + C +" /cnt: " + CNT +" /hap: " + HAP);
			if(CNT == 20) {
				break;
			}
			
			A = B;
			B = C;
		}
		System.out.println("HAP : " + HAP);
	}

}
