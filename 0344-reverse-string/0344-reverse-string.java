class Solution {
    public void reverseStringHelp(char[] s, int start, int end){
        if(start >= end){
            return;
        }

        char temp= s[start];
        s[start]= s[end];
        s[end]=temp;

        reverseStringHelp(s, start+1, end-1);        

    }
    public void reverseString(char[] s) {   
            reverseStringHelp(s, 0, s.length-1);
        
    }
}