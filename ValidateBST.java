class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class ValidateBST {
    public boolean checkIfValid(TreeNode root, long min, long max) {
        if(root==null) {
            return true;
        }
        if(root.val<=min || root.val>=max) {
            return false;
        }
        return checkIfValid(root.left, min, root.val) && checkIfValid(root.right, root.val, max);
    }
    public boolean isValidBST(TreeNode root) {
        return checkIfValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static void main(String[] args) {
        ValidateBST obj = new ValidateBST();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(obj.isValidBST(root));
    }
}