import java.util.Arrays;

class MinimumCandies {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int candies = n, i = 1;
        while(i<n) {
            while(i<n && ratings[i]==ratings[i-1]) {
                i++;
                continue;
            }
            int peak = 0;
            while(i<n && ratings[i]>ratings[i-1]) {
                peak++;
                candies+=peak;
                i++;
            }
            int valley = 0;
            while(i<n && ratings[i]<ratings[i-1]) {
                valley++;
                candies+=valley;
                i++;
            }
            candies-=Math.min(peak, valley);
        }
        return candies;
    }
    public static void main(String[] args) {
        MinimumCandies minimumCandies = new MinimumCandies();
        System.out.println(minimumCandies.candy(new int[]{1,0,2}));
        System.out.println(minimumCandies.candy(new int[]{1,2,2}));
    }
}