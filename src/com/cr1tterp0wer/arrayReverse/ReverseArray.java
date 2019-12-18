package com.cr1tterp0wer.arrayReverse;

public class ReverseArray {
	public static void main(String[] args) {
		char[] arr = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
		
		char tmp;
		for( int i = 0; i < arr.length/2; i++ ) {
			tmp = arr[i];
			arr[i] = arr[(arr.length - i)-1]; 
            arr[(arr.length - i)-1] = tmp;
		}
		for( int i = 0; i < arr.length; i++ )
			System.out.print(arr[i]);
	}
}
