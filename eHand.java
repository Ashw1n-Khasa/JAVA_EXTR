public class eHand{
    public static void main(String[] args) {
        try{
            String str = null;
            str.length(); 
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        try{
            int[] arr = new int[5];
            arr[5] = 10;
        }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            int a = 10;
            int b = 0;
            int c = a / b; 

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            Thread t = new Thread();
            t.setPriority(11); 

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String str = "hello";
            char c = str.charAt(5); 
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            int size = -5;
            int[] arr = new int[size]; 
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            Object x = new Integer(0);
            String s = (String)x; 
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String str = null;
            str.length();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            Object obj = new Object();
            obj.notify();
        }catch(Exception e){
            System.out.println(e);
        }

        try {
            Thread thread = new Thread();
            thread.start();
            thread.start();
        } catch (Exception e) {
            System.out.println(e);
        }




        


    }
}