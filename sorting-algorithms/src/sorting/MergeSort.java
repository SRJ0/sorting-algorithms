package sorting;

public class MergeSort {
	
	public static Integer[] sort(Integer[] arr, int l, int r) {
		
		int mid = (l+r)/2; 
		Integer[] A = new Integer[mid-l+1];
		Integer[] B = new Integer[r-mid];
		
		if(l < r) {
		
			A = sort(arr, l, mid);
			B = sort(arr, mid+1, r);
			
			return merge(A, B, l, r);
		}
		/* only 1 element */
		else {
			A[0] = arr[l];
			return A;
		}
	}
	public static Integer[] merge(Integer[] a, Integer[] b, int l, int r) {
		
		Integer[] c = new Integer[a.length+b.length];
		int i=0,j=0,k=0;
		
		
		while(i < a.length && j < b.length) {
			if(a[i] > b[j]) c[k++] = b[j++];
			else c[k++] = a[i++];
		}
		
		/* adding the rest */
		if(i == a.length) for(int ii = j; ii < b.length; ii++) c[k++] = b[ii];
		else for(int ii = i; ii < a.length; ii++) c[k++] = a[ii];
		
		return c;
		
	}
	
}
