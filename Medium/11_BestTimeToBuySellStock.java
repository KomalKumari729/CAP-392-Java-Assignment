// LeetCode 121 - Best Time to Buy and Sell Stock
// Difficulty: Medium
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit,price - minPrice);
            }
        }
        return maxProfit;
    }
}
/*
Logic:
Find the minimum buying price and
calculate the maximum profit.

Test Case 1:
Input: [7,1,5,3,6,4]
Output: 5

Test Case 2:
Input: [7,6,4,3,1]
Output: 0
*/
