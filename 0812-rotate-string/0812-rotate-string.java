class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder str = new StringBuilder(s);

        for(int i=0;i<s.length();i++){
            if(str.toString().equals(goal))return true;
            char c = str.charAt(0);
            str.deleteCharAt(0);
            str.append(c);

        }
        return false;

    }
}