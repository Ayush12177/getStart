class Solution {
    public int findMaxLength(int[] nums) {
        int len=0;
        int zero=0;
        int one=0;

        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(nums[i]==0){
                zero++;
            } else {
                one++;
            }
            int diff= zero - one;
            if(diff==0){
                len=Math.max(len, i+1);
                continue;
            } 
            if(map.containsKey(diff)){
                len=Math.max(len, i-map.get(diff));
            } else {
                map.put(diff, i);
            }
        }
            
            return len;
        
        
    }
}