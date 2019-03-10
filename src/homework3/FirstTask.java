package homework3;

import java.util.function.Consumer;

public class FirstTask {


    public void getTime(String method, int arr[], Consumer<int[]> f){
        String result;
        int arr2[] = arr.clone();
        long startTime = System.nanoTime();
        f.accept(arr2);
        long estimatedTime = System.nanoTime()-startTime;
        result=method +"time: " + estimatedTime;
        System.out.println(result);

    }

    public static void bubbleSort(int arr[]){
        int n= arr.length;
        int t;
        for (int i=1;i<n;i++){
            for (int j=1;j<n;j++){
                if (arr[j-1]>arr[j]){
                        t=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=t;
                }
            }
        }
    }

    public static void selectSort(int arr[]){
        int n = arr.length;

        for (int i=0;i<(n-1);i++){
            int checkIndex = i;
            for (int j=(i+1);j<n;j++){
                if (arr[j]<arr[checkIndex]){
                    checkIndex=j;
                }
            }
            int t = arr[checkIndex];
            arr[checkIndex]=arr[i];
            arr[i]=t;
        }
    }

}
