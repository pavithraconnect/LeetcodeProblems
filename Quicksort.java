public class Quicksort {
    public static int partition(int[] array,int p, int r){
        int i=p-1,pivot=array[r];
        for(int j=p;j<r;j++){
            if(array[j]<=pivot){
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        int temp=array[i+1];
        array[i+1]=array[r];
        array[r]=temp;
        return i+1;
    }
    public static int[] quickSort(int[] array,int p, int r) {
        int low = p, high = r;
        if (low < high) {
            int mid = partition(array, low, high);
            quickSort(array, p, mid - 1);
            quickSort(array, mid + 1, r);
        }
        return array;
    }
    public static void main(String args[]){
        int[] array={7,8,5,4,6,2,3};
        array=quickSort(array,0,array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
