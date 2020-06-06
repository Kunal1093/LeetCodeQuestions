/********************
342. Power of Four
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:
Input: 16
Output: true

Example 2:
Input: 5
Output: false
********************/

class Solution {
    
    static HashSet<Integer> hs = new HashSet<Integer>();
    
    static void addValue(){
        int val = 1;
        hs.add(val);
        for(int i =1;i< 16 ;i++){
            val *= 4;
            hs.add(val);
        }
    }
    
    public boolean isPowerOfFour(int num) {
        if(hs.isEmpty())
            addValue();
        
        if(num<0)
            return false;
        if(hs.contains(num))
            return true;
        
        return false;
    }
}