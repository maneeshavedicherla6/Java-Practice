class QueueUser{
	public static void main(String[] args) {
		Queue q=new Queue();
		System.out.println(q.isEmpty());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.deQueue();
		System.out.println(q.getFront());
		System.out.println(q.getRear());
		System.out.println(q.isEmpty());
	}
}