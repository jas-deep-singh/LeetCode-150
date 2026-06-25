class SquareRoot {
    public int mySqrt(int x) {
        if(x<=1) {
            return x;
        }
        int low = 1, high = x/2, result = 0;
        while(low<=high) {
            int mid = low+((high-low)/2);
            long square = (long)mid*mid;
            if(square==x) {
                return mid;
            }
            else if(square<x) {
                result = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SquareRoot obj = new SquareRoot();
        System.out.println(obj.mySqrt(8));
    }
}