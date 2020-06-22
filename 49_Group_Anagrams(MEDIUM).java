/********************************
49. Group Anagrams

Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.
********************************/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ll = new ArrayList<>();
        if(strs.length == 0)
            return ll;
        HashMap<String,List<String>> hMap = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(!hMap.containsKey(temp)){
                hMap.put(temp,new ArrayList<String>());
            }
            
            hMap.get(temp).add(strs[i]);
        }
        
        for(List newList:hMap.values()){
            ll.add(newList);
        }
        return ll;
    }
}