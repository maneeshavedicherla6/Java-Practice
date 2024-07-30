class DoubleLinkedList{
	Node head;
	Node tail;
	void add(int ele){
		Node temp=new Node(ele);
		if(head==null){
			head=temp;
			tail=temp;
		}
		else{
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
	}

	void print(){
		Node curr=this.head;
		while(curr!=null){
			System.out.println(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}

	void printReverse(){
		Node curr=this.tail;
		while(curr!=null){
			System.out.println(curr.data+" ");
			curr=curr.prev;
		}
		System.out.println();
	}

	void addFirst(int ele){
		Node temp=new Node(ele);
		if(this.head==null){
			this.head=temp;
			this.tail=temp;
		}
		else{
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
	}

	void add(int index,int ele) throws IndexOutOfBoundsException{
		try{
			if(index==0){
				addFirst(ele);
			}
			else{
				Node temp=new Node(ele);
				int count=0;
				Node curr=this.head;
				while(count<index-1){
					curr=curr.next;
					count++;
				}
				curr.next.prev=temp;
				temp.next=curr.next;
				curr.next=temp;
				temp.prev=curr;
			}
		}catch(NullPointerException e){
			throw new IndexOutOfBoundsException();
		}
	}

	void addAll(int[] elements){
		for(int ele:elements){
			add(ele);
		}
	}

	void removeFirst(){
		if(head==null){
		}
		else if(this.head.next==null){
			this.head=null;
			this.tail=null;
		}
		else if(this.head.next!=null){
			Node curr=this.head;
			this.head=head.next;
			curr.next=null;
			this.head.prev=null;
		}
	}

	void removeLast(){
		if(head==null){
		}
		else if(this.head.next==null){
			this.head=null;
			this.tail=null;
		}
		else if(this.head.next!=null){
			Node curr=tail;
			tail=tail.prev;
			curr.prev=null;
			tail.next=null;
		}
	}
}