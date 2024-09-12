class Solution 
{
    public String getEncryptedString(String s, int k) 
    {
        StringBuilder sb = new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int j =(i+k) % n;
            sb.append(s.charAt(j));
        }
        return sb.toString();
    }
}