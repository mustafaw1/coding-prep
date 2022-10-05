package JavaClasses;

import java.util.ArrayList;

class BST_class {
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    BST_class() {
        root = null;
    }

    private Node insertRecursive(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertRecursive(root.left, data);
        else if (data > root.data)
            root.right = insertRecursive(root.right, data);
        return root;
    }
    
    

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    // private Node delete_Recursive(Node root, int data) {
    // if (root == null)
    // return root;

    // if (data < root.data)
    // root.left = delete_Recursive(root.left, data);
    // else if (data > root.data)
    // root.right = delete_Recursive(root.right, data);

    // else//if root has only one child
    // if(root.left == null)
    // return root.right;

    // else// if root has only one child
    // if(root.right == null)
    // return root.left;
    // else//if root has two child
    // root.data = findMin(root.right);
    // root.right = delete_Recursive(root.right, data);

    // return root;
    // }
    private Node findMin(Node start) {

        Node smallest = start;

        while (smallest.left != null) {
            smallest = smallest.left;
        }
        return smallest;
    }

    public void min() {
        findMin(root);
    }

    private void delete(Node parent, Node current, int data) {
        if (current == null)
            return;
        if (root.data == data)

            if (data < current.data)
                delete(current, current.left, data);
            else if (data > current.data)
                delete(current, current.right, data);
            else { // found, current is equal to the node to be deleted.
                boolean isLeft = true;
                // checking to see which of the left and right references
                // update for the parent, for case 1 and 2.
                if (parent.left.data == current.data)
                    isLeft = true;
                else
                    isLeft = false;
                // Case 1: If node to be removed is a leaf, no children.
                if (current.left == null && current.right == null) {
                    if (isLeft)
                        parent.left = null;
                    else // Meaning the node to be deleted is the right node of the parent.
                        parent.right = null;
                }
                // Case 2: If node to be removed has only 1 child.
                else if (current.left != null && current.right == null) {
                    if (isLeft)
                        parent.left = current.left;
                    else
                        parent.right = current.right;
                } else if (current.right != null && current.left == null) {
                    if (isLeft)
                        parent.left = current.right;
                    else
                        parent.right = current.right;
                } else {
                    // Case 3: If node to be deleted has 2 children.
                    Node smallest = findMin(current.right);
                    current.data = smallest.data;
                    delete(current, current.right, smallest.data);
                }
            }
    }

    public void deleteNode(int data) {
        delete(root, root, data);
    }

    // public void delete(int data) {
    // root = delete_Recursive(root, data);
    // }

    public boolean search(int data) {
        root = search_Recursive(root, data);
        if (root != null)
            return true;
        else
            return false;
    }

    private Node search_Recursive(Node root, int data) {
        if (root == null || root.data == data)
            return root;
        if (root.data > data)
            return search_Recursive(root.left, data);

        return search_Recursive(root.right, data);
    }

    public int sumLeafInner(Node root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.print("(" + root.data + ")" + " ");
                return root.data;
            }
            return sumLeafInner(root.left) + sumLeafInner(root.right);
        }
        return 0;
    }

    public int sumLeaf() {
        return sumLeafInner(root);

    }

    private int collectLeaf(Node root, ArrayList<Integer> arrayList) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.print("(" + root.data + ")" + " ");
                arrayList.add(root.data);
            }
            collectLeaf(root.right, arrayList);
            collectLeaf(root.left, arrayList);
        }
        return 0;

    }

    public int sumIterativeLeaf() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        collectLeaf(root, arrayList);
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        return sum;
    }

    private void Mirrorbst(Node root) {
        if (root == null)
            return;
        Mirrorbst(root.left);
        Mirrorbst(root.right);

        swapNodes(root);

    }

    public void mirrorbst() {
        Mirrorbst(root);
    }

    public void swapNodes(Node root) {
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    private int innerInOrder(Node root) {
        if (root == null) {
            return 0;
        }
        innerInOrder(root.left);
        System.out.print(root.data + " ");
        return innerInOrder(root.right);
    }

    public int printInOrder() {
        return innerInOrder(this.root);
    }

    private int preOrder(Node root) {
        if (root == null) {
            return 0;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        return preOrder(root.right);

    }

    public int printpreOrder() {
        return preOrder(root);
    }

    private int maxDepthInner(Node root){
        if(root == null)
           return 0;
        int left = maxDepthInner(root.left);
        int right = maxDepthInner(root.right);

        if(right > left){
            return left + 1;
        }
        else{
            return right + 1;
        }
    }
    public int getmaxDepth(){
        return maxDepthInner(root);
    }

    
 

    //  (10)
    // /   \
//   (4)   (12)
//   / \    /  \
// (3) (7) (11) (24)
    //            \
    //           (25)

    public static void main(String[] args) {
        BST_class btree = new BST_class();

        
        btree.insert(10);
        btree.insert(4);
        btree.insert(3);
        btree.insert(7);
        btree.insert(12);
        btree.insert(11);
        btree.insert(24);
        btree.insert(25);
        System.out.print(btree.getmaxDepth());



    }

}


