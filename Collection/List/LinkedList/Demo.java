import java.util.*;
class Demo
{
	public static void stack(MyLinkList ml) throws Exception
	{
		Thread t = Thread.currentThread();
		int c = 0;
		while(c!=3)
		{
			IO.println("""
			press 1: for add
			press 2: for show
			press 3: for delete
			press 4: for Ascending
			press 5: for Descending
			press 6: for reverse
			press 0: for Back
			""");
			int choice = new java.util.Scanner(System.in).nextInt();
			switch(choice)
			{
				case 1:
					IO.print("Wait");
					for(int i =0;i<4;i++)
					{
						t.sleep(100*i);
						IO.print("***");
					}
					IO.println();
					IO.print("Enter the data in (integer)=  ");
					int data = new java.util.Scanner(System.in).nextInt();
					ml.addFirst(data);
					IO.println("Successfully add");
					break;
				case 2:
					IO.print("Wait");
					for(int i =0;i<4;i++)
					{
						t.sleep(100*i);
						IO.print("***");
					}
					IO.println("\n");
					IO.println(ml);
					IO.println("\n");
					for(int i =0;i<5;i++)
					{
						t.sleep(100*i);
						IO.print("---");
					}
					IO.println();
					break;
				case 3:
					boolean b = ml.removeFirst();
					if(b)
					{
						IO.println("\nSuccessully delete");
					}
					else
					{
						IO.println("no such element for delete");
					}
					break;
				case 4:
					ml.sortAsc();
					IO.println("\n\nSuccessfully\n");
					break;
				case 5:
					ml.sortDesc();
					IO.println("\n\nSuccessfully\n\n");
					break;
				case 6:
					ml.reverse();
					IO.println("\nSuccessfully\n");
					break;
				case 0:
					c = 3;
					IO.print("We are going back wait");
					for(int i= 0;i<5;i++)
					{
						t.sleep(100*i);
						IO.print("***");
					}
					IO.println("\n");
					break;
				default: IO.println("Enter valid key ");
					break;
			}
		}
	}
	
