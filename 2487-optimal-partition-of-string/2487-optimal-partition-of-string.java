class Solution {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
      
        int count =1;
        
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                count ++;
                set.clear();
                set.add(c);
            }
            else{
                set.add(c);
            }
            
        }
        return count;
    }
}