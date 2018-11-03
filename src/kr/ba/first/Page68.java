package kr.ba.first;

import javax.swing.JOptionPane;

public class Page68 {

	public static void main(String[] args) {
		int A[] = new int[100];
		int B = Integer.parseInt(JOptionPane.showInputDialog("B 입력"));
		
		int C = 0, D = -1;
		
		while(C <= B) {
			C = C + 1;
			int MOK = (int)B/C;
			int NMG = B - (MOK * C);
			
			if(NMG == 0) {
				D = D + 1;
				A[D] = C;
			}
		}
		
		System.out.println("B:" + B);
		
		for(int i=0; i<=D; i++) {
			System.out.println("A["+i+"] = " + A[i]);
		}
	}

}
