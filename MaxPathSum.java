class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class MaxPathSum {
    int ans = Integer.MIN_VALUE;
    public int findSum(TreeNode root) {
        if(root==null) {
            return 0;
        }
        int lsum = Math.max(0, findSum(root.left));
        int rsum = Math.max(0, findSum(root.right));
        ans = Math.max(ans, root.val+lsum+rsum);
        return root.val+Math.max(lsum, rsum);
    }
    public int maxPathSum(TreeNode root) {
        findSum(root);
        return ans;
    }
    public static void main(String[] args) {
        MaxPathSum m = new MaxPathSum();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(m.maxPathSum(root)); 
    }
}