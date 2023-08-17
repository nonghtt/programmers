package com.example.programmers.level_0;

public class 문자열찾기_2 {

	public static void main(String[] args) {
		// 1. 
		String myString = "AbCdEfG";
		String pat = "aBc";
		
		int answer = 0;
        
        myString = myString.toLowerCase();
	    pat = pat.toLowerCase();
		if(myString.contains(pat)){
            answer = 1;
        }
		
		System.out.println(myString.indexOf(pat));
		
        System.out.println(answer);
		
		
	/*	2. 
        if (str.indexOf(str2) != -1) {
            return 1;
        }
	
		indexOf는 특정 문자가 문자열의 어디에 있는지 위치를 번호로 알려주는 메서드이다.
		없을 경우는 -1이 나오며 위와 같이 문자열안의 문자열을 찾을 경우에는 맨 처음 위치만 출력한다.
	*/
		
	}

}
