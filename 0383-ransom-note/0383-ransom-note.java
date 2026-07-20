class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // int[] count= new int[26];

        // for(char c:magazine.toCharArray()){
        //     count[c-'a']++;
        // } 

        // for(char c: ransomNote.toCharArray()){
        //     if(count[c-'a']==0){
        //         return false;
        //     }

        //     count[c-'a']--;
        // }
        // return true;
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();


        for(int i=0; i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            need.put(ch,need.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<magazine.length();i++){
            char ch = magazine.charAt(i);
            have.put(ch, have.getOrDefault(ch,0)+1);
        }

        for (char ch : need.keySet()) {
            if (have.getOrDefault(ch, 0) < need.get(ch)) {
                return false;
            }
        }
    return true;

        
    }
}