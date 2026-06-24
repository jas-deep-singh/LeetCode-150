class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) {
            return false;
        }
        int []freq = new int[26];
        for(int i=0;i<ransomNote.length();i++) {
            freq[ransomNote.charAt(i)-'a']+=1;
        }
        for(int i=0;i<magazine.length();i++) {
            freq[magazine.charAt(i)-'a']-=1;
        }
        for(int i=0;i<26;i++) {
            if(freq[i]>0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String []args) {
        RansomNote obj = new RansomNote();
        System.out.println(obj.canConstruct("a", "b"));
    }
}