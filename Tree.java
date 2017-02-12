import java.util.LinkedList;
import java.util.Queue;

// Tree class
public class Tree
{
    TreeNode root;//Tree root

    // Tree constructor
    public Tree(TreeNode root)  {  this.root = root;  }

    // Diagonal elements Print Method
    public void printDiagonalElements()
    {
        // Queue which stores tree nodes
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        boolean rootLeft;

        // Add root node to the queue
        queue.add(root);

        // Loop while the queue is not empty
        while (!queue.isEmpty())
        {
            // Remove the front tree node from queue.
            TreeNode curr = queue.remove();
            rootLeft=true;

            while (curr != null)
            {
            	System.out.print("   "+curr.data+"   ");

                // If for any node the left child is not null add
                // it to the queue for future processing.
                if (curr.left != null && rootLeft)
                {
                    queue.add(curr.left);
                    rootLeft=false;
                }
                else if(curr.left != null && !rootLeft)
                {
                	queue1.add(curr.left);
                }
                curr = curr.right;
                
            }
            if(!queue.isEmpty() && !queue1.isEmpty() && queue.element().height  == queue1.element().height)
            {
            	System.out.print("   "+ queue1.remove().data +"   ");
            }
            System.out.println();
        }

    }
}