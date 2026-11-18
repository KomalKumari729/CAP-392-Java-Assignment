// LeetCode 912 - Sort an Array
// Difficulty: Medium
class Solution {
    public int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}

/*
Logic:
Use Bubble Sort to arrange elements
in ascending order by swapping adjacent elements.

Test Case 1:
Input: [5,2,3,1]
Output: [1,2,3,5]

Test Case 2:
Input: [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
*/
