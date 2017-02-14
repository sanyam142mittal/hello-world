public class Node
{
  int key;
  Node left,right = null;
  Node(int item)
  {
    key=item;
  }
}

public class BST
{
  Node root;
  BST()
  {
    root = null;
  }
  
  public void Insert(int newvalue)
  {
   root = InsertNode(root, newvalue); 
  }
  
  public Node InsertNode(Node root, int newvalue)
  {
   if(root==null)
   {
     root = new Node(newvalue);
     return root;
   }
   else
   {
     if (root.key >= newvalue)
       root.left = InsertNode(root.left,newvalue);
     else
       root.right = InsertNode(root.right,newvalue);
   }
    return root;
  }
  
  public void Inorder(Node root)
  {
   	if(root==null)
    {
      //return "";
    }
    else
    {
     	Inorder(root.left);
      	System.out.println(root.key);
        Inorder(root.right);
    }
    //return InorderValue;
    
  }
  
}

public class executor
{
 
  public static void main(String[] args)
  {
    BST mytree = new BST();
    mytree.Insert(50);
    mytree.Insert(10);
    mytree.Insert(60);
    mytree.Insert(12);
    //System.out.println("10");
    mytree.Inorder(mytree.root);
  }
}
