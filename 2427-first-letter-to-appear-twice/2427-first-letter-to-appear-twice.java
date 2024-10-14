class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        char x=' ';
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                x= c;
                break;
            }
            else{
                set.add(c);
            }
        }
        return x;
    }
}