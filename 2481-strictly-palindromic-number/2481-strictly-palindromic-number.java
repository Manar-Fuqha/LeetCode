class Solution {
    public boolean isStrictlyPalindromic(int n) {
        return isPalindromic(n);
    }
    private String convertDecimal(int n, int i){
        String s ="";
       
        while(n!=0){
            s=n%i+s;
            n/=i;
        }
        return s;
    }
    private Boolean isPalindromic( int n){
         for(int i=2 ; i<=n-2;i++){
             String s=convertDecimal(n ,i);
        int f=0 , l = s.length()-1;
        while(f<l){
            if(s.charAt(f)!=s.charAt(l)) return false;
            f++;
            l--;
        }
       
         }
        return true;
    }
}