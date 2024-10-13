package OOPS;

class superDad {
    public void plot(){
        System.out.println("2000 gaj ka plot");
    }

}
class Dad extends superDad{


}
class Akash extends Dad{// inhe ritance using extends

}
public class Test{
    public static void main(String[] args) {
        Akash akash=new Akash();
        akash.plot();
    }

}

