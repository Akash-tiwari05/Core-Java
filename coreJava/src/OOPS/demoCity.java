package OOPS;

class City2{
    public void m1(){
        System.out.println("Jaipur");
    }
}

class City{

    City2 city2;
//    String cityName;
    public void m1(){
        city2.m1();

    }
//    City(){
//        System.out.println("City const......");
//    }
    City(City2 city2){
        this.city2 = city2;//this keyword use for point instance variable
    }
}


public class demoCity {
    public static void main(String[] args) {
        City2 city2 = new City2();// city ka object call kar raha hu
        City c = new City(city2);
        c.m1();// method call ho Ra ha hai
    }
}
