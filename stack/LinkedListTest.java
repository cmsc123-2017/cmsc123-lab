package iterator.java;

import junit.framework.TestCase;

public class LinkedListTester extends TestCase{
	
	LinkedList items = new LinkedList();
	
	items a = new item("Soap", 2);
	items b = new item("Toothbrush", 0);
	items c = new item("Mouse", 1);
	items d = new item("Towerl", 3);
	items e = new item("charger", 4);
	
	//test method for add
	public void testAdd() {
		LinkedList<String> item = new LinkedList<String>();
		
		item.add(soap, 2);
		item.add(toothbrush, 0);
		item.add(mouse,  1);
		
		
		assertEquals(true, item.add("Soap", 2));
		assertEquals(true, item.add("Toothbrush", 0));
		assertEquals(false, item.add("Mouse", 1 ));
		
	}
		
	//test method for remove
		LinkedList<String> item = new LinkedList<String>();
		
		item.add("Soap", 2);
		item.add("Toothbrush", 0);
		item.add("Mouse");
		
		assertEquals(true, item.remove(1));
		assertEquals(false, item.remove(5));
		
	}
}


}

