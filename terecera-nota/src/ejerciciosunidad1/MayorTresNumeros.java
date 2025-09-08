package ejerciciosunidad1;
import java.util.Scanner;
public class MayorTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese  numero 1:");
        int number1 = scanner.nextInt();
        System.out.print("ingrese  numero 2:");
        int number2 = scanner.nextInt();
        System.out.print("ingrese  numero 3:");
        int number3 = scanner.nextInt();
        if (number1 > number2 && number1 > number2) {
            System.out.println("El numero: " + number1 + "," + "es mayor");
        }else if (number2 > number1 && number2 > number1){
                System.out.println("El numero: " + number2 + "," + "es mayor");
            }else{
                System.out.println("El numero: " + number3 + "," + "es mayor");
            }
            scanner.close();



    }
}