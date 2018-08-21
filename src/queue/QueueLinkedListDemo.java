package queue;

public class QueueLinkedListDemo {
	
	public static void main(String[] args) {
		QueueLinkedList<String> q = new
				QueueLinkedList<String>();
		q.queue("Jena");
		q.queue("Laya");
		q.queue("Hussein");
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
	}

}
