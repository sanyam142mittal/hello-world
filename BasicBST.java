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
  
  public Node FindLCA(Node root, int smallValue, int largeValue)
  {
   	if(root!=null)
    {
     	if(root.key> largeValue)
        {
         	return FindLCA(root.left,smallValue,largeValue); 
        }
      	else if(root.key < smallValue)
        {
         	return FindLCA(root.right,smallValue,largeValue); 
        }
      	return root;
      
    }
    
    return null;
  }
  
}

public class executor
{
 
  public static void main(String[] args)
  {
    BST mytree = new BST();
    mytree.Insert(18);
    mytree.Insert(9);
    mytree.Insert(36);
    mytree.Insert(6);
    mytree.Insert(12);
    mytree.Insert(10);
    mytree.Insert(1);
    mytree.Insert(8);
    //System.out.println("10");
    //mytree.Inorder(mytree.root);
    
    System.out.println(mytree.FindLCA(mytree.root,1,10).key);
    
    System.out.println(mytree.FindLCA(mytree.root,1,36).key);
    
    System.out.println(mytree.FindLCA(mytree.root,1,8).key);
  }
}
