class Solution {
    public int largestCombination(int[] candidates) {
        int maxsize =0;
        for(int i=0;i<32;i++){
            int size =0;
            for(int num : candidates){
                if((num & (1<<i)) !=0){
                    size++;
                }
            }
            maxsize = Math.max(size , maxsize);
        }
        return maxsize;
    }
}