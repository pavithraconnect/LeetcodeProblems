public class LinearSearch {
    public int linearSearch(int[] array, int x){
        int i=0;
        while(i<array.length){
            if(x==array[i]){
                return i;
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        LinearSearch obj=new LinearSearch();
        int[] array={7,8,5,4,6,2,3};
        int target=16;
        System.out.println(obj.linearSearch(array,target));
    }
}
