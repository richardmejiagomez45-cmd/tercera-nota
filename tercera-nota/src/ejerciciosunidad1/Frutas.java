package ejerciciosunidad1;

import java.util.Scanner;

public class Frutas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 frutas: ");
        String lista = "";
        for (int i = 1; i <= 5; i++) {
            System.out.print("Fruta " + i + ":");
            String fruit = scanner.nextLine();
            lista = lista + i + "." + fruit + "\n" ;
        }
        System.out.println("Listas de frutas ingesadas:\n" + lista);
        scanner.close();
    }
}
