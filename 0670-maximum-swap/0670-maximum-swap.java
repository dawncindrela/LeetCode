class Solution 
{
    public int maximumSwap(int num) 
    {
        StringBuilder str = new StringBuilder(String.valueOf(num));
        int n = str.length();
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[str.charAt(i) - '0'] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int d = 9; d > str.charAt(i) - '0'; d--) {
                if (last[d] > i) {
                    char temp = str.charAt(i);
                    str.setCharAt(i, str.charAt(last[d]));
                    str.setCharAt(last[d], temp);
                    return Integer.parseInt(str.toString());
                }
            }
        }
        return num;
    }
}
