package Classprep;
public class Tahabst {
    public static void main(String[] args) {
        Node n = new Node(9);
        n.left = new Node(7);
        n.right = new Node(20);
        n.left.left = new Node(4);
        n.left.left.left = new Node(2);
        n.left.left.right = new Node(5);
        n.right.right = new Node(25);
        n.right.left = new Node(10);

        BinarySearchTree bst = new BinarySearchTree(n);
        bst.printInOrder();
        bst.delete(7);

    }
}

class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }

    public boolean hasOnlyOneChild() {
        return this.left != null && this.right == null || this.left == null && this.right != null;
    }

    public Node getOnlyChild() {
        if (this.hasOnlyOneChild()) {
            if (this.left == null) {
                return this.right;
            }
            return this.left;
        }
        return null;
    }

    public boolean hasTwoChild() {
        return this.left != null && this.right != null;
    }
}

class NodePair {
    public Node parent;
    public Node node;

    public NodePair(Node parent, Node node) {
        this.parent = parent;
        this.node = node;
    }
}

class BinarySearchTree {
    public Node root;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public void delete(int value) {
        if (this.root.isLeaf() && this.root.value == value) {
            this.root = null;
        }

        deleteImpl(null, this.root, value);

    }

    public void deleteImpl(Node parent, Node root, int value) {
        if (root.left != null && value < root.value) {
            deleteImpl(root, root.left, value);
        }

        if (root.right != null && value > root.value) {
            deleteImpl(root, root.right, value);
        }

        if (root.value == value) {
            if (root.isLeaf() || root.hasOnlyOneChild()) {
                removeNode(parent, root);
                return;
            }
            // Has two child
            NodePair maxNodePair = this.maxNode(parent, root);
            root.value = maxNodePair.node.value;
            removeNode(maxNodePair.parent, maxNodePair.node);
            return;
        }
    }

    public NodePair maxNode(Node parent, Node root) {
        if (root.right == null) {
            return new NodePair(parent, root);
        }

        return maxNode(root, root.right);
    }

    public void removeNode(Node parent, Node node) {
        if (node.isLeaf()) {
            if (parent.left == node) {
                parent.left = null;
                return;
            }
            parent.right = null;
        }

        if (node.hasOnlyOneChild()) {
            if (parent.left == node) {
                parent.left = node.getOnlyChild();
                return;
            }
            parent.right = node.getOnlyChild();
            return;
        }

    }

    public void removeLeaf(Node parent, Node node) {
        if (parent.left == node) {
            parent.left = null;
            return;
        }
        parent.right = null;
    }

    public void insert(int value) {
        this._insert(this.root, value);
    }

    public void _insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
        }

        if (root.value < value) {
            _insert(root.left, value);
        }

        _insert(root.right, value);
    }

    private void innerInOrder(Node root) {
        if (root == null) {
            return;
        }
        innerInOrder(root.left);
        System.out.println(root.value);
        innerInOrder(root.right);
    }

    public void printInOrder() {
        innerInOrder(this.root);
    }
}