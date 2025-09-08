package ejerciciosunidad1;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero:");
        int number = scanner.nextInt();
        for(int i=1; i<=10; i++){
            int result = number * i;
            System.out.println(number + "x" + i + "=" + result);
        }
        scanner.close();
    }
}