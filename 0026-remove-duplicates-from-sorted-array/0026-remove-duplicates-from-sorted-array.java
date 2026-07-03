class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=0;
        // for(int j=0; j<nums.length; j++){
        //     if(nums[i]<nums[j]){
        //         int temp= nums[i+1];
        //         nums[i+1]=nums[j];
        //         nums[j]=temp;
        //         i++;
        //     }
        // }
        // return i+1;
        int i=0;
        int unique=1;
        int j=1;

        while(j<nums.length){
            if(nums[j]== nums[j-1]){
                j++;
                continue;
            } else {
                nums[i+1]=nums[j];
                i++;
                unique++;
                j++;
            }
        }
        return unique;
        
    }
}