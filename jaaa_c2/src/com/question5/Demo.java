package com.question5;

import java.util.Arrays;

public class Demo {
	
	public static int[] doubleArrayElements(int[] arr) {
		
		
		int length=arr.length;
		
		for(int i=0;i<length;i++) {
			arr[i]=arr[i]*2;
		}
		
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		
		
		
		int[] resArrys=Demo.doubleArrayElements(arr);
		
		System.out.println(Arrays.toString(resArrys));
		
		
		
		
		
	}

}
