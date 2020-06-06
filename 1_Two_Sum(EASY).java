/********************
1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
********************/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        //Array for answer
        int ans[] = new int[2];
        
        for(int i=0;i<nums.length;i++){
            //Find value in HashMap (target - nums[i])
            int temp = target-nums[i];
            if(hm.containsKey(temp)){
                ans[0] = hm.get(temp);
                ans[1] = i;
            }
            else{
                //Add that value in HashMap
                hm.put(nums[i],i);
            }
        }
        return ans;
    }
}