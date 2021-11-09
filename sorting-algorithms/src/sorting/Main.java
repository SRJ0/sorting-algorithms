package sorting;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* create random int array */
		int n = 10;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();

		System.out.println("Choose input input array type");
		System.out.println("1: w/o duplicates 2: with duplicates 3: sorted");
		int arrayType = sc.nextInt();
		
		switch(arrayType) {
			case 1:
				for(int i = 1; i < n; i++) {
					arr.add(i);
				}
				Collections.shuffle(arr);
				break;
			case 3:
				for(int i = 1; i < n; i++) {
					arr.add(i);
				}
				break;
			case 2:
				Random rd = new Random();
				for(int i = 1; i < n; i++) {
					arr.add(rd.nextInt(n));
				}
				break;
		}
		
		Integer[] testArr = arr.stream().toArray(m -> new Integer[m]);
		
		
		/* sorting */
		while(true) {			
			System.out.println("Select sorting algorithm");
			System.out.println("* s: selection sort / q: quick sort / b: bubble sort / m : merge sort / h : heap sort/ i : insertion sort");
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
					break;
					
				case 'b':
					BubbleSort bs = new BubbleSort();
					startTime = System.currentTimeMillis();
					bs.sort(testArr);
					endTime = System.currentTimeMillis();
					System.out.println("Bubble sort");
					break;
					
				case 'm':
					MergeSort ms = new MergeSort();
					startTime = System.currentTimeMillis();
					testArr = ms.sort(testArr, 0, testArr.length-1);
					endTime = System.currentTimeMillis();
					System.out.println("Merge sort(recursive)");
					break;
					
				case 'h':
					HeapSort hs = new HeapSort();
					startTime = System.currentTimeMillis();
					hs.sort(testArr);
					endTime = System.currentTimeMillis();
					System.out.println("Heap sort");
					break;
					
				case 'i':
					InsertionSort is = new InsertionSort();
					startTime = System.currentTimeMillis();
					testArr = is.sort(testArr);
					endTime = System.currentTimeMillis();
					System.out.println("Insertion Sort");
					break;
			}
			
			/* result & initialize */
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
