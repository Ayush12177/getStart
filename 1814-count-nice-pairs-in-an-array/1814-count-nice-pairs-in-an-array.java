class Solution {
    public int countNicePairs(int[] nums) {
        int mod=1000000007;
        HashMap<Integer, Integer> map= new HashMap<>();
        long nicePairs=0;

        for(int num:nums){
            int revNum= reverse(num);
            int diff= num - revNum;
        

        int currCount=map.getOrDefault(diff,0);
        nicePairs=(nicePairs + currCount) % mod;

        map.put(diff, currCount+1);
        }
        return (int) nicePairs;
        
    }
    private int reverse(int num){
        int rev=0;
        while(num>0){
            rev=rev*10 + (num %10);
            num/=10;
        }
        return rev;
    }

}