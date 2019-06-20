import java.util.Arrays;

public class MaxHeap {
    private int capacity,len;
    int[] heapArray;
    public MaxHeap(int capacity){
        this.capacity=capacity;
        this.len=0;
        heapArray = new int[capacity];
    }
    private int getLeftChildIndex(int index){
        return 2*index +1;
    }
    private int getRightChildIndex(int index){
        return 2*index +2;
    }
    private int getParentIndex(int index){
        return (index-1)/2;
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
        return heapArray[getLeftChildIndex(index)];
    }
    private int getRightChild(int index){
        return heapArray[getRightChildIndex(index)];
    }
    private int getParent(int index){
        return heapArray[getParentIndex(index)];
    }
    public void ensureCapacity(){
        if(len == capacity){
            heapArray= Arrays.copyOf(heapArray,capacity*2);
            capacity=capacity*2;
        }
    }
    public void swap(int index1, int index2){
        int temp = heapArray[index1];
        heapArray[index1] = heapArray[index2];
        heapArray[index2] = heapArray[index1];
    }
    public void display(){
        System.out.println("The max heap :");
        for(int i=0;i<len;i++){
            System.out.println(heapArray[i]);
        }
    }
    public void add(int index){
        ensureCapacity();
        heapArray[len]=index;
        len++;
        heapifyUp();
    }
    public void heapifyUp(){
        int index = len-1;
        while (hasParent(index) && getParent(index)<heapArray[index]){
                swap(getParentIndex(index),index);
                index=getParentIndex(index);
        }
    }
    public void delete(){
        if(len == 0) throw new IllegalStateException();

        heapArray[0]=heapArray[len-1];
        len --;
        heapifyDown();
    }
    public void heapifyDown(){
        int index =0;
        while(hasLeftChild(index)){
            int largerChildIndex=getLeftChildIndex(index);
            if(hasRightChild(index) && getRightChild(index)>getLeftChild(largerChildIndex)){
                largerChildIndex=getRightChildIndex(index);
            }
            if(heapArray[index]<heapArray[largerChildIndex]){
                swap(index,largerChildIndex);
            }
            else if(heapArray[index]>heapArray[largerChildIndex]){
                break;
            }
        }
    }
    public static void main(String args[]){
        MaxHeap ob = new MaxHeap(10);
        ob.add(5);
        ob.add(4);
        ob.display();
        ob.add(3);
        ob.display();
        ob.add(2);
        ob.display();
        ob.add(17);
        ob.display();
        ob.add(119);
        ob.display();
        //ob.delete();
        //ob.delete();
        //ob.display();
    }
}
