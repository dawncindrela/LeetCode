class Solution 
{
    public int findRadius(int[] houses, int[] heaters) 
    {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        for (int house : houses) 
        {
            int pos = Arrays.binarySearch(heaters, house);
            if (pos < 0) 
            {
                pos = -(pos + 1); 
            }
            int leftDistance = pos > 0 ? house - heaters[pos - 1] : Integer.MAX_VALUE;
            int rightDistance = pos < heaters.length ? heaters[pos] - house : Integer.MAX_VALUE;
            int closestDistance = Math.min(leftDistance, rightDistance);
            radius = Math.max(radius, closestDistance);
        }
        return radius;
    }
}
