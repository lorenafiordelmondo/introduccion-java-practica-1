package introduccionJava.tm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class NumeroNaturales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantos numeros descea ver?");
        int n = leer.nextInt();

        System.out.println("¿Cual es el digitos que quieres tener?");
        int d = leer.nextInt();

        System.out.println("¿Cuantas veces debe estar el digito " +d +  " ?");
        int m = leer.nextInt();
        int p = 0;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        while(numeros.size()!=n){
            p++;
            if(numberFulfilled(m, d, p)){
                numeros.add(p);
            }
        }
        Collections.sort(numeros);
        numeros.forEach(System.out::println);

    }

    public static boolean numberFulfilled(int m, int d, int p){
        int count =0;
        boolean resp = false;
        char [] nString = String.valueOf(p).toCharArray();
        for(char chart: nString){
            if(chart == String.valueOf(d).charAt(0)){
                 count++;
                 if(count >= m){
                     resp =true;
                 }
            }
        }
        return resp;
    }
}
