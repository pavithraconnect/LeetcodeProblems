class Solution{
    public boolean isPalindrome(int x) {
        boolean flag=false;
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }
        int result=0;
        while(x>result){
            int temp=x%10;
            result=(result*10)+temp;
            x=x/10;
        }
        if(result==x||result/10==x){
            return true;
        }
        return false;
    }
}