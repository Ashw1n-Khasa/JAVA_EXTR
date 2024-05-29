import java.util.*;

class threading implements Runnable{
    public void run(){
        System.out.println("Thread "+Thread.currentThread().getName()+" is running ...");
    }
}

public class multi_thrd{
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter number of thread to run :- ");
        int n=scn.nextInt();

        for(int i=1;i<=n;i++){
            threading obj=new threading();
            String str="";
            str+=i;
            Thread t1=new Thread(obj,str);
            t1.start();
        }
    }
}

