
 	public class hashTable {
	 class hashValues {
	   String key;
	   int value;

	hashValues(String key, int value) {
		this.key = key;
		this.value = value;
	}
}

	 int INITIAL_SIZE_TABLE; //hash table capacity
	 hashValues [] hashTableValues; //linked list array
	 int hashSize; //number of key value pair in the table

	hashTable() {
		INITIAL_SIZE_TABLE = 50;
		hashTableValues = new hashValues[INITIAL_SIZE_TABLE];


	for(int x = 0; x < INITIAL_SIZE_TABLE; x++)
		hashTableValues = null;
	}

	//inserts a key value pair to the hash table
	public void put(String key, int value){
		int hash = getHashValue(key) % INITIAL_SIZE_TABLE;

			if(hashTableValues[hash] == null) {
				hashTableValues[hash] = new hashTable(key, value);
			}
			else {
				hashValues temp = hashTableValues[hash];
				while(temp.next != null && temp.key !=key) {
					temp = temp.next;
				}
				if(temp.key == key) {
					temp.value = value;
				}
				else 
				  temp.next = new hashValues(key, value);
			}
			hashSize++;
	}

	//returns the value, given a key
	public int get(String key) {
		int hash = getHashValue(key) % INITIAL_SIZE_TABLE;
		
		if(hashTableValues[hash] == null) {
			hashTable temp = hashTableValues[hash];
		
		hashValues temp = hashTableValues[hash];		
		
		while(temp.key != key && temp.next != null) {
				temp = temp.next;
			}
		if(temp.key == null){
			return 0;
		}
			return temp.value;
		}			
	}

	//removes and returns the value of a given key
	public int remove(String key) {
		int hash = getHashValue(key) % INITIAL_SIZE_TABLE;

		if(hashTableValues[hash] == null){
			return 0;
		}

		hashValues prevValue = null;
		hashValues temp = hashTableValues[hash];

		while(temp.key != key && temp.next != null){
			prevValue = temp;
			temp.next = temp;
		}

		if(temp.key == null) {
			return 0;
		}

		if(prevValue == null){
			hashTableValues[hash] = temp.next;
		}
		else
			prevValue.next = temp.next;

		hashSize--;
		return temp.value;

	}

	//returns true if a certain key is in the hash table, otherwise false
	public boolean contains(String key){
		int hash = getHashValue(key) % INITIAL_SIZE_TABLE;

		if(hashTableValues[hash] == null) {
			return 0;
		}

		hashValues temp = hashTableValues[hash];
		
		while(temp.key != null && temp.next != null) {
			temp.next =temp;
		}

		if(temp.key == null) {
			return false;
		}

		return true;
	}


	//prints all the values in the table
	public void values() {
		for(int x = 0; x < INITIAL_SIZE_TABLE; x++) {
		 hashValues temp = hashTableValues[x];
		 while( temp != null) {
		 	System.out.print(temp.value);
		 	temp = temp.next;
		 }	
	   }
	}

	//prints all the keys in the table
	public void keys() {
		for(int x = 0; x < INITIAL_SIZE_TABLE; x++) {
			hashValues temp = hashTableValues[x];
		while (temp != null) {
			System.out.print(temp.next);
			temp = temp.next;
		}
	  }
	}

	//provides the hash value of a string
	private int getHashValue(String key) {
		int hashCode = key.hashCode();
		int hashStringValue = hashCode % INITIAL_SIZE_TABLE;
		return hashStringValue;
	}


	public void display() {
		for(int x = 0; x < INITIAL_SIZE_TABLE; x++) {
			System.out.println(" HASH TABLE " + (x + 1) + " : ");
			hashValues temp = hashTableValues[x];
		while (temp != null) {
			System.out.print(temp.value + "");
			temp = temp.next;
		}
	  }
	}


}