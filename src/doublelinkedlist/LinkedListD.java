package doublelinkedlist;

public class LinkedListD<T> {

	NodeD head;

	public LinkedListD() {
		head = null;
	}
	
	public void add(Object value) {
		NodeD newNodeD = new NodeD(value, null, null);
		if(head == null) {
			head = newNodeD;
		}else {
			newNodeD.next = head;
			head.previous = newNodeD;
			head = newNodeD;
		}
	}
	
	public void delete() {
		head = head.next;
		head.previous = null;
	}
	
	public void display() {
		NodeD node = head;
		while(node!=null) {
			System.out.println((T) node.value);
			node = node.next;
		}
	}
}
