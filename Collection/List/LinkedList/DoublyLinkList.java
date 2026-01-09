import java.util.*;

class node {
	int iData;
	node prev;
	node next;

	node(int id) {
		iData = id;
		prev = null;
		next = null;
	}
}

class DoublyLinkList {
	static node head = null;

	public static void main(String... e) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("""
			1. AddFirst
			2. AddLast
			3. DeleteFirst
			4. DeleteLast
			5. Display Forward
			6. Sort Ascending
			7. Sort Descending
			8. Reverse Display
			9. Exit
			""");

			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();

			switch (ch) {

			// Add First
			case 1:
				System.out.print("Enter value: ");
				int val = sc.nextInt();
				node n1 = new node(val);

				if (head != null) {
					n1.next = head;
					head.prev = n1;
				}
				head = n1;
				System.out.println(val + " added at first");
				break;

			// Add Last
			case 2:
				System.out.print("Enter value: ");
				val = sc.nextInt();
				node n2 = new node(val);

				if (head == null) {
					head = n2;
				} else {
					node temp = head;
					while (temp.next != null)
						temp = temp.next;

					temp.next = n2;
					n2.prev = temp;
				}
				System.out.println(val + " added at last");
				break;

			// Delete First
			case 3:
				if (head == null) {
					System.out.println("List is Empty");
				} else {
					head = head.next;
					if (head != null)
						head.prev = null;
					System.out.println("First node deleted");
				}
				break;

			// Delete Last
			case 4:
				if (head == null) {
					System.out.println("List is Empty");
				} else if (head.next == null) {
					head = null;
				} else {
					node temp = head;
					while (temp.next != null)
						temp = temp.next;

					temp.prev.next = null;
					System.out.println("Last node deleted");
				}
				break;

			// Display Forward
			case 5:
				if (head == null) {
					System.out.println("List is Empty");
				} else {
					node temp = head;
					while (temp != null) {
						System.out.print(temp.iData + " ");
						temp = temp.next;
					}
					System.out.println();
				}
				break;

			// Sort Ascending
			case 6:
				sort(true);
				System.out.println("Sorted in Ascending order");
				break;

			// Sort Descending
			case 7:
				sort(false);
				System.out.println("Sorted in Descending order");
				break;

			// Reverse Display
			case 8:
				if (head == null) {
					System.out.println("List is Empty");
				} else {
					node temp = head;
					while (temp.next != null)
						temp = temp.next;

					while (temp != null) {
						System.out.print(temp.iData + " ");
						temp = temp.prev;
					}
					System.out.println();
				}
				break;

			case 9:
				System.exit(0);
			}
		}
	}

	// Common sort method
	static void sort(boolean asc) {
		if (head == null)
			return;

		node i, j;
		for (i = head; i.next != null; i = i.next) {
			for (j = i.next; j != null; j = j.next) {
				if (asc && i.iData > j.iData || !asc && i.iData < j.iData) {
					int t = i.iData;
					i.iData = j.iData;
					j.iData = t;
				}
			}
		}
	}
}
