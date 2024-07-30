class DoubleUser{
	public static void main(String[] args) {
		DoubleLinkedList dll=new DoubleLinkedList();
		dll.add(5);
		dll.add(10);
		dll.add(15);
		dll.add(20);
		int[] arr={25,30,35,40};
		dll.addAll(arr);
		dll.printReverse();
		dll.addFirst(4);
		dll.print();
		dll.removeFirst();
		dll.removeLast();
		dll.print();
	}
}