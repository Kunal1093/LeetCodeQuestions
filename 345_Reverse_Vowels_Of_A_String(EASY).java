/********************
345. Reverse Vowels of a String
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Input: "hello"
Output: "holle"

Example 2:
Input: "leetcode"
Output: "leotcede"
********************/
class Solution {

    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    
    public String reverseVowels(String s) {
        
        if(s.length() ==0 || s.length() ==1){
            return s;
        }
        Stack<Character> st = new Stack<Character>();
       
        for(char ch : s.toCharArray()){
            if(isVowel(ch))
                st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        
        for(char ch:s.toCharArray()){
            if(isVowel(ch))
                sb.append(st.pop());
            else
                sb.append(ch);
        }
        return sb.toString();
    }
}