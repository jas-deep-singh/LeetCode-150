class RotateArray {
    public void reverse(int[] nums, int i, int j) {
        while(i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public static void main(String []args) {
        RotateArray rotateArray = new RotateArray();
        int []nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray.rotate(nums, k);
        for(int i: nums) {
            System.out.print(i+" ");
        }
    }
}