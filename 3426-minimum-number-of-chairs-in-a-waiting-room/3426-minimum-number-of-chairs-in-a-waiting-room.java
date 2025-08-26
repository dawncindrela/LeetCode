class Solution 
{
    public int minimumChairs(String s) 
    {
        while(s.contains("LE"))
        {
            s=s.replace("LE","");
        }
        s=s.replace("L","");
        
        return s.length();
    }
}