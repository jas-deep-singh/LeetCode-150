import java.util.*;

class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> str = new ArrayList<>();
        int n = words.length;
        int i = 0, j = 0;
        while(i<n) {
            int letters = words[i].length();
            j = i+1;
            while(j<n && letters+words[j].length()+(j-i)<=maxWidth) {
                letters+=words[j].length();
                j++;
            }
            int wCnt = j-i;
            int gaps = wCnt-1;
            int totSps = maxWidth-letters;
            StringBuilder st = new StringBuilder();
            if(j==n) {
                for(int k=i;k<j;k++) {
                    st.append(words[k]);
                    if(k<j-1) {
                        st.append(" ");
                    }
                }
                st.append(" ".repeat(totSps-gaps));
            }
            else if(wCnt==1) {
                st.append(words[i]);
                st.append(" ".repeat(totSps));
            }
            else {
                int bet = totSps/gaps;
                int ext = totSps%gaps;
                for(int k=i;k<j;k++) {
                    st.append(words[k]);
                    if(k<j-1) {
                        st.append(" ".repeat(bet));
                        if(ext>0) {
                            st.append(" ");
                            ext--;
                        }
                    }
                }
            }
            str.add(st.toString());
            i = j;
        }
        return str;
    }
    public static void main(String[] args) {
        TextJustification tj = new TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> result = tj.fullJustify(words, maxWidth);
        for (String line : result) {
            System.out.println("\"" + line + "\"");
        }
    }
}