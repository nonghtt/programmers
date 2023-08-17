package com.example.programmers.level_0;

public class 부분문자열인지확인하기 {

	public static void main(String[] args) {
		String my_string = "banana";
		String target = "ana";
		int answer =0;
		answer = my_string.contains(target) ? 1: 0;
		System.out.println(answer);
		/*
		my_string.indexOf(target) > -1 ? 1 : 0;
		indexof의 없으면 -1을 출력하고 있으면 인덱스를 출력하는 특성을 이용한 방법
		
		 */
	}
}
