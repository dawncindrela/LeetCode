class Solution 
{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int c = 0;
        int target = 0;
        switch(ruleKey)
        {
            case "type" :
                            target = 0;
                            break;
            case "color":
                            target = 1;
                            break;
            case "name" :
                            target = 2;
                            break;  
        }
        for(List<String> item : items)
        {
            c+= item.get(target).equals(ruleValue) ? 1 : 0;
        }
        return c;
    }
}