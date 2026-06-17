class FirstAndLastOccurenceInArray {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int []result = {-1, -1};
        while(low<=high) {
            int mid = low+((high-low)/2);
            if(nums[mid]==target) {
                result[0] = mid;
                high = mid-1;
            }
            else if(nums[mid]>target) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        low = 0; 
        high = nums.length-1;
        while(low<=high) {
            int mid = low+((high-low)/2);
            if(nums[mid]==target) {
                result[1] = mid;
                low = mid+1;
            }
            else if(nums[mid]>target) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FirstAndLastOccurenceInArray obj = new FirstAndLastOccurenceInArray();
        int []nums = {5,7,7,8,8,10};
        int target = 8;
        int []result = obj.searchRange(nums, target);
        System.out.println("First and Last Occurrence of " + target + " is: [" + result[0] + ", " + result[1] + "]");
    }
}
