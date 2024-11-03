class Solution 
{
    public String frequencySort(String s) 
    {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) 
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) 
        {
            char current = maxHeap.poll();
            int freq = map.get(current);
            for (int i = 0; i < freq; i++) 
            {
                result.append(current);
            }
        }
        return result.toString();
    }
}
