package Classprep;

class Node
{
    int data;
    Node left, right;
  
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
  
class Bst
{
    Node root1, root2;
  
   
    public boolean identicalTrees(Node p, Node q)
    {
        if (p == null && q == null){
         return true;
        }
            
        identicalTrees(p.left, q.left);
        identicalTrees(q.right, q.right);
        if(p.data == q.data && p.left == q.left && p.right == q.right)
           return true;
  
        return false;
    }
  
   
    public static void main(String[] args)
    {
        Bst tree = new Bst();
  
        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
  
        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);
  
       
  
    }
}
