// LeetCode 75 - Sort Colors
// Difficulty: Hard
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
         int temp = nums[mid];
         nums[mid] = nums[high];
         nums[high] = temp;
         high--;
            }
        }
    }
}
/*
Logic:
Use three pointers: low, mid and high.
Arrange 0s, 1s and 2s in one pass.

Test Case 1:
Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Test Case 2:
Input: [2,0,1]
Output: [0,1,2]
*/
