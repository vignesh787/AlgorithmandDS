import java.util.*;


public class BinaryTreeTraversal {

	public static void main(String args[])
	{
/*	TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(9);
    root.left.right = new TreeNode(6);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);
    root.right.left.left = new TreeNode(12);
    root.right.left.right = new TreeNode(7);
    root.left.right.left = new TreeNode(11);
    root.left.left.right = new TreeNode(10);
    Tree tree = new Tree(root);*/
    
    TreeNode root = new TreeNode(1,1);
    root.left = new TreeNode(2,2);
    root.right = new TreeNode(3,2);
    root.left.left = new TreeNode(4,3);
    root.left.right = new TreeNode(5,3);
    root.right.left = new TreeNode(6,3);
    root.right.right = new TreeNode(7,3);
    root.left.left.left = new TreeNode(8,4);
    root.left.left.right = new TreeNode(9,4);
    root.left.right.left = new TreeNode(10,4);
    root.left.right.right = new TreeNode(11,4);
    Tree tree = new Tree(root);
    tree.printDiagonalElements();
	}
	
}
