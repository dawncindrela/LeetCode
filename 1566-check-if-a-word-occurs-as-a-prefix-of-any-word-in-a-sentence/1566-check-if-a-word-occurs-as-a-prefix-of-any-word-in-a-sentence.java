class Solution 
{
    public int isPrefixOfWord(String sentence, String searchWord) 
    {
        String[] sent=sentence.split(" ");
        int n = sent.length;
        for(int i=0;i<n;i++)
        {
            if(sent[i].startsWith(searchWord))
            {
                return (i+1);
            }
        }
        return -1;
    }
}