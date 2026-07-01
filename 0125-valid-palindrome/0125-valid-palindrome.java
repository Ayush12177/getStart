class Solution {
    public boolean isPalindrome(String s) {
      s = s.toUpperCase().replaceAll("[^A-Z0-9]", "");

       int i=0;
       int j=s.length()-1;

       while(i<=j){
        if(s.charAt(i)!= s.charAt(j)){
            return false;
        }
        i++;
        j--;
       }

       return true;
        
    }
}