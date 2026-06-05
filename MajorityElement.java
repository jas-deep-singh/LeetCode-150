class MajorityElement {
    public int majorityElement(int[] nums) {
        int element = nums[0], count = 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==element) {
                count+=1;
            }
            else {
                count-=1;
            }
            if(count<=0) {
                element = nums[i+1];
                count = 0;
            }
        }
        return element;
    }
    public static void main(String []args) {
        MajorityElement majorityElement = new MajorityElement();
        int []nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement.majorityElement(nums));
    }
}