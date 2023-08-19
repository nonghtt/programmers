package com.example.programmers.level_0;

public class 처음으로나오는음수_13 {

	public static void main(String[] args) {

		int [] num_list = {12, 4, 15, 46, 38, -2, 15};
		int answer =0;
		
		 for(int i=0;i<num_list.length;i++){
	            if(num_list[i]<0){
	                answer = i;
	                break;
	            }else{
	                answer=-1;
	            }
	        }
	
		 /*
		  *  break보다 그냥 바로 return을 하는 방법도 있다.
		  * 
		  */
		 
		 
	}

}
