class Solution {
    public int countPrimes(int n) {
      boolean cp[] = new boolean[n];
      Arrays.fill(cp, true);
      for(int i=2;i<n;i++)
      {
          if(cp[i])
          {
              for(int j=i*2;j<n;j=j+i)
              cp[j] = false;
          }
      }
      int count =0;
      //System.out.println(Arrays.toString(cp));
      for(int i=2;i<cp.length;i++)
      if(cp[i]) count++;
      return count;
    }
}
