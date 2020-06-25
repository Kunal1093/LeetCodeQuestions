/*******************************
844. Backspace String Compare

Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".

Example 2:
Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".

Example 3:
Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
*******************************/
class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        if(getFinalString(S).equals(getFinalString(T)))
            return true;
        
        return false;
    }
    
    public static String getFinalString(String str){
        StringBuilder sb = new StringBuilder();
        
        for(char ch :str.toCharArray()){
            if(ch =='#'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}