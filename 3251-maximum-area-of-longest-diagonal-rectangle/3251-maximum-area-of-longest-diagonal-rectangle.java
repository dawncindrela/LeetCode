class Solution 
{
    public int areaOfMaxDiagonal(int[][] dimensions) 
    {
        int n = dimensions.length;
        double max = 0.0;
        int area =0;
        for(int i=0;i<n;i++)
        {
            double dlen = Math.sqrt((dimensions[i][0]*dimensions[i][0]) + (dimensions[i][1]*dimensions[i][1]));
            int carea = dimensions[i][0]*dimensions[i][1];
            if(dlen>max)
            {
                max=dlen;
                area = carea;
            }
            else if (dlen == max)
            {
                area = Math.max(area,carea);
            }
        }
        return area;
    }
}