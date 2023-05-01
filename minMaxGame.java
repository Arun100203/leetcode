class Solution {
    public int minMaxGame(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i:nums)
        li.add(i);
        return helper(li);
    }
    int helper(List<Integer> li)
    {
        if(li.size() == 1)
        return li.get(0);

        boolean min = true;
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<li.size();i+=2)
        {
            if(min)
            {
                temp.add(Math.min(li.get(i), li.get(i+1)));
                min = false;
            }
            else
            {
                temp.add(Math.max(li.get(i), li.get(i+1)));
                min = true;
            }
        }

        System.out.println(temp);
        return helper(temp);
    }
}
