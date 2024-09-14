class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> unique = new HashSet<>(); 
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isDigit(ch)) {
                sb.append(ch); 
            } else {
                if (sb.length() > 0) {
                    unique.add(removeLeadingZeros(sb.toString()));
                    sb.setLength(0); 
                }
            }
        }
        if (sb.length() > 0) {
            unique.add(removeLeadingZeros(sb.toString()));
        }
        return unique.size();
    }
    private String removeLeadingZeros(String num) {
        int i = 0;
        while (i < num.length() && num.charAt(i) == '0') {
            i++; 
        }
        return i == num.length() ? "0" : num.substring(i);
    }
}
