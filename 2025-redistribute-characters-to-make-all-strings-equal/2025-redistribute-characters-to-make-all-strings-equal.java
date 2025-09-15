class Solution 
{
    public boolean makeEqual(String[] words) 
    {
        int n = words.length;
        if(n==1)
        {
            return true;
        }
        int totalCharCount = 0;
		for (String s : words) {
			totalCharCount += s.length();
		}
		if (totalCharCount % n != 0) {
			return false;
		}

		int[] myMap = new int[26];
		for (String s : words) {
			for (char c : s.toCharArray()) {
				myMap[c - 'a']++;
			}
		}
		for (int i : myMap) {
			if (i % n != 0) {
				return false;
			}
		}
		return true; 
    }
}