public class MergeSort {
    public static void merge(int[] arr, int p, int q, int r){
        int n1=q-p+1,n2=r-q;
        int[] leftArr=new int[n1];
        int[] rightArr=new int[n2];
        for(int i=0;i<n1;i++){
            leftArr[i]=arr[p+i];
        }
        for(int i=0;i<n2;i++){
            rightArr[i]=arr[q+1+i];
        }
        int i=0,j=0,k=p;
        while(i<n1&&j<n2){
            if(leftArr[i]<rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }
            else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=leftArr[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=rightArr[j];
            k++;
            j++;
        }
    }
    public static int[] mergeSort(int[] ar,int p, int r){
        if(p<r){
            int q=(p+r)/2;
            mergeSort(ar,p,q);
            mergeSort(ar,q+1,r);
            merge(ar,p,q,r);
        }
        return ar;
    }
    public static void main(String args[]){
        int[] array={7,8,5,4,6,2,3};
        array=mergeSort(array,0,array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}

