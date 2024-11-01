class Solution 
{
    public String makeFancyString(String s) 
    {
        int n = s.length();
        if(n<3)
        {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i-1)==s.charAt(i))
            {
                continue;
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        sb.append(s.charAt(n-1));
        return sb.toString();
    }
}