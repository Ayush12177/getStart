class Solution {
    public int maxProduct(int n) {
        List<Integer> list= new ArrayList<>();

        while(n>0){
            list.add(n%10);
            n/=10;
        }
        int left=0;
        int right=list.size()-1;
        int max=0;

        while(left<right){
            int curr=list.get(left)*list.get(right);
            max=Math.max(max, curr);
            if(list.get(left)<list.get(right)){
                left++;
            } else {
                right--;
            }
        }
        return max;
        
    }
}