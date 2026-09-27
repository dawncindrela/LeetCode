class Solution 
{
    public static String reverseParentheses(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) 
        {
            if (ch == ')') 
            {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '(') 
                {
                    sb.append(stack.pop());
                }
                stack.pop();
                for (char rev : sb.toString().toCharArray()) 
                {
                    stack.push(rev);
                }
            } 
            else 
            {
                stack.push(ch);
            }
        }
        String result ="";
        while (!stack.isEmpty()) 
        {
            result=stack.pop()+result;;
        }
        return result;
    }
}
