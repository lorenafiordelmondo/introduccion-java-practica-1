package introduccionJava.tm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimerosPares {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("¿Cuantos numeros pares descea ver?");
            int c = leer.nextInt();
            int p = 0;
            ArrayList<Integer> numeros = new ArrayList<Integer>();
            while(numeros.size()!=c){
                int r= p%2;
                if(r==0){
                    numeros.add(p);
                }
                p++;
            }
            System.out.println("Los primeros " + c + " numeros pares son");
            numeros.forEach(System.out::println);
    }
}