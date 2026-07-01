class Solution {
    public int maxProduct(int[] nums) {
        int minPrd=nums[0];
        int maxPrd=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] < 0){
                int temp= maxPrd;
                maxPrd= minPrd;
                minPrd= temp;
            }
            minPrd=Math.min(nums[i], minPrd*nums[i]);
            maxPrd=Math.max(nums[i], maxPrd*nums[i]);    

            ans=Math.max(ans, maxPrd);        
        }
             return ans;

    }
}