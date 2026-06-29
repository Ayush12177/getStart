class Solution {
    public int[] runningSum(int[] nums) {
        
        int n= nums.length;

        int prefix = 0;
        

        for(int i=0; i<n; i++){
            prefix=prefix + nums[i];
            nums[i]= prefix;
            
        }
         
         return nums;
    }
}