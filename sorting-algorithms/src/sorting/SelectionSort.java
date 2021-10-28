package sorting;

import java.util.Scanner;

public class SelectionSort {

	public void sort(Integer[] arr){
		
		Scanner sc = new Scanner(System.in);
		Tools t = Tools.createTools();
		
		int n = arr.length;
				
		for(int j = 0; j < n; j++) {
			int minId = j;
			for(int k = j+1; k < n; k++) {
				if(arr[k] < arr[minId]) {
					t.swap(arr, minId, k);
				}
			}
			arr[j] = arr[minId];
		}
		
		
	}
}
 
