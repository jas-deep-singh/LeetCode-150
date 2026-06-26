class Power {
    public double power(double x, long n) {
        if(n==0) {
            return 1.0;
        }
        else if(n==1) {
            return x;
        }
        else {
            if(n%2==0) {
                return power(x*x, n/2);
            }
            else {
                return x*power(x, n-1);
            }
        }
    }
    public double myPow(double x, int n) {
        long N = n;
        if(N<0) {
            return 1.0/power(x, -N);
        }
        else {
            return power(x, N);
        }
    }
    public static void main(String[] args) {
        Power p = new Power();
        System.out.println(p.myPow(2.0, 10));
        System.out.println(p.myPow(2.1, 3));
        System.out.println(p.myPow(2.0, -2));
    }
}