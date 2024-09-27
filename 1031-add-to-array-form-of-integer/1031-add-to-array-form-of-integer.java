class Solution 
{
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        List<Integer> lst = new ArrayList<>();
        int n = num.length;
        int i=n-1;
        while(i>=0 || k>0)
        {
            if(i>=0)
            {
                k+=num[i];
            }
            lst.add(k%10);
            k/=10;
            i--;
        }
        Collections.reverse(lst);
        return lst;
    }
}