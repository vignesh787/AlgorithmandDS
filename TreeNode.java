public class TreeNode
{
    int data; //node data
    int height;
    TreeNode left, right; //left and right child's reference

    // Tree node constructor
    public TreeNode(int data,int height)
    {
        this.data = data;
        left = right = null;
        this.height = height;
    }
}