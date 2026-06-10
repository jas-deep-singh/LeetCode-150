class TrappingRainWater {
    public int trap(int[] height) {
        int i = 0, j = height.length-1, left = 0, right = 0, water = 0;
        while(i<j) {
            left = Math.max(left, height[i]);
            right = Math.max(right, height[j]);
            if(left<right) {
                water += left-height[i];
                i++;
            }
            else {
                water += right-height[j];
                j--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        TrappingRainWater obj = new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(obj.trap(height));
    }
}