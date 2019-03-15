package homework3;

import java.sql.SQLOutput;

import static homework3.Tasks.*;

public class SixthTask {
    long startTime;
    long estimatedTime;
    public void timeSwitch(){
        Tasks task = Tasks.Task4;
        startTime=System.nanoTime();
        switch(task){
            case Task1:
                System.out.println("I have done the first task succesfully");
                break;
            case Task2:
                System.out.println("I have done the second task succesfully");
                break;
            case Task3:
                System.out.println("I have done the third task succesfully");
                break;
            case Task4:
                System.out.println("I have done the fourth task succesfully");
                break;
            case Task5:
                System.out.println("I have done the fifth task succesfully");
                break;
        }
        estimatedTime =System.nanoTime()-startTime;
        System.out.println("Time of switch:"+estimatedTime);
    }

    public void timeElseIf(){
        Tasks task = Tasks.Task4;
        startTime=System.nanoTime();

        if (task==Task1)
            System.out.println("I have done the first task succesfully");
        else if (task==Task2)
            System.out.println("I have done the second task succesfully");
            else if (task == Task3)
                System.out.println("I have done the third task succesfully");
                else if (task == Task4)
                    System.out.println("I have done the fourth task succesfully");
                    else if (task == Task5)
                        System.out.println("I have done the fifth task succesfully");

        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time of else-if:"+estimatedTime);

        }

        public void timeArraySwitch(int[] arr){
        int[] arrCounter = new int[11];
        long startTime = System.nanoTime();
        for (int i=0;i<arr.length;i++){
            int k=arr[i];
            switch (k){
                case(0):
                    arrCounter[k]++;
                    break;
                case(1):
                    arrCounter[k]++;
                    break;
                case(2):
                    arrCounter[k]++;
                    break;
                case(3):
                    arrCounter[k]++;
                    break;
                case(4):
                    arrCounter[k]++;
                    break;
                case(5):
                    arrCounter[k]++;
                    break;
                case(6):
                    arrCounter[k]++;
                    break;
                case(7):
                    arrCounter[k]++;
                    break;
                case(8):
                    arrCounter[k]++;
                    break;
                case(9):
                    arrCounter[k]++;
                    break;
                case(10):
                    arrCounter[k]++;
                    break;
            }
        }
        for (int i=0;i<11;i++){
            System.out.println(i+": "+arrCounter[i]+ " times");
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time of switch:" + estimatedTime);
        }


        public void timeArrayElseIf(int[] arr){
            int[] counter = new int[11];
            long startTime = System.nanoTime();
            for (int i=0;i<arr.length;i++){
                if (arr[i] == 0)
                    counter[arr[i]]++;
                else if (arr[i] == 1)
                    counter[arr[i]]++;
                else if (arr[i] == 2)
                    counter[arr[i]]++;
                else if (arr[i] == 3)
                    counter[arr[i]]++;
                else if (arr[i] == 4)
                    counter[arr[i]]++;
                else if (arr[i] == 5)
                    counter[arr[i]]++;
                else if (arr[i] == 6)
                    counter[arr[i]]++;
                else if (arr[i] == 7)
                    counter[arr[i]]++;
                else if (arr[i] == 8)
                    counter[arr[i]]++;
                else if (arr[i] == 9)
                    counter[arr[i]]++;
                else if (arr[i] == 10)
                    counter[arr[i]]++;
            }

            for (int i=0;i<11;i++){
                System.out.println(i+": "+counter[i]+ " times");
            }
            estimatedTime = System.nanoTime() - startTime;
            System.out.println("Time of else-if:" + estimatedTime);

        }

    }

