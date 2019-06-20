public class LongestIncreasingSubsequence {
    public static int LIS(int[] nums){
        int len = nums.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = 1;
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]&&arr[i]<arr[j]+1){
                    arr[i]=arr[j]+1;
                }
            }
        }
        int max = 0;
        for(int i=0;i<len;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println("Length of lis is " + LIS( arr ) + "\n" );
    }
}
