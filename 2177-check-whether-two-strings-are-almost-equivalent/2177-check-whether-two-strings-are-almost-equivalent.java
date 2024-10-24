class Solution 
{
    public boolean checkAlmostEquivalent(String word1, String word2) 
    {
        int n = word1.length();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
        }
        int m = word2.length();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<m;i++)
        {
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
        for(char i='a';i<='z';i++)
        {
            int diff=(int)Math.abs(map2.getOrDefault(i,0)-map1.getOrDefault(i,0));
            if(diff>3)
            {
                return false;
            }
        }
        return true;
    }
}