class StackUser{
	public static void main(String[] args) throws Exception {
		Stack s=new Stack();
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.push(10);
		s.push(20);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}