package iterator.java;

public class LinkedList<E> implements Collection<E>{
	
	class Node {
		Object data;
		Node next;
		
		Node(Object data, Node next){
			this.data = data;
			this.next = next;
		}
	}

	Node head = null;
	int size = 0;

	//E int -> boolean
	//accepts an Item and index, then 
	//adds the item to the given index
	public boolean add(E item, int index) {
		Node newNode = new Node(item, head);
		
		if(this.size == 0 || index == 0) {
		this.head = newNode;
		this.size++;
		return true;
		}
		
		Node currentNode = this.head;
		Node lastNode = null;
			for(int i = 0; i < index; i++) {
				lastNode = currentNode;
				currentNode = currentNode.next;		
			}
			
			newNode.next = currentNode;
			lastNode.next = newNode;
			size++;
			return true;
		}
	
	//int -> boolean
	//accepts an index of an item, then
	//removes the item at the given index
	public boolean remove(int index) {
		if(this.size == 0) {
			return false;
		}
		
	
		Node currentNode = this.head;
		Node lastNode = currentNode;
		
		while(currentNode.next != null) {
			if(this.equals(currentNode.data)) {
				lastNode.next = currentNode.next;
				currentNode.next = null;
				
				this.size--;
				return true;
			}
			
			lastNode = currentNode;
			currentNode = currentNode.next;
		}
		
		return false;
	}
	
		// -> int
		//returns the size of list
		public int size() {
			return this.size;
		}

		// -> Iterator<E>
		//returns an instance of the LinkedListIterator
		public Iterator<E> iterator(){
			return LinkedListIterator();
		}

		public void display() {
			Node currentNode = this.head;
			
			while(currentNode != null) {
				
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}		
		}
}




