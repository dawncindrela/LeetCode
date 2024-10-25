class SmallestInfiniteSet {
    int arr[];
    int i;
    public SmallestInfiniteSet() {
        arr=new int[1001];
        i=1;
    }
    
    public int popSmallest() {
        while(arr[i]==1)
        {
            i++;
        }
        arr[i]=1;
        return i;
    }
    
    public void addBack(int num) {
        if(num<i)
        i=num;
            
        arr[num]=0;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */