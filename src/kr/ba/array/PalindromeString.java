package kr.ba.array;

import javax.swing.JOptionPane;

public class PalindromeString {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("please input:");
		
		char inputArr[] = new char[input.length()];
		
		for(int i=0; i<input.length(); i++) {
			inputArr[i] = input.charAt(i);
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
