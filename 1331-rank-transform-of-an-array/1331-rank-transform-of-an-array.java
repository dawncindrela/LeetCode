class Solution 
{
    public int[] arrayRankTransform(int[] arr) 
    {
        Map<Integer, Integer> v = new HashMap<>();  
        int[] sortNumbers = Arrays.stream(arr).distinct().sorted().toArray();  
        for (int i = 0; i < sortNumbers.length; i++) 
        {
            v.put(sortNumbers[i], i + 1);
        }
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = v.get(arr[i]);
        }
        return arr;  
    }
}