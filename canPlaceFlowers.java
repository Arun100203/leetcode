class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int left = 0;
        int current = flowerbed[0];
        for(int i=1;i<flowerbed.length;i++)
        {
            if(current == 0 && left == current && current == flowerbed[i])
            {
                n--;
                left = 1;
            }
            else
            {
                left = current;
            }
            current = flowerbed[i];
        }
        if(left == 0 && current == 0)
        n--;
        return n<=0;
    }
}
