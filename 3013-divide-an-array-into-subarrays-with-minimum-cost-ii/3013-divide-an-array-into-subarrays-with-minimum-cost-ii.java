import java.util.*;

class Solution {
    TreeMap<Integer, Integer> small = new TreeMap<>();
    TreeMap<Integer, Integer> large = new TreeMap<>();

    long sumSmall = 0;
    int cntSmall = 0;
    int cntLarge = 0;
    int need;

    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        need = k - 2;

        // initialize window for i1 = 1 → indices [2 .. dist+1]
        for (int i = 2; i <= dist + 1; i++) {
            add(nums[i]);
        }

        long ans = Long.MAX_VALUE;

        for (int i1 = 1; i1 <= n - 1; i1++) {

            if (need == 0) {
                ans = Math.min(ans, nums[0] + nums[i1]);
            } else if (cntSmall == need) {
                ans = Math.min(ans, nums[0] + nums[i1] + sumSmall);
            }

            // slide window
            if (i1 + 1 <= n - 1) {
                remove(nums[i1 + 1]);
            }
            if (i1 + dist + 1 <= n - 1) {
                add(nums[i1 + dist + 1]);
            }
        }

        return ans;
    }

    private void add(int x) {
        if (cntSmall < need) {
            insertSmall(x);
        } else if (need > 0 && x < small.lastKey()) {
            int move = small.lastKey();
            removeSmall(move);
            insertLarge(move);
            insertSmall(x);
        } else {
            insertLarge(x);
        }
    }

    private void remove(int x) {
        if (small.containsKey(x)) {
            removeSmall(x);
            if (cntLarge > 0) {
                int move = large.firstKey();
                removeLarge(move);
                insertSmall(move);
            }
        } else {
            removeLarge(x);
        }
    }

    // ---------- helpers ----------

    private void insertSmall(int x) {
        small.put(x, small.getOrDefault(x, 0) + 1);
        sumSmall += x;
        cntSmall++;
    }

    private void removeSmall(int x) {
        int c = small.get(x);
        if (c == 1) small.remove(x);
        else small.put(x, c - 1);
        sumSmall -= x;
        cntSmall--;
    }

    private void insertLarge(int x) {
        large.put(x, large.getOrDefault(x, 0) + 1);
        cntLarge++;
    }

    private void removeLarge(int x) {
        int c = large.get(x);
        if (c == 1) large.remove(x);
        else large.put(x, c - 1);
        cntLarge--;
    }
}
