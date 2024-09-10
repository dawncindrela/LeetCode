class Solution 
{
    public String convertDateToBinary(String date) 
    {
        String yr=date.substring(0,4);
        String mon=date.substring(5,7);
        String day=date.substring(8);
        String by=Integer.toBinaryString(Integer.parseInt(yr));
        String bm=Integer.toBinaryString(Integer.parseInt(mon));
        String bd=Integer.toBinaryString(Integer.parseInt(day));
        String bindate=by+"-"+bm+"-"+bd;
        return bindate;
    }
}