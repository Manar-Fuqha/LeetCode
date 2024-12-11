class Solution {
    public int countGoodSubstrings(String s) {
        int count =0;
        Set<Character> set = new HashSet<>();
        int size=0;
        for(int i=0;i<=s.length() - 3 ;i++){
            set.add(s.charAt(i));
            set.add(s.charAt(i+1));
            set.add(s.charAt(i+2));
            if(set.size()==3)count++;
            set.clear();
        }
        return count;
    }
}