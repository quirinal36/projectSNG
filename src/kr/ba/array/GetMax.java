package kr.ba.array;

public class GetMax {

	public static void main(String[] args) {
		int array[] = {20,50,77,98,46,13,24,65,64,51};
		int max = 0;
		for(int num : array) {
			if(max < num) {
				max = num;
			}
		}
		System.out.println("max : " + max);
	}

}
