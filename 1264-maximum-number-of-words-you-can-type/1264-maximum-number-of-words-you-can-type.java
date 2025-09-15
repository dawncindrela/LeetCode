class Solution 
{
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        HashSet<Character> set = new HashSet<>();
        for(char e:brokenLetters.toCharArray())
        {
            set.add(e);
        }
        String[] arr=text.split("\\s+");
        int n=arr.length;
        int c=n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr[i].length();j++)
            {
                char ch=arr[i].charAt(j);
                if(set.contains(ch))
                {
                    c--;
                    break;
                }
            }
        }
        return c;
    }
}