	public static void queue(MyLinkList ml) throws Exception
	{
		Thread t = Thread.currentThread();
		int c = 0;
		while(c!=3)
		{
			IO.println("""
			press 1: for add
			press 2: for show
			press 3: for delete
			press 4: for Ascending
			press 5: for Descending
			press 6: for reverse
			press 0: for Back
			""");
			int choice = new java.util.Scanner(System.in).nextInt();
			switch(choice)
			{
				case 1:
					IO.print("Wait");
					for(int i =0;i<4;i++)
					{
						t.sleep(100*i);
						IO.print("***");
					}
					IO.println();
					IO.print("Enter the data in (integer)=  ");
					int data = new java.util.Scanner(System.in).nextInt();
					ml.addFirst(data);
					IO.println("Successfully add");
					break;
				case 2:
					IO.print("Wait");
					for(int i =0;i<4;i++)
					{
						t.sleep(100*i);
						IO.print("***");
					}
					IO.println("\n");
					IO.println(ml);
					IO.println("\n");
					for(int i =0;i<5;i++)
					{
						t.sleep(100*i);
						IO.print("---");
					}
					IO.println();
					break;
				case 3:
					boolean b = ml.removeLast();
					if(b)
					{
						IO.println("\nSuccessully delete");
					}
					else
					{
						IO.println("no such element for delete");
					}
					break;
				case 4:
					ml.sortAsc();
					IO.println("\n\nSuccessfully\n");
					break;
				case 5:
					ml.sortDesc();
					IO.println("\n\nSuccessfully\n\n");
					break;
				case 6:
					ml.reverse();
					IO.println("\nSuccessfully\n");
					break;
				case 0:
					c = 3;
					IO.print("We are going back wait");
					for(int i= 0;i<5;i++)
					{
						t.sleep(100*i);
						IO.print("***");
					}
					IO.println("\n");
					break;
				default: IO.println("Enter valid key ");
					break;
			}
		}
	}
	public static void deQueue(MyLinkList ml) throws Exception
	{
		Thread t = Thread.currentThread();
		int c = 0;
		while(c!=3)
		{
			IO.println("""
			press 1: for add
			press 2: for show
			press 3: for delete
			press 4: for Ascending
			press 5: for Descending
			press 6: for reverse
			press 0: for Back
			""");
			int choice = new java.util.Scanner(System.in).nextInt();
			switch(choice)
			{
				case 1:
					IO.print("Wait");
					for(int i =0;i<4;i++)
					{
						t.sleep(100*i);
						IO.print("***");
					}
					IO.println();
					IO.println("""
					press 1 : for insert First
					press 2 : for insert Last
					""");
					int add = new java.util.Scanner(System.in).nextInt();
					int data ;
					if(add==1)
					{
						IO.print("Enter the data in (integer)=  ");
						data = new java.util.Scanner(System.in).nextInt();
						ml.addFirst(data);
					}	
					else if(add==2)
					{
						IO.print("Enter the data in (integer)=  ");
						data = new java.util.Scanner(System.in).nextInt();
						ml.addLast(data);
					}
					else
					{
						IO.println("Try Again");
						break;
					}
					IO.println("Successfully add");
					break;
				case 2:
					IO.print("Wait");
					for(int i =0;i<4;i++)
					{
						t.sleep(100*i);
						IO.print("***");
					}
					IO.println("\n");
					IO.println(ml);
					IO.println("\n");
					for(int i =0;i<5;i++)
					{
						t.sleep(100*i);
						IO.print("---");
					}
					IO.println();
					break;
				case 3:
					boolean b = false;
					IO.println("""
					press 1 : for delete First
					press 2 : for delete Last
					""");
					int add1 = new java.util.Scanner(System.in).nextInt();
					if(add1==1)
						b = ml.removeFirst();
					else if(add1==2)
						b = ml.removeLast();
					else
					{
						IO.println("Try Again");
						break;
					}
					if(b)
					{
						IO.println("\nSuccessully delete");
					}
					else
					{
						IO.println("no such element for delete");
					}
					break;
				case 4:
					ml.sortAsc();
					IO.println("\n\nSuccessfully\n");
					break;
				case 5:
					ml.sortDesc();
					IO.println("\n\nSuccessfully\n\n");
					break;
				case 6:
					ml.reverse();
					IO.println("\nSuccessfully\n");
					break;
				case 0:
					c = 3;
					IO.print("We are going back wait");
					for(int i= 0;i<5;i++)
					{
						t.sleep(100*i);
						IO.print("***");
					}
					IO.println("\n");
					break;
				default: IO.println("Enter valid key ");
					break;
			}
		}
	}
	public static void main(String... ar)
	{
		String welcome = "welcome to my linkedList";
		int second = 1;
		MyLinkList ml = new MyLinkList();
		try
		{
			Thread t = Thread.currentThread();
			IO.print("\t\t");
			for(int i =0;i<welcome.length();i++)
			{
				t.sleep(100);
				IO.print(welcome.charAt(i));
			}
			IO.println("\n\n");
			while(true)
			{
				IO.println("""
				press 1: for Stack
				press 2: for Queue
				press 3: for Deque
				press 0: for exit
				""");
				int choice = new java.util.Scanner(System.in).nextInt();
				switch(choice)
				{
					case 1: 
							IO.print("Please wait");
							for(int i=0;i<5;i++)
							{
								t.sleep(second*(100*i));
								IO.print("*");
							}
							IO.println("\n");
							stack(ml);
							break;
					case 2: 
							IO.print("Please wait");
							for(int i=0;i<5;i++)
							{
								t.sleep(second*(100*i));
								IO.print("*");
							}
							IO.println("\n");
							queue(ml);
							break;
					case 3:
						IO.print("Please wait");
						for(int i=0;i<5;i++)
						{
							t.sleep(second*(100*i));
							IO.print("*");
						}
						IO.println("\n");
						deQueue(ml);
						break;
					case 0:
							IO.print("Programme is closing... \n\t\tWait");
							for(int i=0;i<7;i++)
							{
								t.sleep(second*(i*100));
								IO.print("...");
							}
							System.exit(0);
					default: 
						IO.println("Enter the correct Choice\n\n\n");
						break;
						
				}
			}
			// IO.println("program is exit");
		}
		catch(Exception e)
		{
			IO.println(e);
		}
	}
}