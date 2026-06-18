import java.util.HashSet;

class LongestSubstringWithoutRepitition {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0, max = 0;
        for(int j=0;j<s.length();j++) {
            while(set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            max = Math.max(max, j-i+1);
        }
        return max;
    }
    public static void main(String[] args) {
        LongestSubstringWithoutRepitition obj = new LongestSubstringWithoutRepitition();
        System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
    }
}