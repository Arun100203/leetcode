class Solution {
    public String customSortString(String order, String s) {
        String res = "";
        char arr[] = s.toCharArray();
        Character car[] = new Character[arr.length];
        int i=0;
        for(char c: arr)
        car[i++] = c;
        Arrays.sort(car, new Comparator<Character>()
        {
            public int compare(Character o1, Character o2)
            {
                return ((order.indexOf(o1)) - (order.indexOf(o2)));
            }
        });
        for(Character c: car)
        res += c;
        return res;

    }
}
