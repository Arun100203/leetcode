class Solution {
    public int xorOperation(int n, int start) {
        int arr[] = new int[n];
        arr[0] = start;
        for(int i=1;i<n;i++)
        arr[i] = arr[i-1] + 2;
        int ans = 0;
        for(int i:arr)
        ans ^= i;

        return ans;
    }
}
