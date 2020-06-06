/********************
Given an integer, write a function to determine if it is a power of two.

Example 1:
Input: 1
Output: true 
Explanation: 2^0 = 1


Example 2:
Input: 16
Output: true
Explanation: 2^4 = 16

Example 3:
Input: 218
Output: false
********************/

class Solution {
    
    public static HashSet<Integer> hs = new HashSet<Integer>();
    
    static void addValues(){
	//Add all 2 power values in HashSet until 2^31-1(Largest integer)
        int val = 1;
        hs.add(val);
        for(int i=1; i < 31; i++){
            val *= 2;
            hs.add(val);
        }
    }
    public boolean isPowerOfTwo(int n) {
        // Run only first time.
		if(hs.isEmpty())
            addValues();
			
        if(n < 0)
            return false;
        else if(hs.contains(n))
            return true;
        
        return false;
    }
}