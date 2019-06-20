public class BinarySearch {
        public static int binarySearch(int[] array,int p, int r, int target){
            if(p>r)
                return -1;
            else{
                int q=(p+r)/2;
                if(target==array[q]){
                    return q;
                }
                else if(target<array[q]){
                    return binarySearch(array,p,q-1,target);
                }
                else{
                    return binarySearch(array,q+1,r,target);
                }
            }
        }

        // Driver method to test above
        public static void main(String args[])
        {
            int arr[] = { 2, 3, 4, 10, 40 };
            int n = arr.length;
            int x = 10;
            int result=binarySearch(arr, 0, n - 1, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index " + result);
        }
    }

