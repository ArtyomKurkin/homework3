package homework3;

import java.util.Arrays;
import java.util.Random;

public class FifthTask {

    public int[][] randGenerate2(int rows, int columns,int minNumber,int maxNumber){
        int[][] randArr=new int[rows][columns];
        Random rnd = new Random();
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                randArr[i][j] = rnd.nextInt(maxNumber - minNumber + 1) + minNumber;
            }
        }
        return randArr;
    }
    public void arrOut(int arr[][],int rows,int columns){
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }

    public void exerciseA(){
        int size = 8;

        int sum1=0;
        int sum2=0;
        long mult1=1;
        long mult2=1;
        int[][] arr = randGenerate2(size,size,1,99);
        for (int i=0;i<size;i++){
            sum1+=arr[i][i];
            mult1*=arr[i][i];
            sum2+=arr[i][size-i-1];
            mult2*=arr[i][size-i-1];
        }
        //arrOut(arr,size,size);
        System.out.println("Main diag: Sum = " + sum1 + ", Mult = " + mult1);
        System.out.println("Dop diag: Sum = " + sum2 + ", Mult = " + mult2);
    }

    public void exerciseB(){
        int rows = 8;
        int columns = 5;
        int[][] arr = randGenerate2(rows,columns,-99,99);
        int max=arr[0][0];
        arrOut(arr,rows,columns);
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                if (arr[i][j]>max)
                    max=arr[i][j];
            }
        }
        String index = "";
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                if (arr[i][j]==max)
                    index+="["+i+","+j+"]; ";
            }
        }
        System.out.println("Max element = " + max + " with indexes: " + index);
    }

    public void exerciseC(){
        int rows=8;
        int columns=5;
        int[][] arr = randGenerate2(rows,columns,-10,10);
        arrOut(arr,rows,columns);
        int max = 0;
        int maxIndex=0;
        for (int i=0;i<rows;i++){
            int mult = 1;
            for (int j=0;j<columns;j++){
                mult*=arr[i][j];
            }
            mult=Math.abs(mult);
            if (mult>max){
                max=mult;
                maxIndex=i;
            }
        }

        System.out.println("Row with max multiple elements:" + maxIndex);
    }

    public void exerciseD(){
        int rows=10;
        int columns=7;
        int[][] arr = randGenerate2(rows,columns,0,100);
        arrOut(arr,rows,columns);
        System.out.println("_______________");
        for (int i=0;i<rows;i++){
            Arrays.sort(arr[i]);
            for (int j=0;j<(columns/2);j++){
                int t = arr[i][j];
                arr[i][j]=arr[i][columns-1-j];
                arr[i][columns-1-j]=t;

            }
        }

        arrOut(arr,rows,columns);

    }




}
