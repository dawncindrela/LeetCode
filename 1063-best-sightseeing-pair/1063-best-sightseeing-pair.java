class Solution 
{
    public int maxScoreSightseeingPair(int[] values) 
    {
        int len = values.length;
        int max=values[0];
        int score=0;
        for(int i=1;i<len;i++)
        {
            score=Math.max(score,max+values[i]-i);
            max=Math.max(max,values[i]+i);
        }
        return score;
    }
}