class Solution 
{
    public int maxRepeating(String sequence, String word) 
    {
        int c = 0;
        String repeat = word;
        while(sequence.contains(repeat))
        {
            repeat += word;
            c++;
        }
        return c;
    }
}