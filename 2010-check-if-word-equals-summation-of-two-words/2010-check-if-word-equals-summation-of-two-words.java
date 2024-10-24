class Solution 
{
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('b',1);
        map.put('c',2);
        map.put('d',3);
        map.put('e',4);
        map.put('f',5);
        map.put('g',6);
        map.put('h',7);
        map.put('i',8);
        map.put('j',9);
        int sum1=0,sum2=0,target=0;
        for(char ch:firstWord.toCharArray())
        {
            sum1= sum1*10 + map.get(ch);
        }
        for(char ch:secondWord.toCharArray())
        {
            sum2= sum2*10 + map.get(ch);
        }
        for(char ch:targetWord.toCharArray())
        {
            target= target*10 + map.get(ch);
        }
        return (sum1+sum2) == target;
    }
}