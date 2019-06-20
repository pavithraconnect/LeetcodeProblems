//Pair SUM
import java.util.*;
class PairSum{
  public static boolean pairSum(int[] arr, int x){
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i< arr.length; i++){
      int value = x - arr[i];
      if(set.contains(value)){
        return true;
      }
      set.add(arr[i]);
    }
    return false;
  }
  public static List<List<Integer>> twoSumPairs(int[] arr, int n){
    HashSet<Integer> set = new HashSet<>();
    List<List<Integer>> list = new ArrayList<>();
    for(int i =0; i< arr.length;i++){
      int value = n - arr[i];
      if(set.contains(value)){
        list.add(Arrays.asList(value,arr[i]));
      }
      set.add(arr[i]);
    }
    return list;
  } 
  public static void main(String[] args) {
    int A[] = {2,1,7,11,8,-2}; 
    int n = 9;
    System.out.println(pairSum(A, n));
    System.out.println(twoSumPairs(A, n)); 
  }
}