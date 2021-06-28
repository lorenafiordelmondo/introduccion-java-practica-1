package introduccionJava.tt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int n = leer.nextInt();
        int r = n % 2;
        if (r == 0) {
            System.out.println(n + " Es divisible por 2 ");
        } else {
            System.out.println(n + " No es divisible por 2 ");
        }
    }
}
