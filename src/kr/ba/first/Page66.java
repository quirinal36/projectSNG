package kr.ba.first;

import javax.swing.JOptionPane;

public class Page66 {

	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("A 입력"));
		int B = Integer.parseInt(JOptionPane.showInputDialog("B 입력"));
		int BIG, SMALL;
		int GCM, LCM;
		
		if(A >= B) {
			BIG = A;
			SMALL = B;
		}else {
			BIG = B;
			SMALL = A;
		}
		
		while(true) {
			int MOK = (int)BIG/SMALL;
			int NMG = BIG - (MOK * SMALL);
			
			if(NMG == 0) {
				GCM = SMALL;
				LCM = A * B / GCM;
				break;
			}else {
				BIG = SMALL;
				SMALL = NMG;
			}
		}
		
		System.out.println("GCM:" + GCM);
		System.out.println("LCM:" + LCM);
	}
}
