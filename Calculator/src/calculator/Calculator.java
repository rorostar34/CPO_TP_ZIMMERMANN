/*
 * TP0 partie 3
 * TDC
 * 20/09/2024
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author 33669
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nb;

    int val1;

    int val2;

    int operateur;

    int operande1;

    int operande2;

    System.out.println("Please enter the operator:");

    System.out.println("1) add");

    System.out.println("2) substract");

    System.out.println("3) multiply");

    System.out.println("4) divide");

    System.out.println("5) modulo");

    Scanner sc = new Scanner(System.in);

    System.out.println("\n Entrer le nombre :");

    nb=sc.nextInt();

    operateur=nb;

    System.out.println("\n Entrer la première valeur :");

    val1=sc.nextInt();

    operande1=val1;

    System.out.println("\n Entrer la deuxième valeur :");

    val2=sc.nextInt();

    operande2=val2;

    switch(nb){

        case 1 :

            System.out.println(val1+val2);

            break;

        case 2 :

            System.out.println(val1-val2);

            break;

        case 3 :

            System.out.println(val1*val2);

            break;

        case 4 :

            System.out.println(val1/val2);

            break;

        case 5 :

            System.out.println(val1%val2);

            break;

    }

    }

   

}