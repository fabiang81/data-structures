package searchalgorithms;

import dataset.DataSet;

public class LinearSearch {
	
	public static void main(String[] args) {
		DataSet data = new DataSet(100000);
		int search = 700;
		boolean isFound = false;
		for(int i=0; i< data.getSize(); i++) {
			data.numberTry++;
			if(data.data[i] == search) {
				System.out.println("Element's been found after try: "+data.numberTry);
				isFound=true;
				break;
			}
		}
	}

}
