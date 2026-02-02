class Solution {
    PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> large = new PriorityQueue<>();
    Map<Integer, Integer> delayed = new HashMap<>();
    long sumSmall = 0;
    int cntSmall = 0;
    int need;
    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        need = k - 2;
        for (int i = 2; i <= dist + 1; i++) {
            add(nums[i]);
        }
        long ans = Long.MAX_VALUE;
        for (int i1 = 1; i1 < n; i1++) {
            if (need == 0) {
                ans = Math.min(ans, nums[0] + nums[i1]);
            } else if (cntSmall == need) {
                ans = Math.min(ans, nums[0] + nums[i1] + sumSmall);
            }
            if (i1 + 1 < n) remove(nums[i1 + 1]);
            if (i1 + dist + 1 < n) add(nums[i1 + dist + 1]);
        }
        return ans;
    }
    private void add(int x) {
        if (cntSmall < need) {
            small.offer(x);
            sumSmall += x;
            cntSmall++;
        } else if (need > 0 && !small.isEmpty() && x < small.peek()) {
            int moved = small.poll();
            sumSmall -= moved;
            large.offer(moved);
            small.offer(x);
            sumSmall += x;
        } else {
            large.offer(x);
        }
        balance();
    }
    private void remove(int x) {
        delayed.put(x, delayed.getOrDefault(x, 0) + 1);
        if (!small.isEmpty() && x <= small.peek()) {
            sumSmall -= x;
            cntSmall--;
        }
        prune(small);
        prune(large);
        balance();
    }
    private void balance() {
        while (cntSmall < need && !large.isEmpty()) {
            prune(large);
            int x = large.poll();
            small.offer(x);
            sumSmall += x;
            cntSmall++;
        }
        prune(small);
    }
    private void prune(PriorityQueue<Integer> pq) {
        while (!pq.isEmpty()) {
            int x = pq.peek();
            if (delayed.containsKey(x)) {
                delayed.put(x, delayed.get(x) - 1);
                if (delayed.get(x) == 0) delayed.remove(x);
                pq.poll();
            } else break;
        }
    }
}
