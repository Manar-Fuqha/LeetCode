class Solution {
    public int compress(char[] chars) {
        String s ="";
        int count =0;
        if(chars.length==1)return 1;

        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count ++;
                if(i==chars.length-2){
                        s=AddToString(s, ++count , chars[i]);
                }
            }
            else{
               
               s=AddToString(s, ++count , chars[i]);
                count=0;
                   if(i==chars.length-2){
                        s=AddToString(s, 0 , chars[i+1]);
                }
            }
  
        }
  
        modifyArray(chars , s);
        return s.length();
    }

    public void modifyArray(char[] chars , String s){
        for(int i=0;i<s.length() ; i++){
            chars[i]=s.charAt(i);
        }
    }
    public String AddToString(String s ,int count , char c){
        s+=c;
        if(count>1){
        s+=count;
        }
        return s;
    }
}