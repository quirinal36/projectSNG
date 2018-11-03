package kr.ba.first;

import javax.swing.JOptionPane;

public class Page62 {

	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("입력"));;
		
		int HAP = 0;
		int K = 2;
		int J = 2;
		
		while(K <= A) {
			J = 2;
			while(K % J != 0) {
				J = J + 1;
			}
			if(K == J) {
				System.out.println(" 소수다. K: "+ K);
				HAP = HAP + K;
			}
			K = K + 1;
		}
		System.out.println("HAP : " + HAP);
	}

}
