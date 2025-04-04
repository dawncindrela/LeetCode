class Solution 
{
    public int duplicateNumbersXOR(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int ansxor=0;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue()>1)
            {
                ansxor^=e.getKey();
            }
        }
        return ansxor;
    }
}