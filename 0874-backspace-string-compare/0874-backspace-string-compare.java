class Solution {
    public boolean backspaceCompare(String s, String t) {
        return remove(s).equals(remove(t));
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