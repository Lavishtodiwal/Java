import java.util.*;


class Link {
	public int iData;
	public Link next;
	
	public Link(int id){
		iData = id;
	}
	public String toString(){
		return "{" + iData + "}";
	}
}

class Linklist{
	private Link first;
	public Linklist(){
		first = null;
	}	
	public boolean isEmpty(){
		return (first == null);
	}
	public void insertFirst(int id){
		Link newLink = new Link(id);
		newLink.next = first;
		first = newLink;
	}
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	public String toString(){
		String str = "";
		Link current = first;
		while(current !=null){
			str+=current.toString();
			current = current.next;
		}
		return str;
	}
}
class LinkList {
	public static void main(String... e){
		Linklist theList = new Linklist();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);
		
		IO.println(theList);
		IO.println(theList.deleteFirst());
		IO.println(theList);
		
		while(!theList.isEmpty()){
			Link aLink = theList.deleteFirst();
			IO.println("Deleted .. "+  aLink);
			IO.println("");
		}
		IO.println(theList);
		IO.println("thank u");
	}
}