class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=nums.length-1;
        // Arrays.sort(nums);

        while(left < right){
            int curr=(nums[left]-1) * (nums[right]-1);
            max=Math.max(max, curr);

            if(nums[left]< nums[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}