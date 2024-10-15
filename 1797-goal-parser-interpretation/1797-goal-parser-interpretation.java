class Solution 
{
    public String interpret(String command) 
    {
        StringBuilder sb = new StringBuilder();
        int n=command.length();
        for(int i=0;i<n;i++)
        {
            if(command.charAt(i)=='G')
            {
                sb.append("G");
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                sb.append("o");
            }
            else if(i<=n-4 && command.substring(i,i+4).equals("(al)"))
            {
                sb.append("al");
            }
        }
        return sb.toString();
    }
}