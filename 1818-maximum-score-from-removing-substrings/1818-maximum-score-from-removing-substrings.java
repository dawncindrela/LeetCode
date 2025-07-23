class Solution 
{
    public int maximumGain(String s, int x, int y) 
    {
        int len=s.length();
        int point=0;
        StringBuilder sb = new StringBuilder(s);
        if (x >= y) {
            point += removeSubstrings(sb, "ab", x);
            point += removeSubstrings(sb, "ba", y);
        } else {
            point += removeSubstrings(sb, "ba", y);
            point += removeSubstrings(sb, "ab", x);
        }
        return point;
    }
    public int removeSubstrings(StringBuilder sb, String code, int point)
    {
        int total=0;
        int i=0;
        while (i < sb.length() - 1) 
        {
            if (sb.substring(i, i + 2).equals(code)) 
            {
                sb.delete(i, i + 2);
                total += point;
                if (i > 0) 
                {
                    i--; 
                }
            } 
            else 
            {
                i++;
            }
        }
        return total;
    }
}

        