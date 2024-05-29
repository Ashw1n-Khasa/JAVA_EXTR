class std{
    int roll;
    String name;
}

public class array{
    public static void main(String args[]){
         

        std obj[]=new std[2];
        obj[0]=new std();
        obj[1]=new std();

        int num=10;

        obj[0].roll=num;
        obj[0].name="ASHWIN";

        obj[1].roll=11;
        obj[1].name="ASHISH";


        for(int i=0;i<obj.length;i++){
            System.out.println(obj[i].roll);
            System.out.println(obj[i].name);
        }

 
        // int num[]= new int[10];
        // num[1]=100;
        // System.out.println(num[9]);
        // System.out.println(num[8]);
        // System.out.println(num[7]);
        // System.out.println
    }
}