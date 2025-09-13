package ejerciciosunidad1;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];
        int suma = 0;
        System.out.println("Ingrese los 10 numeros");
        for (int i=0; i < numeros.length; i++){
            System.out.print("Ingrese numero" + (i+1) + ":");
            numeros[i] = scanner.nextInt();
            suma = suma + numeros[i];

        }
        double promedio = (double) suma/10;
        System.out.println("El promedio es:" + promedio);
        scanner.close();
    }
}



    

