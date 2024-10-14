class Solution {
    public boolean isHappy(int n) {
        if(n==1)return true;
        if(n>=2 && n<7)return false;

        return isHappy(squareDigits(n));

    }
    public int squareDigits(int n){
        int sq=0;
        while(n!=0){
            sq+=Math.pow(n%10,2);
            n=n/10;
        }
        return sq;
    }
}