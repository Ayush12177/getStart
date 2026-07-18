class Solution {
    public int maxProduct(int[] nums) {
        // int minPrd=nums[0];
        // int maxPrd=nums[0];
        // int ans=nums[0];

        // for(int i=1;i<nums.length;i++){
        //     if(nums[i] < 0){
        //         int temp= maxPrd;
        //         maxPrd= minPrd;
        //         minPrd= temp;
        //     }
        //     minPrd=Math.min(nums[i], minPrd*nums[i]);
        //     maxPrd=Math.max(nums[i], maxPrd*nums[i]);    

        //     ans=Math.max(ans, maxPrd);        
        // }
        //      return ans;
        int minEnd=nums[0];
        int maxEnd=nums[0];
        int ans=nums[0];

        for(int i=1; i<nums.length; i++){
            int v2= minEnd * nums[i];
            int v1= nums[i];
            int v3= maxEnd * nums[i];

            maxEnd=Math.max(v1,Math.max(v2,v3));
            minEnd=Math.min(v1,Math.min(v2,v3));
            ans=Math.max(ans,Math.max(maxEnd,minEnd));
        }
        return ans;
    }
}