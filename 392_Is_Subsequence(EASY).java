/********************
392. Is Subsequence

Given a string s and a string t, check if s is subsequence of t.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
(ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
********************/
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null || t == null || s.length()>t.length())
            return false;
        else if(s.equals(t))
            return true;
       
        int previousIndex =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index = t.indexOf(ch,previousIndex);
            if(index == -1)
                return false;
            else{
                previousIndex = index+1;
            }
        }
        return true;
    }
}