class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();

        List<Integer> list= new ArrayList<>();
        int n= nums.length/3;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int key: map.keySet()){
            if(map.get(key)>n){
                list.add(key);
            }
        }
        return list;
        
    }
}