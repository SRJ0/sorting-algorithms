package sorting;

public class HeapSort {
	public static void sort(Integer[] arr) {
		
		int n = arr.length, bc=0;
		Tools t = Tools.createTools();
		
		// max heap
		for(int i = n/2-1; i >= 0; i--) {
			adjust(arr, i, n);
		}
		
		for(int i = 0; i < n; i++) {
			t.swap(arr, 0, n-1-i);
			adjust(arr, 0, n-i-1);
		}
		
	}
	public static void adjust(Integer[] arr, int i, int n) {
		int bc = 0;;
		Tools t = Tools.createTools();
		
		while(i < n) {
			if(2*i+2 >= n) break;
			else if (arr[2*i+1] < arr[2*i+2]) bc = 2*i+2; 
			else bc = 2*i+1;
			
			if(arr[i] < arr[bc]) {
				t.swap(arr, i, bc);
				i = bc;
			}
			else break;
			
		}
	}
	
	
}
