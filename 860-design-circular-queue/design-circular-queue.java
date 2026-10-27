class MyCircularQueue {
    private int[] arr;
    private int front;
    private int size;
    private int capacity;

    public MyCircularQueue(int k) {
        arr = new int[k];
        capacity = k;
        front = 0;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        int rear = (front + size) % capacity;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : arr[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        int rear = (front + size - 1) % capacity;
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}