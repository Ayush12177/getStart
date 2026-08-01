class Solution {
    public String frequencySort(String s) {
        if(s==null || s.length() <=1) return s;

        HashMap<Character, Integer> map= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        List<Character> list=new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) ->{
            int freqA=map.get(a);
            int freqB=map.get(b);

            if(freqA != freqB){
                return Integer.compare(freqB, freqA);
            }
            return Character.compare(a,b);
        });

        StringBuilder sb= new StringBuilder();
        for(char ch: list){
            int count= map.get(ch);
            for(int i=0; i< count; i++){
                sb.append(ch);
            }
        }
        return sb.toString();      
    }
}