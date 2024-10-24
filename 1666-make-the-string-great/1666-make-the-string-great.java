class Solution 
{
    public String makeGood(String s) 
    {
        int n = s.length();
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(!stk.isEmpty() && Math.abs(stk.peek()-s.charAt(i))==32)
            {
                stk.pop();
            }
            else
            {
                stk.push(s.charAt(i));
            }
        }
        String ans="";
        while(!stk.isEmpty())
        {
            ans=stk.pop()+ans;
        }
        return ans;
    }
}