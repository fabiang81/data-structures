package linkedlist;

public class LinkedListU<T> {
	
	Node head;

	public LinkedListU() {
		head = null;
	}
	
	public void add(Object value) {
		Node newNode = new Node(value, null);
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void delete() {
		head = head.next;
	}
	
	public void display() {
		Node node = head;
		while(node!=null) {
			System.out.println((T) node.value);
			node = node.next;
		}
	}
	
}
