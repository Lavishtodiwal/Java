import java.util.*;

class LinkedListExample{
	public static void main(String... w){
		//linked list declaration
		LinkedList<String> linkedlist = new LinkedList<>();
		
		//add (string elements) is used for adding the elements to the linklist 
		
		linkedlist.add("item1");
		linkedlist.add("item2");
		linkedlist.add("item3");
		linkedlist.add("item4");
		linkedlist.add("item5");
		
		//display the linklist 
		System.out.println("elements: "+ linkedlist);
		
		//add item at the first or end of the linked list 
		
		linkedlist.addFirst("first add");
		linkedlist.addLast("last add");
		System.out.println("after the adding.. ->"+ linkedlist);
		
		//how to set and get the values
		
		Object firstVal = linkedlist.get(0);
		System.out.println("first element=> "+firstVal);
		
		linkedlist.set(0,"edited value using set");
		Object firstVal2 = linkedlist.get(0); //bcz val me to pehli wali hi value store thi to use kaise pta chlega ki changes hue hai so this is not possible 
		//System.out.println("first element=> "+firstVal);  same hi result dega
		
		System.out.println("first element=> "+firstVal2);
		
		//remove first and last element 
		
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("after removing first and last element "+linkedlist);
		
		//add to a specific position and remove from that position
		
		linkedlist.add(2,"index 2 pr change");
		System.out.println("* after adding at index2 "+ linkedlist);		
		linkedlist.remove(2);
		System.out.println("* after deleting from index2 "+ linkedlist);
	}
}
