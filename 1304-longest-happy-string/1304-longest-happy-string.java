class Solution 
{
    public String longestDiverseString(int a, int b, int c) 
    {
        StringBuilder sb = new StringBuilder();
        int total = a+b+c;
        int noA = 0;
        int noB = 0;
        int noC = 0;
        for(int i=0;i<total;i++)
        {
            if((noA<2 && a>=b && a>=c) || (noB==2 && a>0) || (noC==2 && a>0))
            {
                sb.append("a");
                a-=1;
                noA+=1;
                noB=0;
                noC=0;
            }
            else if((noB<2 && a<=b && b>=c) || (noA==2 && b>0) || (noC==2 && b>0))
            {
                sb.append("b");
                b-=1;
                noB+=1;
                noA=0;
                noC=0;
            }
            else if((noC<2 && a<=c && b<=c) || (noB==2 && c>0) || (noA==2 && c>0))
            {
                sb.append("c");
                c-=1;
                noC+=1;
                noB=0;
                noA=0;
            }
        }
        return sb.toString();
    }
}