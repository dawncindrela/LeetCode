class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];
        Map<Integer, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for (Map.Entry<Integer, List<Integer>> entry : indexMap.entrySet()) {
            List<Integer> indices = entry.getValue();
            int size = indices.size();
            long[] prefixSum = new long[size];
            prefixSum[0] = indices.get(0);
            for (int i = 1; i < size; i++) {
                prefixSum[i] = prefixSum[i - 1] + indices.get(i);
            }
            for (int i = 0; i < size; i++) {
                int index = indices.get(i);
                long leftSum = (i > 0 ? prefixSum[i - 1] : 0);
                long rightSum = prefixSum[size - 1] - prefixSum[i];
                long leftCount = i;
                long rightCount = size - i - 1;
                result[index] = (index * leftCount - leftSum) + (rightSum - index * rightCount);
            }
        }
        return result;
    }
}
