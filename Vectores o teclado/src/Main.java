import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] vectores = new int[6];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vectores.length; i++) {
            System.out.println("ingrese el valor para " + i);
            vectores[i] = teclado.nextInt();

        }


        for (int i = 0; i < vectores.length; i++) {
            System.out.println("en el indice " + i);
            System.out.println("tengo guardaddo " + vectores[i]);
            System.out.println("...............");
        }


        String [] vectores2 = new String [3];
        Scanner teclado2 = new Scanner( System.in);
        for (int i = 0; i < vectores2.length; i++) {
            System.out.println("dime la palabra que quieres guardar " + i);
            vectores2 [i] = teclado2.next();

        }

        for (int i = 0; i < vectores2.length; i++) {
            System.out.println("en el indice " + i);
            System.out.println("tengo guardaddo " + vectores2[i]);
            System.out.println("...............");
        }


        }
    }
