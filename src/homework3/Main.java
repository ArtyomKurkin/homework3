package homework3;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        //FIRST TASK
        System.out.println("FIRST TASK:");
        int size=10;
        Random rnd = new Random();

        int[] masEx= new int[size];
        for (int i=0;i<size;i++){
            masEx[i]=rnd.nextInt(100);
        }
        FirstTask ft1=new FirstTask();
        ft1.getTime("BubbleSort ",masEx,FirstTask::bubbleSort);
        ft1.getTime("SelectSort ",masEx,FirstTask::selectSort);
        ft1.getTime("ArraySort ",masEx,Arrays::sort);

        System.out.println("__________________________");
        //SECOND TASK
        System.out.println("SECOND TASK:");
        SecondTask st1 = new SecondTask();
        int number = 10;

        long startTime = System.nanoTime();
        System.out.println("Factorial of "+number+" calculated by loops: " +st1.factLoop(number));
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time by loops:"+estimatedTime);

        startTime = System.nanoTime();
        System.out.println("Factorial of "+number+" calculated by recursion: " +st1.factRec(number));
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time by recursion:"+estimatedTime);

        System.out.println("__________________________");
        //THIRD TASK
        System.out.println("THIRD TASK:");
        ThirdTask tt1=new ThirdTask();

        System.out.println("Rectangle");
        tt1.buildRect(5,6);

        System.out.println("Figure B");
        tt1.buildB(8);

        System.out.println("Figure C");
        tt1.buildC(8);

        System.out.println("__________________________");
        //FOURTH TASK
        System.out.println("FOURTH TASK:");
        FourthTask fourT=new FourthTask();

        System.out.println("Exercise A:");
        fourT.exerciseA();

        System.out.println("Exercise B:");
        fourT.exerciseB();

        System.out.println("Exercise C:");
        fourT.exerciseC();

        System.out.println("Exercise D:");
        fourT.exerciseD();

        System.out.println("Exercise E:");
        fourT.exerciseE();

        System.out.println("Exercise F:");
        fourT.exerciseF();

        System.out.println("__________________________");
        //FIFTH TASK
        System.out.println("FIFTH TASK:");
        FifthTask fiveT= new FifthTask();

        System.out.println("Exercise A:");
        fiveT.exerciseA();

        System.out.println("Exercise B:");
        fiveT.exerciseB();

        System.out.println("Exercise C:");
        fiveT.exerciseC();

        System.out.println("Exercise D:");
        fiveT.exerciseD();

        System.out.println("__________________________");
        //SIXTH TASK
        System.out.println("SIXTH TASK:");
        SixthTask sixTask=new SixthTask();
        System.out.println("First Exercise:");
        sixTask.timeSwitch();
        sixTask.timeElseIf();
        System.out.println("Second Exercise:");
        int[] arr = fourT.randGenerate(50,0,10);
        sixTask.timeArraySwitch(arr);







    }
}
