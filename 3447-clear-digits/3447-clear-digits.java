class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            
            }
            else{
                stack.push(c);
            }
        }
        return print(stack);

    }
    public String print(Stack<Character> stack){
        String s="";
        while (!stack.isEmpty()){
            s=stack.pop()+s;
        }
        return s;
    }
}