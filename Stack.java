class Stack{
	Node top;
	int size;
	public Stack(){
		this.top=null;
		this.size=0;
	}

	public void push(int e){
		Node temp=new Node(e);
		temp.next=top;
		top=temp;
		size++;
	}

	public int pop() throws StackUnderFlowException{
		if(top==null){
			throw new StackUnderFlowException();
		}
		int e=top.data;
		top=top.next;
		size--;
		return e;
	}

	public int size(){
		return size;
	}

	public int peek(){
		return this.top.data;
	}

	public boolean isEmpty(){
		return top==null;
	}
}