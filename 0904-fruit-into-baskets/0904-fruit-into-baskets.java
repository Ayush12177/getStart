class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map=new HashMap<>();
        
        int left=0;
        int maxFruit=0;

        for(int right=0; right<fruits.length; right++){
            int rightfruit=fruits[right];
            map.put(rightfruit, map.getOrDefault(rightfruit, 0)+1);

            while(map.size()>2){
                int leftfruit= fruits[left];
                map.put(leftfruit, map.get(leftfruit)-1);

                if(map.get(leftfruit)==0){
                    map.remove(leftfruit);
                }
                left++;
            }
            maxFruit=Math.max(maxFruit, right-left+1);
        }
    return maxFruit;
        
    }
}