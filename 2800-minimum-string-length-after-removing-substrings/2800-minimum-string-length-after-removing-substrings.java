class Solution 
{
    public int minLength(String s) 
    {
        Stack<Character> stk = new Stack<>();
        for(char ch: s.toCharArray())
        {
            if(!stk.isEmpty())
            {
                if((ch=='B' && stk.peek()=='A') || (ch=='D' && stk.peek()=='C'))
                {
                    {
                        stk.pop();
                    }
                }
                else
                {
                    stk.push(ch);
                }
            }
            else
                stk.push(ch);
        }
        return stk.size();
    }
}