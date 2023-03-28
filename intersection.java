class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> h = new HashMap<>();
        if(nums1.length != nums2.length)
        {
            int min = nums1.length < nums2.length ? nums1.length : nums2.length;
            int arr[] = nums1.length == min ? nums1 : nums2;
            int arr2[] = nums2.length != min ? nums2 : nums1;
            for(int i:arr)
            h.put(i, h.getOrDefault(i, 0)+1);
            Set<Integer> s = new HashSet<>();
            for(int i: arr2)
            {
                if(h.containsKey(i))
                s.add(i);
            }
            System.out.println(s);
            int res[] = new int[s.size()];
            int in = 0;
            for(int i:s)
            res[in++] = i;
            return res;
        }
        else
        {
            for(int i:nums1)
            h.put(i, h.getOrDefault(i, 0)+1);
            Set<Integer> s = new HashSet<>();
            for(int i: nums2)
            {
                if(h.containsKey(i))
                s.add(i);
            }
            System.out.println(s);
            int res[] = new int[s.size()];
            int in = 0;
            for(int i:s)
            res[in++] = i;
            return res;
        }
    }
}
