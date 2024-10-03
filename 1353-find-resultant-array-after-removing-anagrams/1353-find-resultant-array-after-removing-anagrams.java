class Solution 
{
    public List<String> removeAnagrams(String[] words) 
    {
        List<String> result = new ArrayList<>();
        String prevSortedWord = ""; 
        for (String word : words) 
        {
            char[] currentWordArray = word.toCharArray();
            Arrays.sort(currentWordArray);
            String currentSortedWord = new String(currentWordArray);
            if (!currentSortedWord.equals(prevSortedWord)) 
            {
                result.add(word);
                prevSortedWord = currentSortedWord; 
            }
        }
        return result;
    }
}
