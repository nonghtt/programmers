package com.example.programmers.level_0;

public class 문자열앞의n글자_6 {

	public static void main(String[] args) {
		
		String my_string = "ProgrammerS123";
		int n = 11;
		String answer = "";
		
		answer = my_string.substring(0, n);
		System.out.println(answer);
		
	}

}
