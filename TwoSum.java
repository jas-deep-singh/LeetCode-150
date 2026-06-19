import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int req = target-nums[i];
            if(map.containsKey(req)) {
                return new int[]{i, map.get(req)};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}