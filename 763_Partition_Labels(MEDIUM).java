/*************************************
763. Partition Labels

A string S of lowercase English letters is given.
We want to partition this string into as many parts as possible so that each letter appears in at most one part,
 and return a list of integers representing the size of these parts.


Example 1:
Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
*************************************/
class Solution {
    public List<Integer> partitionLabels(String str) {
        List<Integer> ll = new ArrayList<Integer>();
        int lastIndexValues[] = new int[26];
        for(int i=0;i<str.length();i++){
            lastIndexValues[str.charAt(i)-'a'] = i;
        }
        
        for(int i=0;i<str.length();i++){
            int firstIndex = i;
            char ch = str.charAt(i);
            int lastIndex = lastIndexValues[ch-'a'];
            if(firstIndex == lastIndex){
                ll.add(1);
            }
            else{
                while(firstIndex != lastIndex){
                    if(lastIndexValues[str.charAt(firstIndex)-'a'] > lastIndex){
                        lastIndex = lastIndexValues[str.charAt(firstIndex)-'a'];
                    }
                    firstIndex++;
                }
                ll.add(lastIndex-i+1);
            }
            i = lastIndex;
        }
        return ll;
    }
}