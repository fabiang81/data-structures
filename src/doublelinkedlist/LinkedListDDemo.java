package doublelinkedlist;

public class LinkedListDDemo {

	public static void main(String[] args) {
		LinkedListD<String> ls = new LinkedListD<>();
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
