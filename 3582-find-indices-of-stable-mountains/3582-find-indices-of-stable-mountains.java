class Solution 
{
    public List<Integer> stableMountains(int[] height, int threshold) 
    {
        List<Integer> lst = new ArrayList<>();
        int n = height.length;
        int prev=height[0];
        for(int i=1;i<n;i++)
        {
            if(prev>threshold)
            {
                lst.add(i);
            }
            prev=height[i];
        }
        return lst;
    }
}