class Solution {
    public int[] asteroidCollision(int[] asteroids) {
          Stack<Integer> stack = new Stack<>();
        
        for (int num : asteroids) {
            if (num>0) {
                stack.push(num);
            } else {
                while (!stack.isEmpty()&& stack.peek()>0 && stack.peek() < -num) {
                        stack.pop();                 
                }
                if(stack.isEmpty() || stack.peek()<0 )
                stack.push(num);

                if(stack.peek()== -num)
                stack.pop();

            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }


}