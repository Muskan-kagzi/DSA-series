// problem 1 Leetcode 
// https://leetcode.com/problems/count-distinct-numbers-on-board/description/?envType=problem-list-v2&envId=math

class Solution {
    public int distinctIntegers(int n) {
        return n>1?n-1:1;
    }
}
 TC:O(1)
 SC:O(1)
approach:it will return 𝑛−1 when 𝑛 is greater than 1, otherwise it returns 1 if 𝑛 is 1 or less.
//problem 2 link:https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int index = 0; index < arr.size() - m + 1; index++) {
            int currentDiff = arr.get(index + m - 1) - arr.get(index);
            minDiff = Math.min(currentDiff, minDiff);
        }
        return minDiff;
    }
}
TC:O(nlog n)
SC:O(1)
approach:-sort the array in ascending order then we will Use a sliding window to find the minimum difference between subset extreme
