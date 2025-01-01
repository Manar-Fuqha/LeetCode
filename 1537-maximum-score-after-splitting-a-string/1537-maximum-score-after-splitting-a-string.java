class Solution {
    public int maxScore(String s) {

       int ones =0 , zeros=0;
       int score=0,maxScore=0;
       for(char c :s.toCharArray()){
          if(c=='1')ones++;
       } 


       int i=0;
       while(i<s.length()-1){
        char c=s.charAt(i);
        if(c=='0'){
            zeros++;  
        }
        else{
            ones--;
        }
        score=zeros+ones;
        maxScore=Math.max(score,maxScore);
        i++;
       }
       return maxScore;
    }
}