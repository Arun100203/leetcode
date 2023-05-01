class Solution {
    public double average(int[] salary) {
        int max = Arrays.stream(salary).max().getAsInt();
        int min = Arrays.stream(salary).min().getAsInt();
        long sum = 0, count = 0;
        for(int i:salary)
        {
            if(i != min && i!=max)
            {
                sum+=i;
                count++;
            }
        }
        return (double) sum/count;
    }
}
