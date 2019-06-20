import java.util.*;

class HashFunction{
    String[] hashArray;
    int hashSize;
    public HashFunction(int hashSize){
        this.hashSize=hashSize;
        hashArray = new String[hashSize];
        Arrays.fill(hashArray,"-1");
    }
    public void hashFunction1(String[] inputArray, String[] hashArray){
        for(int i=0;i<inputArray.length;i++){
            String value=inputArray[i];
            hashArray[Integer.parseInt(value)]=value;
        }
    }
    public static void main(String args[]){
        HashFunction object=new HashFunction(30);
        String [] array={"1","5","7","21","29"};
        object.hashFunction1(array,object.hashArray);
    }
}

