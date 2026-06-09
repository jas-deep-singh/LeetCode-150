class ArrayProductWithoutItself {
    public int[] productExceptSelf(int[] nums) {
        int []answer = new int[nums.length];
        int suffix = 1;
        answer[0] = 1;
        for(int i=1;i<nums.length;i++) {
            answer[i] = answer[i-1]*nums[i-1];
        }
        for(int i=nums.length-1;i>=0;i--) {
            answer[i] = answer[i]*suffix;
            suffix*=nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrayProductWithoutItself ap = new ArrayProductWithoutItself();
        int []nums = {1,2,3,4};
        int []answer = ap.productExceptSelf(nums);
        for(int i:answer) {
            System.out.print(i+" ");
        }
    }
}