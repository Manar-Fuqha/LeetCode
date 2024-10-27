class Solution {
    public int maxWidthRamp(int[] nums) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<nums.length;i++){
            if(stack.isEmpty() || nums[stack.peek()] > nums[i]){
                    stack.push(i);
                }
            
        }
     
            for(int j=nums.length-1;j>=0;j--){
                while(!stack.isEmpty()&&nums[stack.peek()] <= nums[j]){
                    max = Math.max(max , j-stack.pop());
                }
                if(stack.isEmpty())break;
            }
                   return max;
        }











        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=nums.length-1;j>i;j--){
        //         if(nums[i]<=nums[j] ){
        //             max=Math.max(max , j-i);
        //            break;
        //         }
        //     }
        // }

        

    }
