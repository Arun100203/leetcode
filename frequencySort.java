class Solution {
    public int[] frequencySort(int[] arr) {
        int len = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(hm.containsKey(arr[i]))
                hm.put(arr[i], hm.get(arr[i])+1);
            else
                hm.put(arr[i], 1);
        }
        //System.out.println(hm);

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                if(o1.getValue().compareTo(o2.getValue()) == 0)
                return o2.getKey().compareTo(o1.getKey());
                
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        //System.out.println(list);
        int answer[] = new int[len];
        int in = 0;
        for(Map.Entry<Integer, Integer> i : list)
        {
            int n = i.getValue();
            while(n-- > 0)
            answer[in++] = i.getKey();
        }

        return answer;
        
        
    }
    
}
