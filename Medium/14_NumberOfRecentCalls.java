// LeetCode 933 - Number of Recent Calls
// Difficulty: Medium
import java.util.Queue;
import java.util.LinkedList;
class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList<>();
    }
    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}
/*
Logic:
Use a Queue to store recent calls.
Remove calls older than 3000 milliseconds.

Test Case 1:
Input: ping(1), ping(100), ping(3001), ping(3002)
Output: 1, 2, 3, 3

Test Case 2:
Input: ping(1000), ping(2000), ping(4000)
Output: 1, 2, 2
*/
