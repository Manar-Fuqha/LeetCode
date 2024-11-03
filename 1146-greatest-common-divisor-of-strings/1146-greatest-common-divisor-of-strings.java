class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int a=str1.length() , b = str2.length() ,i;
        int gcd = 1;
        i= a<b ? a : b;


        for( i =i ; i> 1 ;i--){
            if(a%i==0 && b%i==0){
                 gcd=i;
                 break;
            }
        }

        String s = str2.substring(0,gcd);
        String join = str1+str2;
        for(int j=0;j<join.length();j+=gcd){
            if(!s.equals(join.substring(j,j+gcd)) )
            return "";
        }
return s;
    }
}