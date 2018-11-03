package kr.ba.first;
/**
 * 1+2+4+7+11+16+22+ ... 의 순서로 나열되는 수열의
 * 20번째 항까지의 합계를 구하는 순서도를 작성하시오
 * 
 * @author leehg
 *
 */
public class Page37 {

	public static void main(String[] args) {
		int i = 0;
		int J = 1;
		int K = 1;
		for(i=0; i < 20; i++) {
			J = J + i;
			K = K + J;
			System.out.print(J + "+");
		}
		System.out.print("=" + K);
	}
}
