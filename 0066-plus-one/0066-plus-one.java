class Solution {
    public int[] plusOne(int[] digits) {
        boolean check=false;
                 for(int i=0;i<digits.length;i++){
                     if(digits[i]!=9){
                         check=false;
                          break;
                     }
                     else{
                        check= true;
                     }
                 }
               digits[digits.length-1]++;
               if(check){
                int size=digits.length+1;
                int []arr=new int [size]; 
               for(int i=digits.length-1;i>=0;i--){
                  if(digits[i]>=9){
                      arr[i+1]=0;
                      arr[i]=1;
                  }
                  else{
                      arr[i]=digits[i];
                  }
               }
               return arr;} 
        for(int i=digits.length-1;i>0;i--){
                  if(digits[i]>9){
                      digits[i]=0;
                      digits[i-1]++;
                  }
                   
              
           }
               return digits;
}  
}