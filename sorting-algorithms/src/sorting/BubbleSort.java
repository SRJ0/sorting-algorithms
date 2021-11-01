package sorting;

public class BubbleSort {
	
	
	public static void sort(Integer[] arr) {
		
		Tools t = Tools.createTools();
		
		for(int i = 0; i < arr.length; i ++) {
			for(int j = arr.length-1; j > i; j--) {
				if(arr[j] < arr[j-1]) t.swap(arr, j-1, j);
			}
		}
	}	
}
