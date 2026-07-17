class Solution {
    public int findDuplicate(int[] nums) {
        // int i=0;
        // while( i< nums.length){
        //     if(nums[i] != i+1){
        //         int correct= nums[i]-1;
        //         if(nums[i] != nums[correct]){
        //         int temp=nums[correct];
        //         nums[correct]=nums[i];
        //         nums[i]=temp;
        //         } else{
        //             return nums[i];
        //         }
        //     } else {
        //         i++;
        //     }
            
        // }
        // return -1;
        int slow= nums[0];
        int fast= nums[0];

        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            // fast=nums[fast];

            if(slow==fast){
                slow=nums[0];
                while(slow != fast){
                    slow=nums[slow];
                    fast=nums[fast];
                }
                return slow;
            }
        }   
    }
}