package queue;

public class QueueDArrayDemo {
	
	public static void main(String[] args) {
		QueueDArray<Integer> q = new QueueDArray<Integer>(2);
		q.queue(11);
		q.queue(12);
		System.out.println(q.getSize());
		q.queue(12);
		System.out.println(q.getSize());
	}

}
