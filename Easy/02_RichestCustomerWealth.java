// LeetCode 1672 - Richest Customer Wealth
// Difficulty: Easy
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
/*
Test Case 1:
Input: [[1,2,3],[3,2,1]]
Output: 6

Test Case 2:
Input: [[1,5],[7,3],[3,5]]
Output: 10
*/
