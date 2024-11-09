class Solution 
{
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) 
        {
            return result;
        }
        Map<Character, Integer> pCount = new HashMap<>();
        for (char c : p.toCharArray()) 
        {
            pCount.put(c, pCount.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> windowCount = new HashMap<>();
        int windowSize = p.length();
        for (int i = 0; i < s.length(); i++) 
        {
            char currentChar = s.charAt(i);
            windowCount.put(currentChar, windowCount.getOrDefault(currentChar, 0) + 1);
            if (i >= windowSize) 
            {
                char charToRemove = s.charAt(i - windowSize);
                if (windowCount.get(charToRemove) == 1) 
                {
                    windowCount.remove(charToRemove);
                } 
                else 
                {
                    windowCount.put(charToRemove, windowCount.get(charToRemove) - 1);
                }
            }
            if (windowCount.equals(pCount)) 
            {
                result.add(i - windowSize + 1);
            }
        }
        return result;
    }
}
