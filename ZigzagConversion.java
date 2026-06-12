class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1) {
            return s;
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<numRows;i++) {
            int incr = 2*(numRows-1);
            for(int j=i;j<s.length();j+=incr) {
                str.append(s.charAt(j));
                if(i>0 && i<numRows-1 && j+incr-2*i<s.length()) {
                    str.append(s.charAt(j+incr-2*i));
                }
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        System.out.println(zigzagConversion.convert("PAYPALISHIRING", 3));
    }
}