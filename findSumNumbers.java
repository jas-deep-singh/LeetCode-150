class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class findSumNumbers {
    public int findSum(TreeNode root, int sum) {
        if(root==null) {
            return 0;
        }
        sum = sum*10+root.val;
        if(root.left==null && root.right==null) {
            return sum;
        }
        return findSum(root.left, sum)+findSum(root.right, sum);
    }
    public int sumNumbers(TreeNode root) {
        return findSum(root, 0);
    }
    public static void main(String[] args) {
        findSumNumbers obj = new findSumNumbers();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(obj.sumNumbers(root));
    }
}