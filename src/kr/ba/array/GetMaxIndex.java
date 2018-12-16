package kr.ba.array;

public class GetMaxIndex {

	public static void main(String[] args) {
		int array[] = {20,50,77,98,46,13,24,65,64,51};
		
		int i = 0;
		int max = 0;
		int index = 0;
		
		for(i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		
		System.out.println("max : " +max);
		System.out.println("index : " + index);
	}

}
