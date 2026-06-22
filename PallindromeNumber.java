class PallindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        int k = x, r = 0;
        while(k!=0) {
            r = r*10+(k%10);
            k/=10;
        }
        return x==r;
    }
    public static void main(String[] args) {
        PallindromeNumber p = new PallindromeNumber();
        System.out.println(p.isPalindrome(121));
    }
}