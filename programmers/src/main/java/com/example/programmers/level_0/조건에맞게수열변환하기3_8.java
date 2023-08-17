package com.example.programmers.level_0;

public class 조건에맞게수열변환하기3_8 {

	public static void main(String[] args) {
		
		int[]arr = {1,2,3,100,99,98};
		int k = 3 ;
		
	
		if(k%2==0) {
			for(int i=0;i<arr.length;i++) {
				arr[i]=arr[i]*k;
			}
		}else {
			for(int i=0;i<arr.length;i++) {
				arr[i]=arr[i]+k;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
		/*
		 위의 코드 보다는 for문안에 if문을 두는게 더 효율적이다 어차피 for문 안의 내용은 같기 때문이다.
		 
		 */
		
		
		
		
	}

}
