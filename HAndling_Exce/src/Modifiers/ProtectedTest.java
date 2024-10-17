package Modifiers;

class ModifierProtected{
    protected String name = "Akash";
    protected void display(){
        System.out.println("Hello " + name);
    }
}
class ModifierProtectedChild extends ModifierProtected{

}

public class ProtectedTest {

    public static void main(String[] args) {
        ModifierProtectedChild modifierProtectedChild = new ModifierProtectedChild();
        System.out.println(modifierProtectedChild.name);
    }
}
