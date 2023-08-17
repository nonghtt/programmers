package com.example.programmers.level_0;

public class 부분문자열_4 {

	public static void main(String[] args) {
		int answer = 0;
		String str1 = "abc";
		String str2 = "aabcc";
		if(str2.indexOf(str1)!= -1) {
			answer = 1; 
		}
		
		System.out.println(answer);
	}	
	
}
