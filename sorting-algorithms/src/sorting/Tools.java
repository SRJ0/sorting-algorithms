package sorting;

public class Tools {
	
	public static Tools createTools() {
		
		return new Tools();
	}
	
	
	public static <T> void swap(T[] a, int f, int r) {
		T temp;
	    temp = a[f];
	    a[f] = a[r];
	    a[r] = temp;
	}
}
