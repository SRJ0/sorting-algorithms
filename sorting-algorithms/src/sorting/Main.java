package sorting;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/* create random int array */
		int n = 10;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for(int i = 1; i < n; i++) {
			arr.add(i);
		}
		Collections.shuffle(arr);
		Integer[] testArr = arr.stream().toArray(m -> new Integer[m]);

		/* sorting */
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select sorting algorithm");
			System.out.println("* s: selection sort / q: quick sort");
			String s = sc.next();
			char selector = s.charAt(0);
			long startTime=0, endTime=0;
			
			switch(selector) {
				case 'q': 
					QuickSort qs = new QuickSort();
					startTime = System.currentTimeMillis();
					qs.sort(testArr, 0, testArr.length);
					endTime = System.currentTimeMillis();
					System.out.println("Quick sort");
					break;
				case 's':
					SelectionSort ss = new SelectionSort();
					startTime = System.currentTimeMillis();
					ss.sort(testArr);
					endTime = System.currentTimeMillis();
					System.out.println("Selection sort");
					
			}
					
			System.out.println("time:" + (endTime-startTime));
			
			for(int num : testArr) {
				System.out.print(num+" ");
			}
			System.out.println();
			System.out.println();
			
			Collections.shuffle(arr);
			testArr = arr.stream().toArray(m -> new Integer[m]);
			
		}

	}

}
