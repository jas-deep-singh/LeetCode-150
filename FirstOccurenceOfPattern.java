class FirstOccurenceOfPattern {
    public int[] buildLps(String needle) {
        int m = needle.length();
        int[] lps = new int[m];
        int i = 1, len = 0;
        while(i<m) {
            if(needle.charAt(i)==needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if(len!=0) {
                    len = lps[len-1];
                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public int strStr(String haystack, String needle) {
        int[] lps = buildLps(needle);
        int i = 0, j = 0;
        while(i<haystack.length()) {
            if(haystack.charAt(i)==needle.charAt(j)) {
                i++;
                j++;
            }
            if(j==needle.length()) {
                return i-j;
            }
            else if(i<haystack.length() && haystack.charAt(i)!=needle.charAt(j)) {
                if(j!=0) {
                    j = lps[j-1];
                }
                else {
                    i++;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FirstOccurenceOfPattern obj = new FirstOccurenceOfPattern();
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(obj.strStr(haystack, needle));
    }
}