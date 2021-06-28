package introduccionJava.tm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int c = leer.nextInt();
        int contador,I;

        contador = 0;
        for(I = 1; I <= c; I++)
        {
            if((c % I) == 0)
            {
                contador++;
            }
        }
        if(contador <= 2)
        {
            System.out.println("El numero "+c+" es primo");
        }else{
            System.out.println("El numero "+c+" no es primo");
        }
    }
}
