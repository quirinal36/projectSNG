package kr.ba.array;

import javax.swing.JOptionPane;

public class PalindromeInt {

	public static void main(String[] args) {
		
		String inputStr = JOptionPane.showInputDialog("please input Integer : ");
		int input = Integer.parseInt(inputStr);
		int inputArr[] = new int[inputStr.length()];
		
		for(int i=0; i<inputArr.length; i++) {
			inputArr[i] = input % 10;
			input /= 10;
		}
		
		boolean isPalindrome = true;
		for(int i=0; i<inputArr.length/2; i++) {
			if(inputArr[i] != inputArr[inputArr.length-1-i]) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("this is Palindrome");
		}else {
			System.out.println("this is Not Palindrome");
		}
	}

}
