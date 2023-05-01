class RandomizedCollection {

   private List<Integer> list;

    public RandomizedCollection() {
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (list.contains(val)){
            list.add(val);
            return false;
        }
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (list.contains(val)){
            list.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }

    public int getRandom() {
        int index = (int) (Math.random() * list.size());
        return list.get(index);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
