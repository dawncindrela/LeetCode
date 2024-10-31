class Solution 
{
    public int minCostToMoveChips(int[] position) 
    {
        int evenc=0;
        int oddc=0;
        for(int pos : position)
        {
            if(pos%2==0)
            {
                evenc++;
            }
            else
            {
                oddc++;
            }
        }
        return Math.min(evenc,oddc);
    }
}