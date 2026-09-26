class Solution {
    public String removeDuplicates(String s, int k) {
        int n= s.length();
        Stack<int[]> stack = new Stack<>();

        for(int i=0; i<n; i++){
            char ch= s.charAt(i);

            if(stack.isEmpty() || stack.peek()[0] != ch){
                stack.push(new int[]{ch,1});
            } else {
                stack.peek()[1]++;

                if(stack.peek()[1] == k){
                    stack.pop();
                }
            }

        }

        StringBuilder sb = new StringBuilder();

        for(int[] pair: stack){
            char ch=(char) pair[0];
            int count= pair[1];

            while(count -- > 0){
                sb.append(ch);
            }

        }
        return sb.toString();
        
    }
}