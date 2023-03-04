class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        int arr[] = new int[n];
        for(int i=0;i<nums1.length;i++)
            arr[i]=nums1[i];
        
            for(int j=nums1.length,l=0 ; j<n&&l<nums2.length ; j++,l++)
                    arr[j]=nums2[l];
        
        Arrays.sort(arr);
        double res =0;
        if(n%2==0)
        {
            res = arr[n/2]+arr[(n/2)-1];
            return res/2;
        }
        return arr[n/2];
    }
}
