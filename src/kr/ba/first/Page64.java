package kr.ba.first;

public class Page64 {
	public static void main(String[] args) {
		int A[] = new int[99];
		
		int K = 1;
		while(K < 100) {
			K = K + 1;
			A[K-2] = K;
		}
		
		int i = -1;
		int J = 0;
		int M = 0;
		
		while(true) {
			i = i + 1;
			
			if(i == 99) {
				//소수갯수 모두 확인 반복문 종
				System.out.println(J);
				break;
			}else if(A[i] == 0){
				// 소수가 아님, 다음 작업 
				continue;
			}else {
				// 
				J = J + 1;
				M = i;
				
				while(true) {
					M = M + A[i];
					if(M > 99) {
						break;
					}
					A[M] = 0;
				}
			}
			
			
		}
		for(int a : A) {
			System.out.print(a +" ");
		}
//		System.out.println("\nJ: " + J);
	}
}
