import java.util.*;

class node {
	int iData;
	node next;
	
	node(int id){
		iData = id;
	}
}
class SingleLinklist{
	static node head = null;
	
	public static void main(String... e){

		while(true){
			IO.println("\n");
			IO.println("""
			Enter 1 for: AddFirst
			Enter 2 for: AddLast
			Enter 3 for: DeleteFirst
			Enter 4 for: DeleteLast
			Enter 5 for: Display the LinkList
			Enter 6 for: change order in Asc
			Enter 7 for: change order in Desc
			Enter 8 for: Reverse
			Enter 9 for: Search
			Enter 10 for: Search and Replace
			Enter 11 for: exit
			""");
			IO.print("Enter your input: ");
			int input = new Scanner(System.in).nextInt();
			switch(input){
				case 1: 
				IO.print("Enter the integer value: ");
				int in = new Scanner(System.in).nextInt();
				node n1 = new node(in);
				n1.next = head;
				head = n1;
				IO.println(in +" is added to LinkList");	
				break;
				case 2: 
					IO.print("Enter the integer value: ");
					in = new Scanner(System.in).nextInt();
					node n2 = new node(in);
					if(head ==null){
						n2.next = head;
						head = n2;
						IO.println(in +" is added to LinkList");
					}
					else{
						node temp = head;
							while(temp.next != null){
								temp= temp.next;
							}
							temp.next= n2;
								
						}
				break;
				
				case 3:
					if(head == null){
						IO.println("\t***List is Empty***");
					}
					else{
						head = head.next;
						IO.println("\t***Deleted from the first***");
					}
				break;
				case 4:
					if(head == null){
						IO.println("\t***List is Empty***");
					}
					else {
						node temp = head;
						while(temp.next.next!=null){
							temp = temp.next;
						}
						temp.next = null;
						IO.println("\t***Last Element deleted successfully***");
					}
					
				break;
				case 5:

				if(head ==null){
					IO.println("\t***List is Empty***");
				}
				else{
					node temp = head;
					while(temp != null){
						IO.print(temp.iData+", ");
						temp= temp.next;
					}
					
				}
				break;
				// sort in asc 
				case 6 :
					if(head ==null){
						IO.println("\t***List is Empty***");
					}
					else{
						node current , index;
						for(current = head; current.next!= null;current= current.next){
							for(index = current.next;index!=null;index = index.next){
								if(current.iData > index.iData){
									int tmp = current.iData;
									current.iData = index.iData;
									index.iData = tmp;	
								}
							}
						}
					}
					IO.println("\t***Sorted Successfully in ascending order***");
					break;
					
					// sort in Desc 
				case 7 :
					if(head ==null){
						IO.println("List is Empty");
					}
					else{
						node current , index;
						for(current = head; current.next!= null;current= current.next){
							for(index = current.next;index!=null;index = index.next){
								if(current.iData < index.iData){
									int tmp = current.iData;
									current.iData = index.iData;
									index.iData = tmp;	
								}
							}
						}
					}
					IO.println("\t***Sorted Successfully in descending order***");
					break;
					
				

				case 11: System.exit(0);
			}
		}
	}
}