public class LongestCommonSubsequence {

    public int max(int a, int b){
        return (a>b)? a : b;
    }
    public int LCS(char[] x, char[] y, int m, int n){
        int[][] result = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0)
                    result[i][j]=0;
                else if(x[i-1]==y[j-1])
                    result[i][j]=1+result[i-1][j-1];
                else
                    result[i][j]=max(result[i-1][j],result[i][j-1]);
            }
        }
        return result[m][n];
    }
    public int LCSubstring(char[] x, char[]y,int m, int n){
        int[][] L = new int[m+1][n+1];
        int max=0;
        for( int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0)
                    L[i][j]=0;
                else if(x[i-1]==y[j-1])
                    L[i][j]=1+L[i-1][j-1];
                if(max<L[i][j])
                    max=L[i][j];
            }
        }
        return max;
    }
    public int minDistance(char[] x, char[] y) {
        int val1 = x.length, val2 = y.length, val3 = LCS(x,y,val1,val2);
        int sum = (val1-val3)+(val2-val3);
        return sum;
    }
    public static void main(String[] args)
    {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "abcdaf";
        String s2 = "bcdeaf";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        System.out.println("Longest common sub string "+lcs.LCSubstring(X,Y,m,n));
        System.out.println("Length of LCS is" + " " +
                lcs.LCS( X, Y,m,n) );
        System.out.println("Delete Operation for Two Strings "+lcs.minDistance(X,Y));
    }
}
