package Modifiers;

class ModifierDefault{
    String name = "Akash";
    void Display(){
        System.out.println("hello " + name);
    }
}

class PrivateModifier{
    private String name1 = "Akash";
    private void display(){
        System.out.println("Hello "+ name1);
    }
}

public class Test {
    public static void main(String[] args) {
        ModifierDefault modifierDefault = new ModifierDefault();
        modifierDefault.Display();
        PrivateModifier privateModifier = new PrivateModifier();     
    }

}