// LeetCode 1480 - Running Sum of 1d Array
// Difficulty: Easy
class Solution {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}

/*
Logic:
Add the previous element to the current element.
Test Case 1:
Input: [1,2,3,4]
Output: [1,3,6,10]

Test Case 2:
Input: [1,1,1,1,1]
Output: [1,2,3,4,5]
*/
