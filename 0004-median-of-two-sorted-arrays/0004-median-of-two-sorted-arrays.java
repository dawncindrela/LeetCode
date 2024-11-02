class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] joinedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, joinedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, joinedArray, nums1.length, nums2.length);
        int m = joinedArray.length;
        Arrays.sort(joinedArray);
        double med1=0.0;
        if(m%2==1)
        {
            med1 = joinedArray[m/2];
        }
        else
        {
            med1 = (joinedArray[m/2]+joinedArray[m/2 - 1])/2.0;
        }
        return med1;
    }
}