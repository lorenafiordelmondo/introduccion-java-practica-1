package introduccionJava.tm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimerosPrimos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantos numeros primos descea ver?");
        int c = leer.nextInt();
        int p = 0;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        while(numeros.size()!=c){
            int contador, I;
            contador = 0;
            p++;
            for (I = 1; I <= p; I++) {
                if ((p % I) == 0) {
                    contador++;
                }
            }
            if (contador <= 2) {
                numeros.add(p);
            }
        }
        System.out.println("Los primeros " + c+ " numeros primos son");
        numeros.forEach(System.out::println);
    }
}
