package ejerciciosunidad1;

public class NumerosPares {
  public static void main(String[] args) {
    int contador = 0;
    for (int i = 1; i <= 100; i++) {
        if(i % 2 == 0) {
            contador++;
        }
    }
    System.out.println("Hay: " + contador + " numeros primos del 1 al 100");
  }  
}
