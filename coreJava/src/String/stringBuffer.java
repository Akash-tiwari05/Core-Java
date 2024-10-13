package String;

import org.w3c.dom.ls.LSOutput;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Akash");
        str.append(" Tiwari");// uses to concat
        System.out.println(str);

        //String Builder
        StringBuilder sb = new StringBuilder("Akash Tiwari");
        StringBuilder so = sb.append("Cse Studend");
        System.out.println(so == sb);
    }

}
