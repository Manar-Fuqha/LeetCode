class Solution {
    public int lengthOfLongestSubstring(String s) {
        String news="";
        int max=0;
        for(char c : s.toCharArray()){

            String str =Contains(news, c);
                if(!news.equals(str)){
                    if(news.length()>max)max=news.length();
                news=str+c;
                }
                
                
            
           else{
               news+=c;
           }
       }
        return news.length()<max ?max : news.length();
    }
    
    public String Contains(String s , char c){
       for(int i=0 ; i< s.length();i++){
        if(s.charAt(i)==c){
            s=s.substring(i+1);
        
            break;
        }
       }
        return s;
    }
}