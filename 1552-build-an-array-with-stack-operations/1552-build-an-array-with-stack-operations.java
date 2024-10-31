class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int j =0 ,i=1;

        while(j<target.length){
            list.add("Push");
            if(j<target.length&&i!=target[j]){
                list.add("Pop");
            }
            else{
                j++;
            }
          
i++;
       
        }
        return list;
    }
}