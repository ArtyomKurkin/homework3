package homework3;
import java.util.Random;
import java.util.Arrays;

public class FourthTask {

    public void exerciseA(){
        int[] arr  = new int[50];
        for (int i=0;i<arr.length;i++){
            arr[i]=i*2+1;
        }
        System.out.println("minToMax: "+ Arrays.toString(arr));

        for (int i=0;i<(arr.length/2);i++){
            int t=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;
        }
        System.out.println("maxToMin: " + Arrays.toString(arr));
    }

    public int[] randGenerate(int size,int minNumber,int maxNumber){
        int[] randArr=new int[size];
        Random rnd = new Random();
        for (int i=0;i<size;i++){
            randArr[i]=rnd.nextInt(maxNumber-minNumber+1)+minNumber;
        }
        return randArr;
    }

    public void exerciseB(){
        int size = 20;
        int[] arr=randGenerate(size,0,10);
        System.out.println(Arrays.toString(arr));
        int counterEven= 0;
        int counterOdd = 0;
        for (int i=0;i<size;i++){
            if (arr[i]%2 == 0)
                counterEven++;
                else counterOdd++;
        }
        System.out.println("Even numbers:"+ counterEven);
        System.out.println("Odd numbers:"+ counterOdd);
    }

    public void exerciseC() {
        int size = 10;
        int[] arr = randGenerate(size,1,100);
        System.out.println("Before: "+Arrays.toString(arr));
        for (int i=0;i<size/2;i++){
            arr[i*2+1]=0;
        }
        System.out.println("After: "+Arrays.toString(arr));
    }

    public void exerciseD(){
        int size = 15;
        int[] arr = randGenerate(size,-50,50);
        System.out.println("Array: " + Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        int indexMax=0;
        int indexMin=0;
        for (int i=0;i<size;i++){
            if (arr[i]>max){
                max=arr[i];
                indexMax=i;
            }
            else if (arr[i]<min){
                min=arr[i];
                indexMin=i;
            }
        }
        System.out.println("Max element = "+max+" with index = " + indexMax);
        System.out.println("Min element = "+min+" with index = " + indexMin);
    }

    public double avgArray(int size, int[] arr){
        int sum=0;
        for (int i=0;i<size;i++){
            sum+=arr[i];
        }
        double avg = (double)sum/size;
        return avg;
    }
    public void exerciseE(){
        int size = 10;
        int[] arr1=randGenerate(size,0,10);
        int[] arr2=randGenerate(size,0,10);

        System.out.println("First: "+Arrays.toString(arr1));
        System.out.println("Second: "+Arrays.toString(arr2));

        double avg1 = avgArray(size,arr1);
        double avg2 = avgArray(size,arr2);
        System.out.println("Average1= "+avg1);
        System.out.println("Average2= "+avg2);

        if (avg1>avg2){
            System.out.println("Average1 is bigger, than average2");
        }
        else if (avg1<avg2){
            System.out.println("Average1 is smaller, than average2");
        }
        else System.out.println("Average1 is equal average2");
    }

    public void exerciseF(){
        int size = 20;
        int[] arr = randGenerate(size,-1,1);
        int[] counter = new int[3];
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<size;i++){
            counter[arr[i]+1]++;
        }

        int top= counter[0];
        int topElement=-1;

        if (counter[1]>top){
            if (counter[1]>counter[2]) {
                top = counter[1];
                topElement = 0;
            }
            else {
                top = counter[2];
                topElement = 1;
            }
        }
        else if (counter[2]>top) {
            top = counter[2];
            topElement = 1;
        }

        System.out.println("The most often element:" + topElement + "(" + top + " times)");
        if (counter[0]==counter[1])
            System.out.println("The same number of -1 and 0: " + counter[0]);

        if (counter[2]==counter[1])
            System.out.println("The same number of 1 and 0: " + counter[1]);

        if (counter[2]==counter[0])
            System.out.println("The same number of -1 and 1: " + counter[0]);
    }


}
