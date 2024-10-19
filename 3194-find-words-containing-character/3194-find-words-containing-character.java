class Solution 
{
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> lst = new ArrayList<>();
        int n = words.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(char ch:words[i].toCharArray())
            {
                if(ch==x)
                {
                    lst.add(i);
                    break;
                }
            }
        }
        return lst;
    }
}