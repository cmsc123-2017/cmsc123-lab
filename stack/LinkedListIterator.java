package iterator.java;

import iterator.java.LinkedList.Node;

class LinkedListIterator implements Iterator<E>{
	Node currentNode = head;
	
	public boolean hasNext() {
		return (current != null);
		
		public E next() {
			if(hasNext == true)
				return currentNode.next;
			
			E item = currentNode.data;
			currentNode = currentNode.next;
			return item;
		}
	}

}
