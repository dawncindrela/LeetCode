class Solution 
{
    public int findLucky(int[] arr) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=-1;
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            if(e.getValue() == e.getKey())
            {
                max=Math.max(max,e.getKey());
            }
        }
        return max;
    }
}