package ejerciciosunidad1;
import java.util.Scanner;

public class Anagrama {

    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Ingrese palabra 1:");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingrese palabra 2:");
        String palabra2 = scanner.nextLine();
        byte palabra1Length= (byte)palabra1.length();
        byte palabra2Length= (byte)palabra2.length();
        boolean resultado = palabra1.equalsIgnoreCase(palabra2);
        if (resultado){
          System.out.println("No ess un anagrama(Las palabras son iguales)");
          return;
        }
        if (palabra1Length != palabra2Length){
          System.out.println("No es un anagrama");
          return;
        }
    }
  }
}