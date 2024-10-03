class Solution 
{
    public String clearDigits(String s) 
    {
        String str="";
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else if(Character.isLetter(ch))
            {
                st.push(ch);
            }
        }
        while(!st.isEmpty())
        {
            str=st.pop()+str;
        }
        return str;
    }
}