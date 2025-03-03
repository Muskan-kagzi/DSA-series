// leetcode (que1)
// problem of the day:- partition array according to given pivot
import java.util.ArrayList;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        int index = 0;
        for (int num : less) {
            nums[index++] = num;
        }
        for (int num : equal) {
            nums[index++] = num;
        }
        for (int num : greater) {
            nums[index++] = num;
        }

        return nums;
    }
}
// T.C=O(n)
// S.C=O(n)
