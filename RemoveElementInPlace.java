class RemoveElementInPlace {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=val) {
                nums[j] = nums[i];
                j+=1;
            }
        }
        return j;
    }
    public static void main(String []args) {
        RemoveElementInPlace sol = new RemoveElementInPlace();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int newLength = sol.removeElement(nums, val);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for(int i=0;i<newLength;i++) {
            System.out.print(nums[i] + " ");
        }
    }
}