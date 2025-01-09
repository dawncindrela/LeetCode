class Solution 
{
    public int mostFrequent(int[] nums, int key) 
    {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=n-2;i++)
        {
            if(nums[i]==key)
            {
                map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
            }
        }
        int max=-1;
        int target =0;
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue()>max)
            {
                max=e.getValue();
                target=e.getKey();
            }
        }
        return target;
    }
}