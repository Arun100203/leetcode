class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l1.add(index[i],nums[i]);
        }
        int arr[]=new int[l1.size()];
        for(int i=0;i<nums.length;i++){
            arr[i]=l1.get(i);
        }
        return arr;
    }
}
