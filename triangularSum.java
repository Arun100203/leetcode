class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i:nums)
        li.add(i);
        return helper(li);
    }
    int helper(List<Integer> li)
    {
        if(li.size() == 1)
        return li.get(0);

        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<li.size()-1;i++)
            temp.add((li.get(i) + li.get(i+1))%10);
            
        //System.out.println(temp);
        return helper(temp);
    }
}
