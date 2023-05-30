class MyHashSet {
    HashSet<Integer> arr=new HashSet<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        this.arr.add(key);
    }
    
    public void remove(int key) {
        if(this.arr.contains(key)){
            this.arr.remove(key);
        }
    }
    
    public boolean contains(int key) {
        return this.arr.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */