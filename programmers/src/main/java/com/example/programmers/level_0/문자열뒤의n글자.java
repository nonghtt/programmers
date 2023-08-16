package com.example.programmers.level_0;

public class 문자열뒤의n글자 {

	public static void main(String[] args) {
		String my_string = "ProgrammerS123";
		int n = 11;
		String answer = "";
		answer =my_string.substring(my_string.length()-n, my_string.length());
		System.out.println(answer);

		/*
			my_string.substring(my_string.length() - n);
			인자가 하나만 있을 경우 매개변수 다음 인덱스부터 마지막까지
		*/
		
		
	}

}
