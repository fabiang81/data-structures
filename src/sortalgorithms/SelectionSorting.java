package sortalgorithms;

import java.util.Arrays;

public class SelectionSorting {
	
	static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int index = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			if(index!=i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 50, 30, 10, 60, 80};
		System.out.println("Before sort");
		System.out.println(Arrays.toString(arr));
		System.out.println("After sort");
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
