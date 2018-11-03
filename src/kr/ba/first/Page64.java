package kr.ba.first;

public class Page64 {
	public static void main(String[] args) {
		int A[] = new int[99];
		
		int K = 1;
		while(K < 100) {
			K = K + 1;
			A[K-2] = K;
		}
		
		int i = 0;
		int J = 0;
		
		while(i < 99) {
			i = i + 1;
			System.out.println("i: " + i);
			
			if(A[i-1] != 0) {
				J = J + 1;
				int M = i;
				
				while(M < 99) {
					M = M + i;
					System.out.println("M : " + M);
					A[M] = 0;
					
				}
			}
		}
		for(int a : A) {
			System.out.print(a +" ");
		}
		System.out.println("\nJ: " + J);
	}
}
