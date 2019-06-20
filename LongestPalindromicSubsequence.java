public class LongestPalindromicSubsequence {
    public int LPS(String s) {
        if(s.length()==0||s.length()>1000) return 0;
        int n = s.length();
        int[][] lps = new int[n][n];
        for(int i=0;i<n;i++){
            lps[i][i]=1;
        }
        int i, j, l;
        for(l=2;l<=n;l++){
            for(i=0;i<n-l+1;i++){
                j = i+l-1;
                if(s.charAt(i)==s.charAt(j) && l==2)
                    lps[i][j]=2;
                else if(s.charAt(i)==s.charAt(j))
                    lps[i][j]=2+lps[i+1][j-1];
                else
                    lps[i][j]=Math.max(lps[i][j-1],lps[i+1][j]);
            }
        }
        return lps[0][n-1];
    }
    public int LPSubstring(String s) {
        int n = s.length();
        if(n<=0||n>1000)
            return 0;
        int[][] L = new int[n][n];
        for(int i=0;i<n;i++){
            L[i][i]=1;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                L[i][i+1]=1;
        }
        int l,i,j,x=0,y=0,max=1;
        for(l=3;l<=n;l++) {
            for (i = 0; i < n - l + 1; i++) {
                j = i + l - 1;
                if (s.charAt(i) == s.charAt(j) && l == 3) {
                    L[i][j] = 2;

                } else if (s.charAt(i) == s.charAt(j)) {
                    L[i][j] = 2 + L[i + 1][j - 1];
                }
                if (max < L[i][j]) {
                    max = L[i][j];
                }
            }
        }
        return max;
    }


    /*class Calculator{
        public int add(int a, int b){
            return a+b;
        }
        public int multiply(int a, int b){
            return a*b;
        }
        public int subtract(int a, int b){
            return a-b;
        }
        public int division(int a, int b){
            return a/b;
        }
        public static void main(String[] args){
            Calculator ob = new Calculator();
            System.out.println("Addition :"+ob.add(3,2));
            System.out.println("Product :"+ob.multiply(3,2));
            System.out.println("Difference :"+ob.subtract(3,2));
            System.out.println("division :"+ob.division(3,2));
        }
    }*/
























    public static void main(String[] args)
    {
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        String s1 = "abcdea";
        System.out.println("Length of LPS is" + " " +
                lps.LPS(s1) );
        System.out.println("Length of LPSubstring is" + " " +
                lps.LPSubstring(s1) );
    }
}

