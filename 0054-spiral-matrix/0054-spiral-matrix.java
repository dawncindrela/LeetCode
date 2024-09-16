class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        int r=matrix.length;
        int c=matrix[0].length;
        int rowstart=0;
        int rowend=r-1;
        int colstart=0;
        int colend=c-1;
        List<Integer> lst = new ArrayList<>();
        while(rowstart<=rowend && colstart<=colend)
        {
            for(int i=colstart;i<=colend;i++)
            {
                lst.add(matrix[rowstart][i]);
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++)
            {
                lst.add(matrix[i][colend]);
            }
            colend--;
            if(rowstart<=rowend)
            {
                for(int i=colend;i>=colstart;i--)
                {
                    lst.add(matrix[rowend][i]);
                }
                rowend--;
            }
            if(colstart<=colend)
            {
                for(int i=rowend;i>=rowstart;i--)
                {
                    lst.add(matrix[i][colstart]);
                }
                colstart++;
            }
        }
        return lst;
    }
}