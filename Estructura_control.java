import java.util.Scanner;

public class Estructura_control{
  public static void main(String args[]){

    float num_uno = 5, num_dos = 3, resultado = 0;
    Scanner teclado = new Scanner(System.in);
    int parametro = 0;

    System.out.println("Que caso quiere?");
    parametro = teclado.nextInt();


    switch(parametro){
      case 1: resultado = num_uno + num_dos;
              System.out.println("el reusultado es: " + resultado);
              break;
      case 2: resultado = num_uno - num_dos;
              System.out.println("el reusultado es: " + resultado);
              break;
      case 3: resultado = num_uno * num_dos;
              System.out.println("el reusultado es: " + resultado);
              break;
      case 4: resultado = num_uno / num_dos;
              System.out.println("el reusultado es: " + resultado);
              break;
      default: System.out.println("Error, no existe la opcion");
              break;
    }
  }
}
