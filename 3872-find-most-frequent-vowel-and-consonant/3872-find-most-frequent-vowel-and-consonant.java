class Solution 
{
    public int maxFreqSum(String s) 
    {
        int sum = 0;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
            else
            {
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
        }
        int con = map1.isEmpty() ? 0 : Collections.max(map1.values());
        int vow = map2.isEmpty() ? 0 : Collections.max(map2.values());
        sum= con + vow ;
        return sum;
    }
}