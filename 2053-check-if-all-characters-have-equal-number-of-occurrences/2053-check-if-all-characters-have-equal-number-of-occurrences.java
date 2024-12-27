class Solution 
{
    public boolean areOccurrencesEqual(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        if(set.size() == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}