package stackarray;

import java.util.Arrays;

public class StackDArray<T> {
	
	Object[] arrayStack;
	int size;
	int top;

	public StackDArray(int size) {
		this.size = size;
		arrayStack = new Object[this.size];
		top = -1;
	}
	
	public void push(Object newItem) {
		ensureCapacity(top+2);
		top++;;
		arrayStack[top] = newItem;
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return null;
		}
		T item = (T) arrayStack[top];
		top--;
		return item;
	}
	
	public Boolean isEmpty() {
		return (top==-1);
	}
	
	public Boolean isFull() {
		return (top==size-1);
	}
	
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if(minCapacity > oldCapacity) {
			int newCapacity = oldCapacity*2;
			if(newCapacity < minCapacity)
				newCapacity = minCapacity;
			arrayStack = Arrays.copyOf(arrayStack, newCapacity);
		}
	}
	
	public int getSize() {
		return arrayStack.length;
	}

}
