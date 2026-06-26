class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        
        HashMap<String, List<String>> map= new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] arr= strs[i].toCharArray();
            Arrays.sort(arr);
            String str= new String(arr);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        return   new ArrayList<>(map.values());
    }
}