class Solution 
{
    public boolean isValid(String word) 
    {
        int n = word.length();
        if(n<3)
        {
            return false;
        }
        int v = 0;
        int c = 0;
        for(char ch: word.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                if("aeiouAEIOU".indexOf(ch) != -1)
                {
                    v++;
                }
                else
                {
                    c++;
                }
            }
            else if (!Character.isDigit(ch))
            {
                return false;
            }
        }
        return v>=1 && c>=1;

    }
}