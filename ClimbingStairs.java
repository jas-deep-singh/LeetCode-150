class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int prev2 = 1; 
        int prev1 = 2; 
        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        int n = 5; 
        int ways = cs.climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}