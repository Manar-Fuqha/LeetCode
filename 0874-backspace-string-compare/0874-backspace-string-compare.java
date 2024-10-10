class Solution {
    public boolean backspaceCompare(String s, String t) {
        s=remove(s);
        t=remove(t);
        if(s.equals(t)){
            return true;
        }
        return false;
    }
    public String remove(String s ){
         Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c =='#'){
                if(!stack.isEmpty()){
                stack.pop();
                }
            }
            else{
                stack.push(c);
            }
        }
        String news ="";
        while(!stack.isEmpty()){
            news+=stack.pop();
        }
        return news;
    }
}