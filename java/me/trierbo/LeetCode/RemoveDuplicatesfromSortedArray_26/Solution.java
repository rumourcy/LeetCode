package me.trierbo.LeetCode.RemoveDuplicatesfromSortedArray_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[res]) {
                res++;
                nums[res] = nums[i];
            }
        }
        return res+1;
    }
}