package homework3;

public class SecondTask {

    public int factLoop(int size){
        int result=1;
        for (int i=1;i<size+1;i++){
            result*=i;
        }
        return result;
    }
    public int factRec(int size){
        if(size<=1){
            return 1;
        }
        else return size*factRec(size-1);
    }
}
