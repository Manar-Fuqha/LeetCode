class Solution {
     public int[] sortArray(int[] nums) {
        mergeArray(nums , 0 , nums.length-1);
        return nums;
     }
     private void mergeArray(int[] nums , int l , int r){
        if(l<r){
           int m=l+(r-l)/2;
            mergeArray(nums , l ,m);
            mergeArray(nums , m+1 , r);
            merge(nums , l , m , r);
        }
     }

     private void merge(int[] nums , int l , int m , int r){
        int i , j , k;
        int arr1= m-l+1;
        int arr2= r-m;
        int [] leftarr = new int[arr1];
        int [] rightarr = new int [arr2];

        for( i=0;i<arr1;i++)
            leftarr[i]=nums[l+i];

        for(j =0 ;j<arr2;j++)
            rightarr[j]= nums[m+1+j];

        i=0;
        j=0;
        k=l;
        while(i<arr1 && j<arr2){
            if(leftarr[i]<rightarr[j]){
                nums[k] = leftarr[i];
                i++;
            }
            else{
                nums[k]=rightarr[j];
                j++;
            }
            k++;
        }

          while(i<arr1 ){
                nums[k] = leftarr[i];
                i++;
                k++;
            }
            while(j<arr2 ){
                nums[k] = rightarr[j];
                j++;
                k++;
            }
     }
}