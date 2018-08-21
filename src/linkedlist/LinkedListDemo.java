package linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedListU<String> ls = new LinkedListU<>();
		ls.add("Hussein");
		ls.add("Jena");
		ls.add("Laya");
		ls.add("Wael");
		ls.display();
		ls.delete();
		System.out.println();
		ls.display();
	}

}
