package Modifiers;

class ModifierPublic{
    public String name = "Akash";
    public void display(){
        System.out.println("Hello "+ name );
    }
}

public class PublicTest {
    public static void main(String[] args) {
        ModifierPublic modifierPublic = new ModifierPublic();

    }

}
