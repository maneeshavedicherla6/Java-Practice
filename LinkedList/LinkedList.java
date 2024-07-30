class LinkedList{
	Node head;
	void printLinkedList(){
		Node curr=this.head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}

	void add(int e){
		Node temp=new Node(e);
		if(head==null){
			head=temp;
		}
		else{
			Node curr=head;
			while(curr.next!=null){
				curr=curr.next;
			}
			curr.next=temp;
		}
	}

	void addFirst(int e){
		Node temp=new Node(e);
		if(head==null){
			head=temp;
		}
		else{
			temp.next=head;
			head=temp;
		}
	}

	void add(int index,int element) throws IndexOutOfBoundsException{
		try{
			if(index==0){
				addFirst(element);
			}
			else{
				Node temp=new Node(element);
				int count=0;
				Node curr=this.head;
				while(count<index-1){
					curr=curr.next;
					count++;
				}
				temp.next=curr.next;
				curr.next=temp;
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
		else if(head.next==null){
			head=null;
		}
		else if(head.next!=null){
			Node curr=head;
			head=head.next;
			curr.next=null;
		}
	}

	void removeLast(){
		if(head==null){
		}
		else if(head.next==null){
			Node curr=head;
			while(curr.next.next!=null){
				curr=curr.next;
			}
			curr.next=null;
		}
	}

	int indexOf(int ele){
		Node curr=head;
		int count=0;
		while(curr!=null){
			if(curr.data==ele){
				return count;
			}
			curr=curr.next;
			count++;
		}
		return -1;
	}

	int lastIndex(int ele){
		Node curr=head;
		int count=0;
		int index=-1;
		while(curr!=null){
			if(curr.data==ele){
				index=count;
			}
			curr=curr.next;
			count++;
		}
		return index;
	}

	int size(){
		Node curr=head;
		int count=0;
		while(curr!=null){
			curr=curr.next;
			count++;
		}
		return count;
	}
}