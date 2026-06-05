class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) {
            return nums.length;
        }
        int j = 2;
        for(int i=2;i<nums.length;i++) {
            if(nums[i]!=nums[j-2]) {
                nums[j] = nums[i];
                j+=1;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        RemoveDuplicatesII solution = new RemoveDuplicatesII();
        int[] nums = {1,1,1,2,2,3};
        int newLength = solution.removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for(int i=0; i<newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}