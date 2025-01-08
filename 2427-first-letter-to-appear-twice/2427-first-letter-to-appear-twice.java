class Solution 
{
    public char repeatedCharacter(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        char c='$';
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)>1)
            {
                c=ch;
                break;
            }
        }
        return c;
    }
}