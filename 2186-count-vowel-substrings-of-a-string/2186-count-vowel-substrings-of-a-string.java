class Solution 
{
    public int countVowelSubstrings(String word) 
    {
        int n = word.length();
        int count = 0;
        String vowels = "aeiou";
        Set<Character> vowelSet = new HashSet<>();
        for (int i = 0; i < n; i++) 
        {
            if (!vowels.contains(String.valueOf(word.charAt(i)))) 
            {
                continue; 
            }
            vowelSet.clear();
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);
                if (!vowels.contains(String.valueOf(ch))) 
                {
                    break; 
                }
                vowelSet.add(ch);
                if (vowelSet.size() == 5) 
                {
                    count++; 
                }
            }
        }
        return count;
    }
}
