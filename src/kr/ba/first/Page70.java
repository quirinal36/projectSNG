package kr.ba.first;

import javax.swing.JOptionPane;

public class Page70 {

	public static void main(String[] args) {
		int A[] = new int[100];

		int B = Integer.parseInt(JOptionPane.showInputDialog("B :"));

		int C = -1;
		int D = 2;
		int E = 0;
		int MOK = 0;

		while(B != D) {
			E = (int)Math.sqrt(B);
			if(D >E) {
				D = B;
			}
			MOK = (int)(B/D);
			int NMG = B-(MOK*D);
			if(NMG != 0) {
				D = D+1;
			}else {
				C = C+1;
				A[C] = D;
				B = MOK;
			}
			System.out.println(" /B:"+B +" /D:"+D +" /E:"+E +" /MOK:"+MOK +" /C:"+C +" /A[C]:"+A[C]);
		}
		for(int a :A) {
			System.out.println("A: " + a);
		}
	}
}
