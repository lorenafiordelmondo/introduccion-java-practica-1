package introduccionJava.tt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double radio, area;
        System.out.println("¿Ingrese el radio del circulo?");
        radio = leer.nextInt();
        double pi = 3.14159;
        area = pi * Math.pow(radio, 2);
        System.out.println("El area del ciuculo de radio " + radio + " es: " + area);

    }
}
