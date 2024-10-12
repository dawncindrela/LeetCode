class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int num : nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet())
        {
            if(e.getValue()>Math.floor(n/3))
            {
                lst.add(e.getKey());
            }
        }
        return lst;
    }
}