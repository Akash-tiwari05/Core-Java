class Animal{
    String name;//animal
}
class Dog extends Animal{
    String name;//jipsy

    void print(){
        //this rep current obj
        //super rep parent class
        super.name = "Animal";
        this.name = "Jipsy";
        System.out.println("Parent name = "+ super.name);
        System.out.println("Dog name is = "+ this.name);
    }
}


public class thisDemo {
    public static void main(String[] args) {
        Dog naam = new Dog();
        naam.print();
    }
}
