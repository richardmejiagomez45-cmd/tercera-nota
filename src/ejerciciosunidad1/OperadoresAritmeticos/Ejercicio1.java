package ejerciciosunidad1.OperadoresAritmeticos;
public class Ejercicio1{
  public static void main(String[] args) {
       int tshirt = 25;
       int pants =  30;
       int discount = 15;
       System.out.println("Precio camisa: " + tshirt + "$, " + "Precio pantalon: " + pants + "$");
       System.out.println("Descuento sobre el precio original: " + discount + "%");
       double result1 = (tshirt * 0.85) + (pants * 0.85);
       System.out.println("Precio total de ambas prendas despues del descuento: " + result1 + "$");
       double result2 = (tshirt * 0.85) * 0.95;
      System.out.printf("Precio de la segunda camisa con un descuento extra del 5%% es: %.2f$", result2);



    }
}