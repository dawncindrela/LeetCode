class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        int s = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int j=0;j<nums.length;j++)
        {
            s += nums[j];
            if(map.containsKey(s -k))
            {
                ans += map.get(s-k);
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return ans;
    }
}