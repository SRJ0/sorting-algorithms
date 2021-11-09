package sorting;

public class InsertionSort {
	public static Integer[] sort(Integer[] arr) {
		Integer[] sorted = new Integer[arr.length];
		sorted[0] = arr[0];
		
		for(int j = 1; j < arr.length; j++) {
			int i = j-1; 
			while(i > -1 && arr[j] < sorted[i]) i--;
			insert(sorted, j, i, arr[j]);
		}
		return sorted;
	}
	
	public static void insert(Integer[] ar, int slen, int index, int value) {
		
		for(int i = slen-1; i > index; i--) {
			ar[i+1] = ar[i];
		}
		ar[index+1] = value;
	}
}
