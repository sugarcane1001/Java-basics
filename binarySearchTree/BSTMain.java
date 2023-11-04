
public class BSTMain {
   public static void main(String[] args) {
      BST bst = new BST();
      bst.insert(200);
      bst.insert(300);
      bst.insert(100);
      bst.insert(250);
      bst.insert(350);
      bst.insert(150);
      if (!bst.contains(120)) System.out.println("The binary search tree doesn't contain 120");
      if (bst.contains(250)) System.out.println("The binary search tree contains 250");
   
      System.out.println("The smallest number in BST is " + bst.getMin());
      System.out.print("The pre-order traversal of BST is: ");
      bst.preoderTraversal();

   }

}
