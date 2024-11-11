class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap <Integer,Integer> hmap = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int complement = target - nums[i];
            if(hmap.containsKey(complement))
            {
                return new int[]{hmap.get(complement),i};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{};
    }
}