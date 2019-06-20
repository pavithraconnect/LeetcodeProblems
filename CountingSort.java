public class CountingSort {
    //for sorting integers
    //range 0-9
    public static int[] countSortInt(int[] array) {
        int len=array.length;
        int[] countArr = new int[10];
        int[] result = new int[len];
        for(int i=0;i<10;i++){
            countArr[i]=0;
        }
        for(int i=0;i<len;i++){
            countArr[array[i]]++;
        }
        for(int i=1;i<10;i++){
            countArr[i]=countArr[i]+countArr[i-1];
        }
        for(int i=len-1;i>=0;i--){
            result[countArr[array[i]]-1]=array[i];
            countArr[array[i]]--;
        }
        return result;
    }
    //to sort chars
    //range 0-255
    public static char[] countSortChar(char[] array){
        int len=array.length;
        int[] countArr=new int[256];
        char[] result=new char[len];
        for(int i=0;i<256;i++){
            countArr[i]=0;
        }
        for(int i=0;i<len;i++){
            countArr[array[i]]++;
        }
        for(int i=1;i<256;i++){
            countArr[i]=countArr[i]+countArr[i-1];
        }
        for(int i=len-1;i>=0;i--){
            result[countArr[array[i]]-1]=array[i];
            countArr[array[i]]--;
        }
        return array;
    }
    public static void main(String args[]){
        /*int[] array={7,6,5,6,5,7,5};
        array=countSortInt(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }*/
        char[] array2={'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's'};
        array2=countSortChar(array2);
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }
}
