class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int amount=0;
        
        int maxLeft=0 , maxRight=height[height.length-1];
        for(int i=0;i<height.length;i++){
            
            maxLeft = height[i] > maxLeft ? height[i] :maxLeft;
          left[i]=maxLeft;
        }

        for(int i=height.length-1;i>=0;i--){
            for(int j=i;j<height.length;j++){
                if(height[j]>maxRight)
                maxRight=height[j];

                
            }
            right[i]=maxRight;
        }
        for(int i=0;i<height.length;i++){
            amount += Math.min(right[i], left[i]) - height[i];
        }

        return amount;
    }
}