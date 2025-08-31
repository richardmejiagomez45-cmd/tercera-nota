package ejerciciosunidad1.EntradaySalida;
import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
      System.out.print ("ingrese numero 1:");
      double number1 = scanner.nextDouble();
      System.out.print("Ingrese numero 2:");
     double number2 = scanner.nextDouble();
      System.out.print("Ingrese numero 3:");
      double number3 = scanner.nextDouble();
      double decimalresult = (number1 + number2 + number3)/3;
      System.out.println("la media de los tres numeros es:" + decimalresult);
      scanner.close();
    }
}
