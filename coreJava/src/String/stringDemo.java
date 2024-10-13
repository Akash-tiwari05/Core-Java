package String;

public class stringDemo {
    public static void main(String[] args) {
        String city = new String("Agra");
        String city2 = new String("Delhi");
        String city3 = city;
        String city4 = new String("Delhi");
        String city5 = "Agra";
        String city6 = "Agra";
        System.out.println(city2 == city);// take reference memory variable
        System.out.println(city3 == city);
        System.out.println(city4 == city2);// check reference
        System.out.println(city5 == city);
        System.out.println(city5 == city6);
        System.out.println(city.equals(city5));// compare string element
    }
}
