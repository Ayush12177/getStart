class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minEnd = 0;
        int maxEnd = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
       

        for (int i = 0; i < nums.length; i++) {
            minEnd = Math.min(nums[i], minEnd + nums[i]);
            minSum = Math.min(minSum, minEnd);

            maxEnd = Math.max(nums[i], maxEnd + nums[i]);
            maxSum = Math.max(maxSum, maxEnd);
        }

         return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}