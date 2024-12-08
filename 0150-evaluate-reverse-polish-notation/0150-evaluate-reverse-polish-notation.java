class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            try {
                int number = Integer.parseInt(s);
                stack.push(number);
            } catch (NumberFormatException e) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (s) {
                    case "+":
                        stack.push(num2 + num1);
                        break;
                    case "-":
                        stack.push(num2 - num1);
                        break;
                    case "*":
                        stack.push(num2 * num1);
                        break;
                    case "/":
                        stack.push(num2 / num1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
