class SmallestInfiniteSet {
    SortedSet<Integer> set;
    Integer current;
    
    public SmallestInfiniteSet() {
        set = new TreeSet<>();
        current = 1;
    }
    
    public int popSmallest() {
        int answer;
        if (!set.isEmpty()) {
            answer = set.first();
            set.remove(answer);
        } 
        else {
            answer = current;
            current += 1;
        }
        return answer;
    }
    
    public void addBack(int num) {
        if (current <= num || set.contains(num)) {
            return;
        }
        set.add(num);
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
