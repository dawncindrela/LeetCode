class Solution 
{
    public int mostWordsFound(String[] sentences) 
    {
        int n = sentences.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            String[] arr=sentences[i].split(" ");
            ans[i]=arr.length;
        }
        Arrays.sort(ans);
        return ans[n-1];
    }
}