import java.util.HashMap;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char st = s.charAt(i);
            char ts = t.charAt(i);
            if ((mapST.containsKey(st) && mapST.get(st) != ts) ||
                (mapTS.containsKey(ts) && mapTS.get(ts) != st)) {
                return false;
            }
            mapST.put(st, ts);
            mapTS.put(ts, st);
        }
        return true;
    }
    public static void main(String[] args) {
        IsomorphicStrings solution = new IsomorphicStrings();
        String s1 = "egg";
        String t1 = "add";
        System.out.println(solution.isIsomorphic(s1, t1)); 
        String s2 = "foo";
        String t2 = "bar";
        System.out.println(solution.isIsomorphic(s2, t2));
        String s3 = "paper";
        String t3 = "title";
        System.out.println(solution.isIsomorphic(s3, t3)); 
    }
}