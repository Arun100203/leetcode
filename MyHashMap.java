class MyHashMap {
    HashMap<Integer,Integer> hmap;
    public MyHashMap() {
        hmap = new HashMap<>();
    }
    
    public void put(int key, int value)
    {
        hmap.put(key,value);
    }
    
    public int get(int key) 
    {
        if(hmap.containsKey(key))
        {
            return hmap.get(key);
        }
        return -1;
    }
    
    public void remove(int key) 
    {
        hmap.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
