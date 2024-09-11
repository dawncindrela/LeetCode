class Solution 
{
    public String categorizeBox(int length, int width, int height, int mass) 
    {
        long vol=(long)length*width*height;
        boolean bulky=(length>=10000 || width>=10000 || height>=10000) || vol>=1000000000;
        boolean heavy=(mass>=100);
        if(bulky && heavy)
        {
            return "Both";
        }
        else if(heavy)
        {
            return "Heavy";
        }
        else if(bulky)
        {
            return "Bulky";
        }
        else
        {
            return "Neither";
        }
    }
}