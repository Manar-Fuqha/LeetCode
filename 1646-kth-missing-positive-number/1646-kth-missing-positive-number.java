class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] missingArr = new int[k];
    int j = 0, missingCount  = 0, currentNum  = 1;
         while(missingCount  < k){
        if(j < arr.length && currentNum  < arr[j]){
            missingArr[missingCount ] = currentNum ;
            missingCount++;
        } else if(j < arr.length && currentNum  == arr[j]){
            j++;
        } else if(j >= arr.length){
       
            missingArr[missingCount ] = currentNum ;
            missingCount ++;
        }
        currentNum ++;
    }
    return missingArr[k-1];
}
}