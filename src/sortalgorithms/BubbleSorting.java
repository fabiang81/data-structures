package sortalgorithms;

import java.util.Arrays;

public class BubbleSorting {
	
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp=0;
		for(int i=0; i<n; i++) {
			for(int j=1; j<(n-i); j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 50, 30, 10, 60, 80};
		System.out.println("Before sort");
		System.out.println(Arrays.toString(arr));
		System.out.println("After sort");
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
