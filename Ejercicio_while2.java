public class Ejercicio_while2{
  public static void main(String args[]){

    int i = 1;
    System.out.print(i+", ");
    int e =99;
    System.out.print(e);

    do{
      System.out.print(", ");
      i++;
      System.out.print(i+", ");
      e = e-1;
      System.out.print(e);
    }while(i<=4);
  }
}
