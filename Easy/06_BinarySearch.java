// LeetCode 704 - Binary Search
// Difficulty: Easy
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

/*
Test Case 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4

Test Case 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
*/
