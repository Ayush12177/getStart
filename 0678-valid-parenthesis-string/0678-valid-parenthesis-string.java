class Solution {
    public boolean checkValidString(String s) {
       int minOpen=0;
       int maxOpen=0;

       for(char ch:s.toCharArray()){
        if(ch=='('){
            minOpen++;
            maxOpen++;
        } else if(ch==')'){
            minOpen--;
            maxOpen--;
        } else { //* ke liye use krenge
            minOpen--; // iska mtlb h * ko humne ')' ye man liya h
            maxOpen++; //iska mtlb h * ko humne '()' ye man liya h
        }

        if(maxOpen < 0){
            return false;
        }

        if(minOpen <0) minOpen=0;

       }
       return minOpen==0;
        
    }
}