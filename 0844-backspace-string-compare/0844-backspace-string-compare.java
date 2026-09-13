class Solution {
    public boolean backspaceCompare(String s, String t) {
    //     return getActual(s).equals(getActual(t));
        
    // }

    // public String getActual(String input){
    //     StringBuilder actualString= new StringBuilder();
         
    //      int hashCount=0;

    //      for(int i=input.length()-1; i>=0;i--){
    //         if(input.charAt(i)=='#'){
    //             hashCount++;
    //             continue;
    //         } 
    //         if(hashCount >0){
    //             hashCount--;
    //         } else {
    //             actualString.insert(0, input.charAt(i));
    //         }
    //      }
    //      return actualString.toString();

    Stack<Character> stack1= new Stack<>();
    Stack<Character> stack2= new Stack<>();

    for(int i=0; i<s.length(); i++){
        char ch= s.charAt(i);
        if(ch == '#'){
            if(!stack1.isEmpty()){
                stack1.pop();
            } 
        } else {
            stack1.push(ch);
        }
    }

    for(int i=0; i<t.length(); i++){
        char ch=t.charAt(i);
        if(ch == '#'){
            if(!stack2.isEmpty()){
                stack2.pop();
            }
        } else {
            stack2.push(ch);
        }
    }
    return stack1.equals(stack2);
    }
}