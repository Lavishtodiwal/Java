import java.util.*;
class MyLinkList
{
	Node first;
	MyLinkList()
	{
		first = null;
	}
	public void addFirst(int data)
	{
		Node n = new Node(data);
		n.next = first;
		first = n;
	}
	public void addLast(int data)
	{
		Node n = new Node(data);
		Node f = first;
		if(first!=null)
		{
			while(f.next!=null)
			{
				f = f.next;
			}
			n.next = f.next;
			f.next = n;
		}
		else
		{
			first = n ;
		}
	}
	public List<Object> search(int data)
	{
		ArrayList<Object> v = new ArrayList<>();
		int count = 0;
		Node f = first;
		while(f!=null)
		{
			if(f.data == data)
			{
				v.add(count);
			}
			f = f.next;
			++count;
		}
		return v;
	}
	public int replace(int olddata , int newdata)
	{
		Node f = first;
		boolean b = false;
		while(f!=null)
		{
			if(f.data==olddata)
			{
				f.data = newdata;
				b = true;
			}
			f = f.next;
		}
		if(b)
		{
			return 0;
		}
		else
			return 1;
	}
	public int remove(int index)
	{
		Node f = first;
		int count = 0;
		boolean b = false;
		while(f!=null)
		{
			if(index == count+1)
			{
				f.next = f.next.next;
				b = true;
				break;
			}
			if(index == 0)
			{
				first = f.next;
				// first = f;
				b= true;
				break;
			}
			f = f.next;
			count++;
		}
		if(b)
			return 0;
		else 
			return 1;
	}
	public void remove()
	{
		first = null;
	}
	public boolean removeLast()
	{
		if(first!=null)
		{
			Node f = first;
			if(f.next == null)
			{
				f = null;
				first = f;
			}
			else
			{
				while(f.next.next!=null)
				{
					f = f.next;
				}
				f.next = null;
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean removeFirst()
	{
		if(first!=null)
		{
			first = first.next;
			return true;
		}
		else
		{
			return false;
		}
	}
	public void reverse()
	{
		Node f = first;
		Node f1 = f;
		int count = 1;
		int count1 = 0;
		while(f1!=null)
		{
			f1 = f1.next;
			count++;
			if(f1.next==null)
			{
				break;
			}
		}
		// IO.println(count);
		// IO.println(f1.data);
		while(count/2!=count1)
		{
			Node v = f;
			count1++;
			while(v.next!=f1)
			{
				v = v.next;
			}
			f.data = f.data + f1.data;
			f1.data = f.data - f1.data;
			f.data = f.data - f1.data;
			f1 = v;
			f = f.next;
			// IO.println("hello");
		}
	}
	public void sortDesc()
	{
		Node f1,f = first;
		f1 = f.next;
		while(f.next!=null)
		{
			if(f.data<=f1.data)
			{
				f.data = f.data + f1.data;
				f1.data = f.data - f1.data;
				f.data = f.data - f1.data;
			}
			f1 = f1.next;
			if(f1==null)
			{
				f = f.next;
				f1 = f.next;
			}
		}
		
		
	}
	public void sortAsc()
	{
		Node f = first;
		Node f1 = f.next;
		
		while(f.next!=null)
		{
			if(f.data>=f1.data)
			{
				f.data = f.data + f1.data;
				f1.data =f.data - f1.data;
				f.data = f.data - f1.data;
				// int v = f.data;
				// f.data = f1.data;
				// f1.data = v;
			}
			f1 = f1.next;
			if(f1==null)
			{
				f = f.next;
				f1 = f.next;
			}
		}
	}
	public String toString()
	{
		Node f = first;
		String value="[";
		if(f==null)
			return "Empty";
		while(f!=null)
		{
			if(f.next==null)
			{
				value +=f.data+"]";
			}
			else
			{
				value +=f.data+",";
			}
			f = f.next;
		}
		return value;
	}
	class Node
	{
		int data ;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
}