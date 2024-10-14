class Solution 
{
    public long maxKelements(int[] nums, int k) 
    {
        long score = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) 
        {
            maxHeap.add(num);
        }
        for (int i = 0; i < k; i++) 
        {
            int maxElement = maxHeap.poll();
            score += maxElement;
            maxHeap.add((int) Math.ceil(maxElement / 3.0));
        }
        return score;
    }
}
