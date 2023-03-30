import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<arr2.length;i++)
        hmap.put(arr2[i], i);
        Integer[] sorted = new Integer[arr1.length];
        int in = 0;
        for(int i:arr1)
        sorted[in++] = i;
        Arrays.sort(sorted, new Comparator<Integer>()
        {
            public int compare(Integer a, Integer b)
            {
                Integer pos1 = hmap.getOrDefault(a, a+arr2.length);
                Integer pos2 = hmap.getOrDefault(b, b+arr2.length);
               
                return (pos1.compareTo(pos2));
               
            }
        });
        int res[] = new int[arr1.length];
        int ind = 0;
        for(Integer i:sorted)
        res[ind++] = i;
        return res;
    }
}
