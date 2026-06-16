class FindMinimumInRotatedArray {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n-1;
        if(n==1) {
            return nums[n-1];
        }
        while(low<=high) {
            int mid = low+((high-low)/2);
            int leftSideElement = nums[(mid-1+n)%n];
            int rightSideElement = nums[(mid+1)%n];
            if(nums[mid]<leftSideElement && nums[mid]<rightSideElement) {
                return nums[mid];
            }
            if(nums[mid]<nums[high]) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindMinimumInRotatedArray obj = new FindMinimumInRotatedArray();
        int[] nums = {3,4,5,1,2};
        System.out.println(obj.findMin(nums));
    }
}