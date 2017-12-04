public class minHeap {
	int[] minHeap; //array of min heap
	int maxCapacity; // maximum capacity of array
	int size; // number of elements in the array

	minHeap(int maxCapacity, int size) {
		this.maxCapacity = maxCapacity;
		minHeap = new int[maxCapacity + 1];
		this.size = 0;
		minHeap[0] = Integer.MIN_VALUE;
	}
	//function which swaps the position of parent and child
	private void swap(int parentPos, int childPos) {
		int temp;
		temp = minHeap[parentPos];
		minHeap[parentPos] = minHeap[childPos];
		minHeap[childPos] = temp;
	}

	//function which returns the position of parent
	private int parent(int position) {
		return position / 2;
	}

	//function which returns the position of left child
	private int leftChild(int position){
		return position * 2;
	}

	//funciton which returns the position of right child
	private int rightChild(int position) {
		return (position * 2) + 1;
	}

	//function which returns true if a given index is a leaf
	//otherwise, false
	private boolean isLeaf(int position) {
		if(position >= (size / 2) && position <= size) {
			return true;
		}

		return false;

	}
 	//accepts value and 
	//inserts the given value at the bottom of heap
	public void add(int value) {
		size++;
		minHeap[size] = value;
		int currentPos = size;
		
		while(minHeap[currentPos] < minHeap[parent(currentPos)]) {
			swap(currentPos, parent(currentPos));
			currentPos = parent(currentPos);
		}
	}

	//removes and returns the smallest value in heap
	public int remove() {
		int itemRemoved = minHeap[0];

		minHeap[0] = minHeap[size];
		minHeap[size] = 0;
		bubbleDown(0);

		return itemRemoved;

	}

	//function which prints the values in preorder 
	public void preorder() {
		int itemIndex = 0;
		preorder(itemIndex);
		System.out.println();
	}

	//function which prints the values in inorder
	public void inorder() {
		int itemIndex = 0;
		inorder(itemIndex);
		System.out.println();
	}

	//function which prints the values in postorder
	public void postorder() {
		int itemIndex = 0;
		postorder(itemIndex);
		System.out.println();
	}

	//function which places the root in its correct position
	private void minHeapRoot(int position) {
		if (!isLeaf(position)) {
			if {(minHeap[position] > minHeap[leftChild(position)] ||
				 minHeap[position] > minHeap[rightChild(position)]) {
				if (minHeap[leftChild(position)] < minHeap[rightChild(position)]) {
					swap(position, leftChild(position));
					minHeapRoot(leftChild(position));
				}
				else {
					swap(position, rightChild(position));
					minHeapRoot(rightChild(position));
				}
			}
		}

	}

	//prints the values in preorder traversal
	//root - leftChild - rightChild
	private void preorder(int position) {
		if(position > size) {
			return null;
		} 
		System.out.print(minHeap[position] + " ");
		preorder(leftChild(position));
		preorder(rightChild(position));
	}

	//prints the values in inorder traversal
	//leftChild - root - rightChild
	private void inorder(int position) {
		if(position > size) {
			return null;
		}

		System.out.print(minHeap[position] + " ");
		inorder(leftChild(position));
		inorder(rightChild(position));
	}

	//prints the values in postorder traversal
	private void postorder(int position) {
		if(position > size) {
			return null;
		}

		System.out.print(minHeap[position] + " ");
		postorder(leftChild(position));
		postorder(rightChild(position));
	}
	
	//function which prints the values of minHeap
	public void display() {
		for(int i = 1; i <= size; i++) {
			System.out.print(minHeap[i] + " ");
		}
		System.out.println();
	}


}