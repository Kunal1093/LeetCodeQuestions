/********************

415. Add Strings

Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
********************/

class Solution {
    public String addStrings(String num1, String num2) {
        int length1 = num1.length()-1;
        int length2 = num2.length()-1;
        int carry = 0;
        StringBuffer sb = new StringBuffer();
        while(length1 != -1 || length2 != -1){
            int val;
            if(length1 == -1){
                char ch = num2.charAt(length2);
                val = ch-'0'+carry;
                length2--;
            }
            else if( length2 == -1){
                char ch = num1.charAt(length1);
                val = ch-'0'+carry;
                length1--;
            }
            else{
                char ch1= num1.charAt(length1);
                char ch2 = num2.charAt(length2);
                val = ch1-'0';
                val += ch2 -'0';
                val += carry;
                length2--;
                length1--;
            }
            if(val > 9){
                    sb.append(val%10);
                    carry = 1;
            }
            else{
                 carry = 0;
                 sb.append(val);
            }
        }
        if(carry != 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}