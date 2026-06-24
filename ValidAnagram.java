class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        int []freq = new int[26];
        for(int i=0;i<s.length();i++) {
            freq[s.charAt(i)-'a']+=1;
            freq[t.charAt(i)-'a']-=1;
        }
        for(int i=0;i<26;i++) {
            if(freq[i]!=0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(obj.isAnagram(s, t));
    }
}