class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        List<Long> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            n1:
           if(nums[i] == 0)
           {
               //System.out.println(i);
               for(int k=i;k<nums.length;k++)
                {
                    if(nums[k] == 0)
                    {
                        count++;
                        i++;
                    }
                    else
                    {
                        li.add(count);
                        count = 0;
                        break n1;
                    }
                }
                li.add(count);
           }
        }
        //System.out.println(li);
        long sum = 0;
        for(long i:li)
        {
            sum += (i*(i+1)/2);
        }
        
        return sum;
    }
}
