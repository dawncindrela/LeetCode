class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        int ls=s.length();
        int lt=t.length();
        if(ls!=lt)
        {
            return false;
        }
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        return Arrays.equals(sa,ta);
    }
}