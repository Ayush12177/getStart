class Solution {
    public int longestPalindrome(String s) {
        // int[] freq = new int[128];

        // for(char c : s.toCharArray()){
        //     freq[c]++;
        // }

        // int length = 0;
        // boolean oddFound = false;

        // for(int count : freq){
        //     if(count % 2 == 0){
        //         length += count;
        //     } else {
        //         length += count - 1;
        //         oddFound = true;
        //     }
        // }

        // if(oddFound) length += 1;

        // return length;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int res = 0;
        boolean odd = false;

        for (char ch : map.keySet()) {
            int count = map.get(ch);

            if (count % 2 == 0) {
                res += count;
            } else {
                res += count - 1;
                odd = true;
            }
        }

        if (odd) {
            res++;
        }

        return res;
    }
}