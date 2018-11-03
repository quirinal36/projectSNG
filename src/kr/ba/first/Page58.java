package kr.ba.first;

import javax.swing.JOptionPane;

public class Page58 {

	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("입력"));
		
		int J = 2;
		while(true) {
			if(A % J == 0) {	
				break;
			}
			J = J + 1;
		}
		if(A == J) {
			System.out.println("소수");
		}else {
			System.out.println("소수아님");
		}
	}

}
