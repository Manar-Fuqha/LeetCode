class LRUCache {
    Map<Integer , Integer> hash;
    List<Integer> list;
    int max =0;
    public LRUCache(int capacity) {
        hash = new HashMap<>();
        list=new LinkedList<>();
        max = capacity;
    }
    
     public int get(int key) {
        if (!hash.containsKey(key)) return -1;
        list.remove((Integer) key);
        list.add(0, key);
        return hash.get(key);
    }
    
    public void put(int key, int value) {
if (hash.containsKey(key)) {
            list.remove((Integer) key);
        } else if (list.size() >= max) {
            int removedKey = list.remove(list.size() - 1);
            hash.remove(removedKey);
        }
        hash.put(key, value);
        list.add(0, key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */