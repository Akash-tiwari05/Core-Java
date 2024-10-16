package Collection;

import javax.xml.crypto.Data;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(90);
        v.addElement(40);
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        System.out.println(v);
        Enumeration elements = v.elements();
        while(elements.hasMoreElements()){
           Integer data = (Integer)elements.nextElement();
            System.out.print(data + "  ");
        }
        
    }
}
