/********************
268. Missing Number

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:
Input: [3,0,1]
Output: 2

Example 2:
Input: [9,6,4,2,3,5,7,0,1]
Output: 8
********************/

class Solution {
    public int missingNumber(int[] nums) {
        //Find sum of first n numbers
        int len = nums.length;
        int sum =  (len*(len+1))/2;
        
        //remove all array values from sum
        for(int i=0;i<len;i++){
            sum -= nums[i];
        }
        return sum;
    }
}