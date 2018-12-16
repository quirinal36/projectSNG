package kr.ba.first;

import javax.swing.JOptionPane;

public class Page72 {
	public static void main(String[] args) {
		int A[] = new int[10];
		int B = Integer.parseInt(JOptionPane.showInputDialog("B: "));
		int BB = B;
		int C = -1;
		
		while(true) {
			C = C + 1;
			int MOK = (int)(B/2);
			int NMG = B - (MOK * 2);
			
			A[C] = NMG;
			if(MOK == 0) {
				break;
			}
			
			B = MOK;
		}
		
		System.out.println("BB: " +BB);
		
		for(int i=C; i>-1; i--) {
			System.out.print(A[i]);
		}
	}
}
