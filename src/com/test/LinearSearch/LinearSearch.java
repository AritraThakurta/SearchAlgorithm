package com.test.LinearSearch;

public class LinearSearch {

	public static int LinearTestSearch(int arr[], int ser) {

		int size = arr.length;
		for (int i = 0; i < size; i++) {
			if (arr[i] == ser) {
				return i;
			}
		}

		return -1;

	}
	
	public static void main(String args[]){
		
		int arrs[] ={45,78,67,90};
		
		int res= LinearTestSearch(arrs, 67);
		
		System.out.println("The Item is found out at position " +res);
		
	}

}
