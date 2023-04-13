class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dis1 = 0;
        for(int i=start;i!=destination;)
        {
            dis1 += distance[i];i++;
            if(i==distance.length)
            i=0;
            
        }
        int dis2 = 0;
        for(int i=start;i!=destination;)
        {
            i--;
            if(i < 0)
            i = distance.length-1;;
            dis2 += distance[i];
            
        }
        System.out.println(dis2);
        return Math.min(dis1, dis2);
    }
}
