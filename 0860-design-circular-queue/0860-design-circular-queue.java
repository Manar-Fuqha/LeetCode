class MyCircularQueue {

    List<Integer> list ;
    int max=0 , size=0;
    public MyCircularQueue(int k) {
        list=new LinkedList<>();
        max=k;
    } 
    
    public boolean enQueue(int value) {
        if(size>=max)return false;
        list.add(value);
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0)return false;
        list.removeFirst();
        size--;
        return true;
    }
    
    public int Front() {
        if(list.isEmpty())return -1;
        return list.getFirst();
    }
    
    public int Rear() {
        if(list.isEmpty())return -1;
        return list.getLast();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public boolean isFull() {
        return size==max;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */