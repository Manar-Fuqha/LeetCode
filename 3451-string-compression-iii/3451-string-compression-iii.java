class Solution {
    public String compressedString(String word) {
        StringBuilder str = new StringBuilder();
        int count =1;
        char c = word.charAt(0);
        for(int i=1 ;i<word.length() ;i++){
            if(word.charAt(i) == c){
                count++;
            } 
            else{
             appending(str , count , c);
                count=1;
            }
            c= word.charAt(i);
        }
        appending(str , count , word.charAt(word.length()-1));
        return str.toString();
    }

    private void appending(StringBuilder str , int count , char c){
          if(count >=10){
                    str.append(9);
                    str.append(c);
                    appending(str , count-9 , c);
                }
                else{               
                str.append(count);
                str.append(c);
                }
    }
}