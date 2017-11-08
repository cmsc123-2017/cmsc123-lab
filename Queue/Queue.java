public class Queue {
	int[] array;
	int quantity;
	int size;
	int front;
	int rear;
	
	Queue(int quantity){
		this.quantity = quantity;
		this.array = new int[this.quantity];
		this.size = 0;
		this.front = 0;
		this.rear = 0;	
	}
	
	//Adds an item to rear
	public void enqueue(int item) {
		if(isFull()){
			expandQueueArray();
		}
		array[rear] = item;
		rear = (rear + 1) % this.quantity;
		this.size++;
		
	}
	
	public int dequeue(){
		if(isEmpty()){
			return 0;
		}
		else{
			array[front] = front;
			front = (front + 1) % this.quantity;
		}
		return front;
		
	}
	public int peek(){
		if(isEmpty()){
			return 0;
		}
		else
			return array[front];
		
	}
	
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	public int size(){
		return this.quantity;
	}
	
	
	public boolean isFull(){
		return (this.size == this.quantity);
	}
	
	public void expandQueueArray(){
		this.quantity = this.quantity * 2;
		int[] newArray = new int [this.quantity];
		for(int x = 0; x < this.size; x++){
			newArray[x] = array[front];
			front = (front + 1) % this.quantity;
		}
		front = 0;
		rear = this.size;
		array = newArray;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
