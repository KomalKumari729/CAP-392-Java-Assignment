// LeetCode 125 - Valid Palindrome
// Difficulty: Easy
class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "")
                      .toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
Test Case 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Test Case 2:
Input: "race a car"
Output: false
*/
