class MyBinaryTree
{
	Node root;
	class Node
	{
		Node left;
		Node right;
		int data;
		Node(int data)
		{
			this.data = data;
		}
	}
	public void add(int data)
	{
		Node n = new Node(data);
		if(root==null)
			root = n;
		else
		{
			Node f = root;
			while(true)
			{
				if(n.data>=f.data)
				{
					if(f.right == null)
					{
						f.right = n;
						break;
					}
					f = f.right;
				}
				else if(n.data<f.data)
				{
					if(f.left == null)
					{
						f.left = n;
						break;
					}
					f = f.left;
				}
			}
		}
	}
	public void smallest()
	{
		Node f = root;
		if(f == null)
		{
			return ;
		}
		// int value;
		while(f.left!=null)
		{
			f = f.left;
		}
		IO.println(f.data);
		// return f.data;
	}
	public void biggest()
	{
		Node f = root;
		if(f == null)
		{
			return;
		}
		// int value;
		while(f.right!=null)
		{
			f = f.right;
		}
		IO.println(f.data);
		// return f.data;
	}
	// for show the data left
	public void showLeft()
	{
		Node f = root;
		while(f!=null)
		{
			IO.println(f.data);
			f = f.left;
		}
	}
	// for show the data Right.
	public void showRight()
	{
		Node f = root;
		while(f!=null)
		{
			IO.println(f.data);
			f = f.right;
		}
	}
	// means firstly root -> left-> right
	public void preorder()
	{
		if(root == null)
			return ;
		Node f = root;
		IO.print(f.data+",");
		preorder(f.left);
		preorder(f.right);
	}
	public void inorder()
	{
		if(root == null)
			return ;
		Node f = root;
		inorder(f.left);
		IO.print(f.data+",");
		inorder(f.right);
	}
	
	public void inorder(Node f)
	{
		if(f==null)
			return;
		inorder(f.left);
		IO.print(f.data+",");
		inorder(f.right);
	}
	
	// left->Right->Root
	public void preorder(Node f)
	{
		if(f==null)
			return;
		IO.print(f.data+",");
		preorder(f.left);
		preorder(f.right);
	}
	//left->right->root
	public void postorder()
	{
		Node f = root;
		if(f==null)
			return;
		postorder(f.left);
		postorder(f.right);
		IO.print(f.data);
	}
	public void postorder(Node f)
	{
		if(f==null)
			return;
		postorder(f.left);
		postorder(f.right);
		IO.print(f.data+",");
	}
}