class ListUser{
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.addFirst(5);
		int[] ar={1,2,3,4,5};
		ll.addAll(ar);
		ll.removeFirst();
		ll.printLinkedList();
		ll.removeLast();
		System.out.println(ll.indexOf(30));
		//System.out.println(ll.lastIndexOf(30));
		System.out.println(ll.size());
	}
}