import java.util.Scanner;

public class Condiciones_compuestas{
  public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    String nombre = "";
    int clave = 0, antiguedad = 0, vacaciones = 0;

    System.out.println("");
    System.out.println("");
    System.out.println("**********************************************************");
    System.out.println("*Bienvenido al sistema de vacaciones de coca-cola company*");
    System.out.println("**********************************************************");
    System.out.println("");
    System.out.println("");

    System.out.println("cual es el nombre del trabajador?");
    nombre = teclado.nextLine();
    System.out.println("");
    System.out.println("cual es el departamento?");
    clave = teclado.nextInt();
    System.out.println("");
    System.out.println("cual es la antiguedad de trabajador?");
    antiguedad = teclado.nextInt();

    if(clave ==1){
      if(antiguedad ==1){
        vacaciones = 6;
      }else if (antiguedad >=2 && antiguedad <=6) {
        vacaciones = 14;
      }else if (antiguedad >=7) {
        vacaciones = 20;
      }
    }else if (clave ==2) {
      if (antiguedad ==1) {
        vacaciones = 7;
      }else if (antiguedad >=2 && antiguedad <=6) {
        vacaciones = 15;
      }else if (antiguedad >=7) {
        vacaciones = 22;
      }
    }else if (clave == 3) {
      if (antiguedad ==1) {
        vacaciones = 10;
      }else if (antiguedad >=2 && antiguedad <=6) {
        vacaciones = 20;
      }else if (antiguedad >=7) {
        vacaciones = 30;
      }
    }

    System.out.println("El trabajador " + nombre + " tendra: " + vacaciones + " dias de vacaciones");
  }
}
