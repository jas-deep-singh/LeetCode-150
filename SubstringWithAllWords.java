import java.util.*;

class SubstringWithAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int wordLen = words[0].length(), wordCount = words.length;
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for(int i=0;i<wordCount;i++) {
            int left = i;
            int matchedWords = 0;
            HashMap<String, Integer> window = new HashMap<>();
            for(int right=left;right+wordLen<=s.length();right+=wordLen) {
                String str = s.substring(right, right+wordLen);
                if(!map.containsKey(str)) {
                    matchedWords = 0;
                    window.clear();
                    left = right+wordLen;
                    continue;
                }
                window.put(str, window.getOrDefault(str, 0)+1);
                matchedWords+=1;
                while(window.get(str)>map.get(str)) {
                    String leftWord = s.substring(left, left+wordLen);
                    window.put(leftWord, window.get(leftWord)-1);
                    matchedWords-=1;
                    left+=wordLen;
                }
                if(matchedWords==wordCount) {
                    result.add(left);
                    String leftWord = s.substring(left, left+wordLen);
                    window.put(leftWord, window.get(leftWord)-1);
                    matchedWords-=1;
                    left+=wordLen;
                }
            }
        }
        return result;
    }
    public static void main(String []args) {
        SubstringWithAllWords obj = new SubstringWithAllWords();
        List<Integer> result = new ArrayList<>();
        String s = "barfoothefoobarman";
        String []words = {"foo","bar"};
        result = obj.findSubstring(s, words);
        System.out.println(result);
    }
}