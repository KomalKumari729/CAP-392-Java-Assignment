// LeetCode 217 - Contains Duplicate
// Difficulty: Easy
import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
/*
Test Case 1:
Input: [1,2,3,1]
Output: true

Test Case 2:
Input: [1,2,3,4]
Output: false
*/
