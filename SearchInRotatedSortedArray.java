class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high) {
            int mid = low+((high-low)/2);
            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[low]<=nums[mid]) {
                if(nums[low]<=target && nums[mid]>target) {
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else {
                if(nums[mid]<target && target<=nums[high]) {
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(obj.search(nums, target));
    }
}
