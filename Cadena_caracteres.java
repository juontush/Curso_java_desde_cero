import java.util.Scanner;

public class Cadena_caracteres{
  public static void main(String args[]){

    String nombre1 =  "", nombre2 = "";
    Scanner teclado = new Scanner(System.in);

    System.out.println("escriba el primer nombre");
    nombre1 = teclado.nextLine();
    System.out.println("escriba el segundo nombre");
    nombre2 = teclado.nextLine();

    if(nombre1.equals(nombre2)){
      System.out.println("los nombres son iguales");
    }else{
      System.out.println("los nombres son diferentes");
    }
  }
}
