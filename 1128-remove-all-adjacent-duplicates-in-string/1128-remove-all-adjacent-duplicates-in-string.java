class Solution 
{
    public String removeDuplicates(String s) 
    {
        int n = s.length();
        String ans="";
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(!stk.isEmpty() && stk.peek()==s.charAt(i))
            {
                stk.pop();
            }
            else
            {
                stk.push(s.charAt(i));
            }
        }
        while(!stk.isEmpty())
        {
            ans=stk.pop()+ans;
        }
        return ans;
    }
}