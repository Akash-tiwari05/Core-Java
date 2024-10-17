package Exception;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("im in a catch");
            e.printStackTrace();
        }finally { //cleanup code
            System.out.println("Best Class in the world");
        }
    }
}
