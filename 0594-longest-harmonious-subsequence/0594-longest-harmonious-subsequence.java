class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int maxLen=0;

        for(int num: map.keySet()){
            if(map.containsKey(num +1)){
                int len= map.get(num) + map.get(num+1);
                maxLen=Math.max(maxLen, len);
            }
        }
        return maxLen;

    }
}