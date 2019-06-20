public class InsertionSort {
    public static int[] insertionSort(int[] array){
        int n=array.length,i,j,key;
        for(i=1;i<n;i++){
            key=array[i];
            j=i-1;
            while(j>=0&&array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        return array;
    }
    public static void main(String args[]){
        int[] array={7,8,5,4,6,2,3};
        array=insertionSort(array);
        for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
        }
    }
}
