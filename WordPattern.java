import java.util.HashMap;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> mapST = new HashMap<>();
        HashMap<Character, String> mapTS = new HashMap<>();
        String []sArray = s.split(" ");
        if (sArray.length != pattern.length()) {
            return false;
        }
        for(int i=0;i<pattern.length();i++) {
            String st = sArray[i];
            char ts = pattern.charAt(i);
            if ((mapST.containsKey(st) && mapST.get(st) != ts) ||
                (mapTS.containsKey(ts) && !mapTS.get(ts).equals(st))) {
                return false;
            }
            mapST.put(st, ts);
            mapTS.put(ts, st);
        }
        return true;
    }
    public static void main(String[] args) {
        WordPattern obj = new WordPattern();
        System.out.println(obj.wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(obj.wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(obj.wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(obj.wordPattern("abba", "dog dog dog dog")); // false
    }
}