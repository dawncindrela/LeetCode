class Solution 
{
    public int numberOfSpecialChars(String word) 
    {
        int n=word.length();
        HashSet<Character> set = new HashSet<>();
        for(Character ch:word.toCharArray())
        {
            if(Character.isLowerCase(ch))
            {
                set.add(ch);
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch) && set.contains(Character.toLowerCase(ch)))
            {
                c++;
                set.remove(Character.toLowerCase(ch));
            }
        }
        return c;
    }
}