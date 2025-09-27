package ejerciciosunidad1;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int result = 0;
       int operacion = 0;
        do {
            System.out.println("Operaciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir del progama");
            System.out.print("Ingrese el numero de la operacion que quiere realizar:");
            operacion = scanner.nextInt();
           
            switch (operacion){
                case 1: 
                System.out.print("Ingrese cuantos numeros desea utilizar:");
                int number = scanner.nextInt();
                for (int i = 1; i<=number; i++){
                   System.out.print("Escriba numero " + i + ":");
                    int number1 = scanner.nextInt();
                    result = result + number1; 
                }
                System.out.println("El resultado de la suma es:" + result);
                break;

                case 2: 
                
                System.out.print("Ingrese cuantos numeros desea utilizar:");
                number = scanner.nextInt();
                for (int i = 1; i<=number; i++){
                    System.out.print("Escriba numero " + i + ":");
                    int number1 = scanner.nextInt();
                     if (i==1){
                        result = number1;
                    }else {
                        result = result - number1; 
                    }

                }
                System.out.println("El resultado de la resta es:" + result);
                break;

                case 3: 
                System.out.print("Ingrese cuantos numeros desea utilizar:");
                number = scanner.nextInt();
                for (int i = 1; i<=number; i++){
                    System.out.print("Escriba numero " + i + ":");
                    int number1 = scanner.nextInt();
                    if(i==1){
                        result = number1;
                    }else {
                    result = result * number1;}
                }
                System.out.println("El resultado de la multiplicacion es:" + result);
                break;

                case 4: 
                System.out.print("Ingrese cuantos numeros desea utilizar:");
                number = scanner.nextInt();
                double division = 0;
                for (int i = 1; i<=number; i++){
                    System.out.print("Escriba numero " + i + ":");
                    double number1 = scanner.nextDouble();
                   if(i==1){
                        division = number1;
                    }else {
                    division = division/number1;}

                }
                   System.out.println( "El resultado de la division es:"  + division);
                break;
                case 5:
                System.out.println("Saliendo");
                break;
                default: 
                    System.out.println("Ingresa un valor valido por favor");
                    break;

            }
           
        }
        while (operacion != 5);
        scanner.close();
    }
}


