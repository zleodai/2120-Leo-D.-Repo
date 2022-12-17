package source;

public class GFG {
 
    public static final int COUNT = 3;
 
    // Function to print binary tree in 2D
    // It does reverse inorder traversal
    public void print2DUtil(Node root, int space)
    {
        // Base case
        if (root == null)
            return;
 
        // Increase distance between levels
        space += COUNT;
 
        // Process right child first
        print2DUtil(root.rGet(), space);
 
        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.getChar() + "\n");
 
        // Process left child
        print2DUtil(root.lGet(), space);
    }
 
    // Wrapper over print2DUtil()
    public void print2D(Node root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
}