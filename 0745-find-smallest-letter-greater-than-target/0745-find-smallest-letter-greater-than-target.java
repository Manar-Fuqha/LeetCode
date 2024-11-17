class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;
        if(letters[length-1] <target)return letters[0];

        for(int i=0;i<length;i++){
            if(letters[i]>target)
            return letters[i];
        }
        return letters[0];
    }
}