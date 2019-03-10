package homework3;

public class ThirdTask {

    public void buildRect(int rows, int columns){
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public void buildA(int size){
        int counter=0;
        while (counter<size){
                counter+=1;
                for (int j=0;j<counter;j++){
                    System.out.print("#");
                }
                System.out.println(" ");
        }
    }

    public void buildB(int size){
        int counter=size+1;
        while (counter>0){
            counter-=1;
            for (int j=0;j<counter;j++){
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }

    public void buildC(int size){
        int counter=-1;
        while (counter<size){
            counter+=1;
            for (int j=0;j<counter;j++){
                System.out.print(" ");
            }
            for (int k=0;k<(size-counter);k++){
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }


}
