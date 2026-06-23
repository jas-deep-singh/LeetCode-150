class SingleNumber {
    public int singleNumber(int[] nums) {
        int k = 0;
        for(int i=0;i<nums.length;i++) {
            k^=nums[i];
        }
        return k;
    }
    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums = {4,1,2,1,2};
        System.out.println(sn.singleNumber(nums));
    }
}