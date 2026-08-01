class Solution {
    public int maxSubArray(int[] nums) {
        // int ms = Integer.MIN_VALUE; 
        // int cs = 0;                 

        // for (int i = 0; i < nums.length; i++) {
        //     cs = cs + nums[i];     
        //     ms = Math.max(ms, cs);   

        //     if (cs < 0) {            
        //         cs = 0;
        //     }
        // }

        // System.out.println("Max sum of the array: " + ms);
        // return ms; 
        int maxEnd=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i< nums.length; i++){
            maxEnd=Math.max(nums[i], maxEnd+nums[i]);
            maxSum=Math.max(maxSum, maxEnd);
        }
        return maxSum;
    }
}
