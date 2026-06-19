import java.util.HashMap;

class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int charCount = t.length(), matchedChars = 0, size = Integer.MAX_VALUE, left = 0, start = 0;
        for(char c: t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        for(int j=0;j<s.length();j++) {
            char c = s.charAt(j);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if(map.containsKey(c) && window.get(c) <= map.get(c)) {
                matchedChars++;
            }
            while(matchedChars==charCount) {
                if(j-left+1<size) {
                    size = j-left+1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                if(map.containsKey(leftChar) && window.get(leftChar)<=map.get(leftChar)) {
                    matchedChars-=1;
                }
                window.put(leftChar, window.get(leftChar)-1);
                left++;
            }
        }
        return size == Integer.MAX_VALUE ? "" : s.substring(start, start+size);
    }
    public static void main(String []args) {
        MinimumWindowSubstring obj = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = obj.minWindow(s, t);
        System.out.println(result);
    }
}