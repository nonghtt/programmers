package com.example.programmers.level_0;

public class 카운트다운_10 {

	public static void main(String[] args) {

		int start = 10;
		int end =3;
		//10부터 3까지 배열에 담아서 출력
		
		int [] answer = new int[start-end+1];
		
		for(int i=0;i<answer.length;i++) {
			answer[i]=start-i;
			System.out.println(answer[i]);
		}
		
	}

}
