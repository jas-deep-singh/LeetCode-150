class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length<=1) {
            return true;
        }
        int reachable = 0;
        for(int i=0;i<nums.length;i++) {
            if(i>reachable) {
                return false;
            }
            reachable = Math.max(reachable, i+nums[i]);
            if(reachable>nums.length-1) {
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        JumpGame obj = new JumpGame();
        int[] nums = {2,3,1,1,4};
        System.out.println(obj.canJump(nums));
    }
}