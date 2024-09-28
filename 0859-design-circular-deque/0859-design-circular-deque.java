class MyCircularDeque {
    private int[] cq;
    private int front,back,size,capacity;
    public MyCircularDeque(int k) {
        cq = new int[k];
        Arrays.fill(cq,-1);
        front=0;
        back=0;
        size=0;
        capacity=k;
    }
    
    public boolean insertFront(int value) {
        if(isFull())
        {
            return false;
        }
        if(front==0)
        {
            front=capacity - 1;
        }
        else
        {
            front--;
        }
        cq[front]=value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull())
        {
            return false;
        }
        cq[back]=value;
        if(back == capacity-1)
        {
            back=0;
        }
        else
        {
            back++;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty())
        {
            return false;
        }
        cq[front]=-1;
        if(front==capacity-1)
        {
            front=0;
        }
        else
        {
            front++;
        }
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty())
        {
            return false;
        }
        if(back==0)
        {
            back=capacity-1;
        }
        else
        {
            back--;
        }
        cq[back]=-1;
        size--;
        return true;
    }
    
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return cq[front];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        if (back == 0) {
            return cq[capacity - 1]; 
        } else {
            return cq[back - 1]; 
        }
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */