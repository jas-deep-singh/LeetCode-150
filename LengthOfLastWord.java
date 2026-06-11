class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1, len = 0;
        while(i>=0 && s.charAt(i)==' ') {
            i--;
        }
        while(i>=0 && s.charAt(i)!=' ') {
            i--;
            len++;
        }
        return len;
    }
    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();
        String s = "Hello World";
        int result = solution.lengthOfLastWord(s);
        System.out.println("Length of the last word: " + result); 
    }
}