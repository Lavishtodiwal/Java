import java.util.*;

public class TreeUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinaryTree tree = new MyBinaryTree();

        while (true) {
            System.out.println("\n===== Binary Tree Menu =====");
            System.out.println("1. Add Node");
            System.out.println("2. Smallest Element");
            System.out.println("3. Biggest Element");
            System.out.println("4. Preorder Traversal");
            System.out.println("5. Inorder Traversal");
            System.out.println("6. Postorder Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    tree.add(val);
                    System.out.println("Inserted");
                    break;

                case 2:
                    tree.smallest();
                    break;

                case 3:
                    tree.biggest();
                    break;

                case 4:
                    System.out.print("Preorder: ");
                    tree.preorder(tree.root);
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Inorder: ");
                    tree.inorder(tree.root);
                    System.out.println();
                    break;

                case 6:
                    System.out.print("Postorder: ");
                    tree.postorder(tree.root);
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Program Ended");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
