import java.util.Arrays;

public class MinHeap {
    private int capacity;
    private int len;
    private int[] heapItems;
    public MinHeap(int capacity){
        this.capacity = capacity;
        this.len=0;
        heapItems  = new int[capacity];
    }
    private int getLeftChildIndex(int index){
        return 2*index + 1;
    }
    private int getRightChildIndex(int index){
        return 2*index + 2;
    }
    private int getParentIndex(int index){
        return (index - 1) / 2;
    }
    private boolean hasLeftChild(int index){
        return getLeftChildIndex(index)<len;
    }
    private boolean hasRightChild(int index){
        return getRightChildIndex(index)<len;
    }
    private boolean hasParent(int index){
        return getParentIndex(index)>=0;
    }
    private int getLeftChild(int index){
        return heapItems[getLeftChildIndex(index)];
    }
    private int getRightChild(int index){
        return heapItems[getRightChildIndex(index)];
    }
    private int getParent(int index){
        return heapItems[getParentIndex(index)];
    }
    private void ensureCapacity(){
        if(len == capacity){
            heapItems = Arrays.copyOf(heapItems,capacity*2);
            System.out.println("Heap size doubled die to insufficient capacity");
            capacity = capacity * 2;
        }
    }
    private void swap(int index1, int index2){
        int temp = heapItems[index1];
        heapItems[index1] = heapItems[index2];
        heapItems[index2] = temp;
    }
    public int peek(){
        if(len == 0) throw new IllegalStateException();

        return heapItems[0];
    }
    public int delete(){
        if(len == 0) throw new IllegalStateException();
        int data=heapItems[0];
        heapItems[0]=heapItems[len-1];
        len --;
        heapifyDown();
        return data;
    }
    public void add(int data){
        ensureCapacity();
        heapItems[len] = data;
        len++;
        heapifyUp();
    }
    public void heapifyUp(){
        int index = len-1;
        while(hasParent(index) && getParent(index)>heapItems[index]){
            swap(getParentIndex(index),index);
            index = getParentIndex(index);
        }
    }
    public void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index)){
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && getRightChild(index)<getLeftChild(index)){
                smallerChildIndex = getRightChildIndex(index);
            }
            if(heapItems[index]>heapItems[smallerChildIndex]){
                swap(index,smallerChildIndex);
            }
            else if(heapItems[index]<heapItems[smallerChildIndex]){
                break;
            }
            index = smallerChildIndex;
        }
    }
    public void display(){
        System.out.println("The heap :");
        for (int i=0;i<len;i++){
            System.out.println(heapItems[i]);
        }
    }
    public static void main(String args[]){
        MinHeap ob = new MinHeap(10);
        ob.add(12);
        //System.out.println(ob.peek());
        ob.add(13);
        ob.display();
        ob.add(15);
        ob.display();
        ob.add(11);
        ob.display();
        ob.add(111);
        ob.display();
        ob.add(10);
        ob.add(9);
        ob.add(1);
        ob.display();
        //System.out.println("Deleted item is "+ob.delete());
        ob.display();
    }
}
