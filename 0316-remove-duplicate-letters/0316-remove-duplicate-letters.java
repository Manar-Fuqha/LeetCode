class Solution {
    public String removeDuplicateLetters(String s) {
        
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int[] frequency = new int[26];
        boolean [] inStack = new boolean[26];
        for(int i=0 ; i < s.length() ;i++){
            frequency[s.charAt(i) - 'a']++;
        }

        for(int i =0 ; i< s.length() ; i++){
            char currentChar = s.charAt(i);
            frequency[currentChar -'a']--;

            if(inStack[currentChar - 'a'])continue;

            while(!stack.isEmpty() 
            && stack.peek() > currentChar 
            && frequency[stack.peek() -'a'] >0)
            {
                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(currentChar);
            inStack[currentChar - 'a'] = true;
        }


        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
        }
        return result.toString();
    }
}