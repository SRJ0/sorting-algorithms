package sorting;

import java.util.ArrayList;

public class QuickSort {
	
	public void sort(Integer[] arr, int l, int r){
	

		int pivot = l, last = r;
		Tools t = Tools.createTools();
		
		if(l >= r ) return;
		
		while(l < r) {
			do l++; while(l < arr.length && arr[l] < arr[pivot]);
			do r--; while(r > 0 && arr[r] > arr[pivot]);
			if(l < r) t.swap(arr, l, r);			
		}
		t.swap(arr, pivot, r);
		
		sort(arr, pivot, r-1);
		sort(arr, r+1, last);
	
	}
	

}
