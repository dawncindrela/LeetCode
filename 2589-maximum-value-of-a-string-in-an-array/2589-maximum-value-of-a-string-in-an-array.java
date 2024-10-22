class Solution 
{
    public int maximumValue(String[] strs) 
    {
        int n = strs.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            int len = strs[i].length();
            int c=0;
            for(char ch : strs[i].toCharArray())
            {
                if(Character.isDigit(ch))
                {
                    c++;
                }
                else
                {
                    arr[i]=len;
                    break;
                }
            }
            if(c==len)
            {
                arr[i]=Integer.parseInt(strs[i]);
            }
        }
        Arrays.sort(arr);
        return arr[n-1];
    }
}