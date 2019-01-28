package com.naztech;

public class ArrayMaxMultiply {
	
	
	public static int maxMultiplication() {
		int[] numArray = {1, 2, 3, 4, 5};
		
		int max= 0;
		
		for(int i = 0; i<numArray.length; i++) {
			 
			for(int j = 0; j<numArray.length; j++ ) {
				if(i!=j) {
				int temp = numArray[i]*numArray[j];
				
				if(temp>max) {
					max=temp;
				}
				}
			}
		}
		
		return max;
	}

}
