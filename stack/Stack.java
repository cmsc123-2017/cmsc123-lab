public class Stack<E> {
	LinkedList<E> stackList;
	
	public Stack(){
		stackList = new LinkedList();
	}
	
	// -> void
	// adds item to the top of the list
	public void push(E item){
		int index = stackList.size();
		stackList.add(item, index);
	}
	
	// -> E
	// removes the item from the top of the list
	public E pop() {
		int index = stackList.size() - 1;
		return stackList.remove(index);
	}

	// -> E
	// returns the item at the top of the list
	public E peek(){
		if(isEmpty()) {
			return null;
		}
			int index = stackList.size() - 1;
			return stackList.getDataList(index);
	}
	
	// -> boolean
	// Returns true if list is empty, false otherwise
	public boolean isEmpty() {
		return (stackList.size () == 0);
		
	}
	
	// -> int
	// returns the size of list
	public int size() {
		return stackList.size();
	}
}
	
