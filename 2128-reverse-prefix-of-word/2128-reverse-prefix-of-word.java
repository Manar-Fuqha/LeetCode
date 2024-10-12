class Solution {
    public String reversePrefix(String word, char ch) {
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                word=reverse(word , i);
                break;
            }
        }
        return word;
    }

    public String reverse(String word , int index){
        int i=0;
        char[] s = word.toCharArray();
        while(i<index){
            char temp = s[i];
            s[i]=s[index];
            s[index]=temp;
            i++;
            index--;
        }
        return new String(s);
    }
}