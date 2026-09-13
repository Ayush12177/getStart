class Solution {
    public boolean canJump(int[] nums) {
        // int lastPos=nums.length-1;
        // for(int i=nums.length-2;i>=0;i--){
        //     if(i+nums[i]>=lastPos){
        //         lastPos=i;
        //     }
        // }

        // return lastPos==0;

        int reachable=0;
        for(int i=0; i<nums.length; i++){
            if(reachable < i){
                return false;
            } else {
                reachable=Math.max(reachable, i + nums[i]);
            }
        }
        return true;
        
    }
}