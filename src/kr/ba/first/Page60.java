package kr.ba.first;

import javax.swing.JOptionPane;

public class Page60 {

	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("입력"));
		
		int J = 2;
		
		while( J <= Math.sqrt((double)A)) {
			if( A % J == 0 ) {
				System.out.println("소수아님");
				return;
			}else {
				J = J + 1;
			}
		}
		System.out.println("소수");
	}

}
