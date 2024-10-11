class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
                int ascii =c;
                if(!stack.isEmpty()&& 
                (ascii+32==(int)stack.peek() || ascii-32==(int)stack.peek())){
                    stack.pop();
                }
            
            else{
                stack.push(c);
            }
        }

        String news="";
        while(!stack.isEmpty()){
            news=stack.pop()+news;
        }
        return news;
    }
}