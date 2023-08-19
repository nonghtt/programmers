package com.example.programmers.level_0;

public class 글자이어붙여문자열만들기_11 {

	public static void main(String[] args) {

		String my_string = "cvsgiorszzzmrpaqpe";
		int[] index_list = { 16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7 };
		String answer = "";

		for (int i = 0; i < index_list.length; i++) {

			answer += my_string.charAt(index_list[i]);
		}

		System.out.println(answer);

		/*
		 * 스트링빌더를 쓰는 습관을 만들자. 
		 * StringBuilder sb = new StringBuilder();
		 * for (int idx : index_list) sb.append(my_string.charAt(idx));
		 * return sb.toString();
		 */

	}
}
