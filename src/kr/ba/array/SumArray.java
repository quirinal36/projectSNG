package kr.ba.array;

public class SumArray {
	public static void main(String[] args) {
		int array[] = {20,50,77,98,46,13,24,65,64,51};
		
		int sum = 0;
		for(int num : array) {
			sum += num;
		}
		
		System.out.println("sum : " +sum);
		
		double average = (double)sum / array.length;
		System.out.println("ave : " + average);
	}
}
