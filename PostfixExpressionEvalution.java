class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<S.length();i++)
        {
            char c = S.charAt(i);
            
            if(Character.isDigit(c))
            {
                stack.push(c - '0');
            }
        else{
              int num1 = stack.pop();
              int num2 = stack.pop();
            switch(c)
            {
                case '+': 
                    stack.push(num2+num1);
                    break;
                case '-':
                    stack.push(num2-num1);
                    break;
                case '*':
                    stack.push(num2*num1);
                    break;
                case '/':
                    stack.push(num2/num1);
                    break;
            }
            
        }
      }
      return stack.pop();
    }
}
