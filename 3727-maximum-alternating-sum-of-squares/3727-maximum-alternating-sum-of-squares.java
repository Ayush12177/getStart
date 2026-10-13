class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int[] square= new int[n];

        for(int i=0; i<n; i++){
            square[i]=nums[i]*nums[i];
        }

        Arrays.sort(square);

        long ans=0;
        int mid= n/2;

        for(int i=0; i<mid; i++){
            ans-=square[i];
        }

        for(int i=mid; i<n; i++){
            ans+=square[i];
        }
        return ans;
        
    }
}