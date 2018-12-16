package kr.ba.first;

public class Page78 {

	public static void main(String[] args) {
		int arr[] = {70, 80, 60, 90, 70};
		int j = 0;
		int max = 0;
		int i;
		for(i=0; i<5; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 값은 " + max + " 입니다.");
	}

}
