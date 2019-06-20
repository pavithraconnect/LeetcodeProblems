public class Fibonacci {
    //Bottom up - Tabulation
    public int fibo1(int n){
        if(n==0)    return 0;
        if(n==1)    return 1;
        int[] fib=new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
    //Top Down Memoization
    public int fibo2(int n){
        if(n==0)    return 0;
        if(n==1)    return 1;
        int[] fib=new int[n+1];
        fib[n]=-1;
        if(fib[n]!=-1)
            return fib[n];
        return fib[n]=fibo2(n-1)+fibo2(n-2);

    }
    //O(n) and O(1)
    public int fibo3(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        int prev =0,curr=1,next=0;
        for(int i=2;i<=n;i++){
            next=curr+prev;
            prev=curr;
            curr=next;
        }
        return curr;
    }
    public static void main(String args[]){
        Fibonacci f = new Fibonacci();
        System.out.println("Bottom up approach for 3 is "+f.fibo1(3));
        System.out.println("Top Down approach for 3 is "+f.fibo2(3));
        System.out.println("No array approach for 3 is "+f.fibo3(3));
    }
}
