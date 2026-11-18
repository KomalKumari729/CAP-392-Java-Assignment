// LeetCode 1470 - Shuffle the Array
// Difficulty: Easy
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }
}

/*
Test Case 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]

Test Case 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
*/
