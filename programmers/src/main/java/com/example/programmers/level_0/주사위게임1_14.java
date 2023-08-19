package com.example.programmers.level_0;

public class 주사위게임1_14 {

	public static void main(String[] args) {

		int a =2;
		int b = 4;
		int answer = 0;
		
		if(a%2!=0&&b%2!=0) {
			answer = a*a +b*b;
		}else if((a%2!=0&&b%2==0)||(a%2==0&&b%2!=0)) {
			answer = 2*(a+b);
		}else if(a%2==0&&b%2==0) {
			answer = Math.abs(a-b);
		}
		
		System.out.println(answer);
	}

}
