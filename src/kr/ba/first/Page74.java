package kr.ba.first;

import javax.swing.JOptionPane;

public class Page74 {
	public static void main(String[] args) {
		char A[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		int B = Integer.parseInt(JOptionPane.showInputDialog("B:"));
		int C = Integer.parseInt(JOptionPane.showInputDialog("C:"));
		
		int D = 1;
		
		while(D != C) {
			D = D * B;
		}
		
	}
}
