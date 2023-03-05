class Solution {
    public void sort2DList() {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        result.add(Arrays.asList(1, 3, 76, 99));
        result.add(Arrays.asList(1, 2, 84, 92));
        result.add(Arrays.asList(1, 1, 76, 99));

        java.util.Collections.sort(result, (item1, item2) -> {  // This was not a leetcode problem, An simple example for sorting 2d list

            for(int i = 0; i < result.get(0).size(); i++) {
                int i1 = item1.get(i);
                int i2 = item2.get(i);
                if(i1 < i2) {
                    return -1;
                } else if(i1 > i2) {
                    return 1;
                }
            }
            return 0;

        });
    }
}
