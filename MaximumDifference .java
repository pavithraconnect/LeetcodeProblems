import java.util.*;
class MaximumDifference {
  public static int difference(int[] arr){
    if(arr == null || arr.length == 0){
      return 0;
    }
    Arrays.sort(arr);
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i<arr.length-1;i++){
      int x = arr[i+1]-arr[i];
      list.add(x);            
    }
    return Collections.max(list);
  }
  public static void main(String[] args) {
    int[] arr = null;
    System.out.println("Maximum difference in unsorted array");
    System.out.println(difference(arr));
  }
}