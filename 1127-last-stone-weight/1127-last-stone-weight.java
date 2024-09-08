class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        Arrays.sort(stones);
        List<Integer> lst = new ArrayList<>();
        for (int stone : stones) {
            lst.add(stone);
        }
        while (lst.size() > 1) {
            int last = lst.size() - 1;
            int y = lst.get(last);
            int x = lst.get(last - 1);
            lst.remove(last); 
            lst.remove(last - 1); 
            if (x != y) {
                lst.add(y - x);
                lst.sort(null);
            }
        }
        return lst.isEmpty() ? 0 : lst.get(0);
    }
}
