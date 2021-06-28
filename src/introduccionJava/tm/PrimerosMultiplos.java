package introduccionJava.tm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimerosMultiplos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int m = leer.nextInt();
        System.out.println("¿Cuantos multiplos de "+ m +"  descea ver?");
        int c = leer.nextInt();
        int p = 0;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        while(numeros.size()!=c){
            p++;
            int r= m*p;
            numeros.add(r);
        }
        System.out.println("Los primeros " + c + " multiplos de " + m + " son:" );
        numeros.forEach(System.out::println);

    }
}
