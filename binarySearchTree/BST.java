
import java.util.NoSuchElementException;

public class BST {
    private Node root;
    public BST() {
        root = null;
    }
    public void insert(int data) {
        root = insert (data, root);
    }

    private Node insert(int data, Node curr){
        if (curr == null) 
            curr = new Node(data);
        else if ( data < curr.data)
            curr.left = insert(data, curr.left);
        else if (data > curr.data)
            curr.right = insert(data, curr.right);
        return curr;
    }
    
    public boolean contains(int data){
        return contains(data, root);
    }
    
    private boolean contains(int data, Node curr){
        if (curr == null) return false;
        if (curr.data == data) return true;
        return contains(data, curr.left) || contains(data, curr.right);
    }
    
    public int getMin() {
        if (root == null) throw new NoSuchElementException("Tree is empty!");
        return getMin(root);
    }
    private int getMin(Node curr){
        if (curr.left == null)  return curr.data;
        return getMin(curr.left);
    }
    
    public void preoderTraversal() {
        preoderTraversal(root);
    }
    private void preoderTraversal(Node curr){
        if (curr != null){
            System.out.print(curr.data + " ");
            preoderTraversal(curr.left);
            preoderTraversal(curr.right);
        }
    }
}
