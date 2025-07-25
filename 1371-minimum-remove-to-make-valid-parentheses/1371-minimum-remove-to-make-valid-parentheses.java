class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> invalid = new HashSet<>();
        StringBuilder str= new StringBuilder();
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)==')'){
                    if(stack.isEmpty()){
                        invalid.add(i);
                    }
                    else{
                        stack.pop();
                    }
                }
                if(s.charAt(i)=='('){
                    stack.push(i);
                }
            
        }
        invalid.addAll(stack);
        for(int i=0;i<s.length();i++){
            if(invalid.contains(i)) continue;
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}