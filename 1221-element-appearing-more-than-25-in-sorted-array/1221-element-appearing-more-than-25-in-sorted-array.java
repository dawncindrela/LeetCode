class Solution 
{
    public int findSpecialInteger(int[] arr) 
    {
        int n=arr.length;
        double c = 0.25 * n;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue()>c)
            {
                return e.getKey();
            }
        }
        return -1;
    }
}