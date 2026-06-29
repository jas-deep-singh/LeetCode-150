import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root==null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0, n = 0;
            for(int i=0;i<size;i++) {
                TreeNode node = queue.poll();
                sum+=node.val;
                n+=1;
                if(node.left!=null) {
                    queue.offer(node.left);
                }
                if(node.right!=null) {
                    queue.offer(node.right);
                }
            }
            result.add(sum/n);
        }
        return result;
    }
    public static void main(String[] args) {
        AverageOfLevels sol = new AverageOfLevels();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<Double> result = sol.averageOfLevels(root);
        System.out.println(result); 
    }
}