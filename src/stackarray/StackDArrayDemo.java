package stackarray;

public class StackDArrayDemo {
	
	public static void main(String[] args) {
		StackDArray<Integer> st = new StackDArray<>(2);
		st.push(12);
		st.push(13);
		System.out.println("Size stack: "+st.getSize());
		st.push(14);
		System.out.println("Size stack: "+st.getSize());
	}

}
