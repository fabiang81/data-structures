package sortalgorithms;

public class MergeSort {
	
	int[] array;
	int[] tempArray;
	
	public void prepareForSort(int[] array) {
		this.array = array;
		this.tempArray = new int[array.length];
		doMergeSort(0, array.length-1);
	}
	
	private void doMergeSort(int lowerIndex, int higherIndex) {
		if(lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			doMergeSort(lowerIndex, middle); //ex (1-5)
			doMergeSort(middle+1, higherIndex); //ex (6-10)
			mergePart(lowerIndex, middle, higherIndex);
		}
	}
	
	private void mergePart(int lowerIndex, int middle, int higherIndex) {
		for(int i=lowerIndex; i<=higherIndex; i++) {
			tempArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		while(i<=middle && j<= higherIndex) {
			if(tempArray[i] <= tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			}else {
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
	}

}
