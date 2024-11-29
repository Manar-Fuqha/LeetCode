class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
           
        int[] result = new int[spells.length];

        for(int i=0;i<spells.length;i++){
            long num = (long) Math.ceil((double) success / spells[i]);
            
            int l =0 , r =potions.length;
            while(l<r){
                int m = l+(r-l)/2;
                if( potions[m] >= num){
                    r=m;
                }
                else l=m+1;;
            }       

            result[i] = potions.length -l;
        }
        return result;
    }
}