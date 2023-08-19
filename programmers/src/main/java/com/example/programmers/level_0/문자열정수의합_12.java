package com.example.programmers.level_0;

public class 문자열정수의합_12 {

	public static void main(String[] args) {

		String num_str = "123456789";
		int answer = 0;
		for (int i = 0; i < num_str.length(); i++) {
			answer += num_str.charAt(i) - '0';
		}
		
		/*
		 * 2번 코드가 더 효율적이다. 그 이유는
		 * 배열을 생성한 후에 for문에서는 요소를 바로 사용할 수 있기 때문이다.
		 * 그러나 내가 작성한 코드는 for문에서 계속 연산이 들어가기 때문에 비효율적이다.
		String[] numArr = num_str.split("");
		for (String num : numArr) {
			answer += Integer.parseInt(num);
		}
		*/
		System.out.println(answer);
	}
}
