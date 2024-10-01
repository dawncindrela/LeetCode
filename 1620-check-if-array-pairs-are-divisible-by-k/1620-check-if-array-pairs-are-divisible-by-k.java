class Solution 
{
    public boolean canArrange(int[] arr, int k) 
    {
        int[] remainderFreq = new int[k];  
        int n = arr.length;
        for (int num : arr) 
        {
            int rem = ((num % k) + k) % k;  
            remainderFreq[rem]++;
        }
        if (remainderFreq[0] % 2 != 0) 
        {
            return false;
        }  
        for (int i = 1; i <= k / 2; i++) 
        {
            if (remainderFreq[i] != remainderFreq[k - i]) 
            {
                return false;
            }
        }
        return true;
    }
}
