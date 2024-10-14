class Solution {
    public boolean isSameAfterReversals(int num) {
        int first  = reverse(num);

        return num == reverse(first);
    }
    public int reverse(int x){
        int rev=0;
        while(x!=0){
            rev = rev*10+x%10;
            x/=10;

        }
  
        return rev;
    }
}