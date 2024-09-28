class Solution 
{
    public List<String> splitWordsBySeparator(List<String> words, char separator) 
    {
        List<String> lst = new ArrayList<>();
        
        for(String str : words)
        {
            String[] s = str.split("\\"+separator);
            for(String part : s)
            {
                if(!part.isEmpty())
                {
                    lst.add(part);
                }
            }
        }
        return lst;
    }
}