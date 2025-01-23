class Solution 
{
    public boolean areNumbersAscending(String s) 
    {
        int prev = -1; 
        String[] words = s.split(" "); 
        for (String word : words) 
        {
            if (Character.isDigit(word.charAt(0))) 
            {
                int num = Integer.parseInt(word); 
                if (num <= prev) 
                {
                    return false;
                }
                prev = num; 
            }
        }
        return true;
    }
}
