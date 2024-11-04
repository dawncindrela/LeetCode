class Solution {
    public int compress(char[] chars) {
        int c=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chars.length;i++)
        {
            if(i+1<chars.length && chars[i]==chars[i+1] )
            {
                c++;
            }
            else
            { sb.append(chars[i]);
                if(c>1)
                {
                    sb.append(c);
                }
                  c=1;
            }
        }
       char[] compressedChars = sb.toString().toCharArray();
        System.arraycopy(compressedChars, 0, chars, 0, compressedChars.length);
        return sb.length(); 
    }
}