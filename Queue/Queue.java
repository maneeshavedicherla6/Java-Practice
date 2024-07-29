class Queue{
	Node front;
	Node rear;
	int size;
	Queue(){
		this.front=null;
		this.rear=null;
		this.size=0;
	}

	void enqueue(int e){
		Node temp=new Node(e);
		size++;
		if(isEmpty()){
			this.front=temp;
			this.rear=temp;
		}
		else{
			rear.next=temp;
			rear=rear.next;
		}
	}

	int deQueue(){
		if(isEmpty()){
			return -1;
		}
		else{
			Node temp=front;
			front=front.next;
			temp.next=null;
			size--;
			return temp.data;
		}
	}

	int getFront(){
		if(isEmpty()){
			return -1;
		}
		else{
			return front.data;
		}
	}

	int getRear(){
		if(isEmpty()){
			return -1;
		}
		else{
			return rear.data;
		}
	}

	boolean isEmpty(){
		return front==null;
	}


}