package introduccionJava.tt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bienvenida {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String c = leer.nextLine();
        System.out.println("Bienvenida/o " + c +"!!");

    }
}
