/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int l = 1 , r=n;
       int x= guess(l);
       if(x==0)return l;
       x= guess(r);
       if(x==0)return r;
       while(x!=0){
          int m = l+(r-l)/2;
       x=guess(m);
       if(x==0)return m;
       else if(x==-1){
        r=m;
       }
       else{
        l=m;
       }
       }
     return n;
    }
}