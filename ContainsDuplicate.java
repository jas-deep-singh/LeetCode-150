import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k) {
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
    public static void main(String []args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(cd.containsNearbyDuplicate(nums, k));
    }
}