public class Ejercicio_while3{
  public static void main(String args[]){

    int p = 1;
    int i = 1;
    int k = 0;
    System.out.print(k);

    while(p<=34){
      k=i;
      i=p;
      System.out.print(", ");
      System.out.print(i);
      p = p+k;
    }

    //como esta en el curso
    int a = 0, b = 1, c = 0;
    for(int l=0; i<10; l++){
      System.out.print(a+", ");
      c = a+b;
      a=b;
      b=c;
    }
  }
}
