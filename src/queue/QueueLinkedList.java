package queue;

public class QueueLinkedList<T> {
	
	NodeD rear;
	NodeD front;

	public QueueLinkedList() {
		rear = null;
		front = null;
	}
	
	public void queue(Object value) {
		NodeD newNodeD = new NodeD(value, null, null);
		if(rear == null) {
			rear = newNodeD;
			front = newNodeD;
		}else {
			newNodeD.next = null;
			newNodeD.previous = rear;
			rear.next = newNodeD;
			rear = newNodeD;
		}
	}
	
	public T dequeue() {
		if(rear == null || front==null) {
			System.out.println("queue is empty");
			return null;
		}
		T value = (T) front.value;
		front = front.next;
		if(front!=null) {
			front.previous = null;
		}
		return value;
	}

}
