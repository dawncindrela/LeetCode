class Solution 
{
    public String clearDigits(String s) 
    {
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
        String str="";
        while(!st.isEmpty())
        {
            str=st.pop()+str;
        }
        return str;
    }
}