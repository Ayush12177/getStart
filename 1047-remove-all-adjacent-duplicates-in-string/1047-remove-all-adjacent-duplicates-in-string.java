class Solution {
    public String removeDuplicates(String s) {
        // StringBuilder stack= new StringBuilder();

        // for(Character c: s.toCharArray()){
        //     if(stack.length() > 0 && stack.charAt(stack.length()-1)== c){
        //         stack.deleteCharAt(stack.length()-1);
        //     } else {
        //     stack.append(c);
        //     }
        // }
        // return stack.toString();

        Stack<Character> stack= new Stack<>();

        for(char ch: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            } else if(stack.peek()==ch){
                stack.pop();
            }else {
                stack.push(ch);
            }
            
        }
        StringBuilder sb= new StringBuilder();

            for(char ch: stack){
                sb.append(ch);
            }
            return sb.toString();

    }
}