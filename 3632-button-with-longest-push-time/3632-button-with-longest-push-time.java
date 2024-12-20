class Solution 
{
    public int buttonWithLongestTime(int[][] events) 
    {
        int n = events.length;
        int longest = events[0][1];
        int result = events[0][0];
        for(int i=1;i<n;i++)
        {
            int button = events[i][0];
            int time = events[i][1] - events[i - 1][1];
            if((time > longest) || (time == longest && button < result))
            {
                longest = time;
                result = button;
            }
        }
        return result;
    }
}