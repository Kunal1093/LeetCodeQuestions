/********************
	387. First Unique Character in a String
	Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

	Examples:

	s = "leetcode"
	return 0.

	s = "loveleetcode",
	return 2.
********************/
	
class Solution {
    public int firstUniqChar(String s) {
        //Create a HashMap
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int i=0;
		
        for(char ch :s.toCharArray()){
            //Add frequency of each character in that hashmap
			hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        for(char ch:s.toCharArray()){
            //Check which element has frequency 1
			if(hm.get(ch) == 1){
                return i;
            }
            i++;
        }
        return -1;
    }
}