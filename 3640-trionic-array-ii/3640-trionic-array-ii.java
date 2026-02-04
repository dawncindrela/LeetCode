class Solution {
    public long maxSumTrionic(int[] nums) {
        int n = nums.length;

        long[] up = new long[n];
        long[] down = new long[n];
        long[] tri = new long[n];

        // Initialize with very small safe values
        for (int i = 0; i < n; i++) {
            up[i] = down[i] = tri[i] = Long.MIN_VALUE / 4;
        }

        for (int i = 1; i < n; i++) {
            // strictly increasing
            if (nums[i] > nums[i - 1]) {
                up[i] = Math.max(
                        up[i - 1] + nums[i],
                        (long) nums[i - 1] + nums[i]
                );

                if (down[i - 1] > Long.MIN_VALUE / 8) {
                    tri[i] = down[i - 1] + nums[i];
                }
                if (tri[i - 1] > Long.MIN_VALUE / 8) {
                    tri[i] = Math.max(tri[i], tri[i - 1] + nums[i]);
                }
            }

            // strictly decreasing
            if (nums[i] < nums[i - 1]) {
                if (up[i - 1] > Long.MIN_VALUE / 8) {
                    down[i] = up[i - 1] + nums[i];
                }
                if (down[i - 1] > Long.MIN_VALUE / 8) {
                    down[i] = Math.max(down[i], down[i - 1] + nums[i]);
                }
            }
        }

        long ans = Long.MIN_VALUE;
        for (long v : tri) ans = Math.max(ans, v);
        return ans;
    }
}
