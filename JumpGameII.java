class JumpGameII {
    public int jump(int[] nums) {
        int reachable = 0, jumps = 0, currentEnd = 0;
        for(int i=0;i<nums.length-1;i++) {
            reachable = Math.max(reachable, i+nums[i]);
            if(i==currentEnd) {
                jumps+=1;
                currentEnd = reachable;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {2,3,1,1,4};
        System.out.println(jumpGameII.jump(nums));
    }
}