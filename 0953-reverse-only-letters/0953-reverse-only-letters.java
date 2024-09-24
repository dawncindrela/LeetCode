class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        int n=s.length();
        StringBuilder sb = new StringBuilder();
        int j=0;
        int i=0;
        for(i=0;i<n;i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        StringBuilder ans = new StringBuilder();
        for(i=0;i<n;i++)
        {
            if(!Character.isAlphabetic(s.charAt(i)))
            {
                ans.append(s.charAt(i));
            }
            else
            {
                ans.append(sb.charAt(j));
                j++;
            }
        }
        return ans.toString();
    }
}