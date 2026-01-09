import java.util.Scanner;

class TreeUI
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MyBinaryTree bt = new MyBinaryTree();

        while(true)
        {
            IO.println("\n================ Binary Tree Menu ================");
            IO.println("1. Add Node");
            IO.println("2. Smallest Element");
            IO.println("3. Biggest Element");
            IO.println("4. Show Left Nodes");
            IO.println("5. Show Right Nodes");
            IO.println("6. Preorder Traversal");
            IO.println("7. Inorder Traversal");
            IO.println("8. Postorder Traversal");
            IO.println("9. Exit");
            IO.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    IO.print("Enter data: ");
                    int val = sc.nextInt();
                    bt.add(val);
                    IO.println("Node Inserted");
                    break;

                case 2:
                    IO.println("Smallest element:");
                    bt.smallest();
                    break;

                case 3:
                    IO.println("Biggest element:");
                    bt.biggest();
                    break;

                case 4:
                    IO.println("Left side nodes:");
                    bt.showLeft();
                    break;

                case 5:
                    IO.println("Right side nodes:");
                    bt.showRight();
                    break;

                case 6:
                    IO.println("Preorder Traversal:");
                    bt.preorder();
                    break;

                case 7:
                    IO.println("Inorder Traversal:");
                    bt.inorder();
                    break;

                case 8:
                    IO.println("Postorder Traversal:");
                    bt.postorder();
                    break;

                case 9:
                    IO.println("Program Ended");
                    System.exit(0);

                default:
                    IO.println("Invalid Choice");
            }
        }
    }
}
