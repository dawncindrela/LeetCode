class Solution 
{
    public boolean checkIfPangram(String sentence) 
    {
        int n = sentence.length();
        HashSet<Character> hs = new HashSet<>();
        for(char ch: sentence.toCharArray())
        {
            hs.add(ch);
        }
        return hs.size()==26;
    }
}