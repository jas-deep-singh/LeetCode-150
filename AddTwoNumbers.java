class AddTwoNumbers {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length()-1, j = b.length()-1, carry = 0;
        while(i>=0 || j>=0 || carry==1) {
            int sum = carry;
            if(i>=0) {
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0) {
                sum+=b.charAt(j)-'0';
                j--;
            }
            result.append(sum%2);
            carry = sum/2;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        AddTwoNumbers adder = new AddTwoNumbers();
        String a = "11";
        String b = "1";
        String result = adder.addBinary(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + result);
    }
}