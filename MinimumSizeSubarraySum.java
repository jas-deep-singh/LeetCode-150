class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, size = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            while(sum>=target) {
                size = Math.min(size, i-left+1);
                sum-=nums[left];
                left+=1;
            }
        }
        return size != Integer.MAX_VALUE ? size : 0;
    }
    public static void main(String[] args) {
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(obj.minSubArrayLen(target, nums));
    }
}