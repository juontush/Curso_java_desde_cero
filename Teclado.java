import java.util.Scanner;

public class Teclado{
  public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    String nombre = "";
    int num1 = 0, num2 = 0, resultado = 0;

    System.out.println("cual es tu nombre?");
    nombre = teclado.nextLine();

    System.out.println("primer valor de la suma");
    num1 = teclado.nextInt();

    System.out.println("segundo valor de suma");
    num2 = teclado.nextInt();

    resultado = num1 + num2;

    System.out.println("hola " + nombre + " su resultado es: " + resultado);
  }
}
