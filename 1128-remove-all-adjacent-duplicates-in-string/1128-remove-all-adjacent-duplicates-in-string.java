class Solution 
{
    public String removeDuplicates(String s) 
    {
        int n = s.length();
        String ans="";
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(!stk.isEmpty() && stk.peek()==ch)
            {
                stk.pop();
            }
            else
            {
                stk.push(ch);
            }
        }
        while(!stk.isEmpty())
        {
            ans=stk.pop()+ans;
        }
        return ans;
    }
}