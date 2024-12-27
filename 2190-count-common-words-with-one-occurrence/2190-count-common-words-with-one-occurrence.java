class Solution 
{
    public int countWords(String[] words1, String[] words2) 
    {
        HashMap<String,Integer> m1 = new HashMap<>();
        HashMap<String,Integer> m2 = new HashMap<>();
        for(String w:words1)
        {
            m1.put(w,m1.getOrDefault(w,0)+1);
        }
        for(String w:words2)
        {
            m2.put(w,m2.getOrDefault(w,0)+1);
        }
        int c=0;
        for(String w:words1)
        {
            if(m1.get(w)==1 && m2.getOrDefault(w,0)==1)
            {
                c++;
            }
        }
        return c;
    }
}