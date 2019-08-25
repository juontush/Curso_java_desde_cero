public class Condicional{
  public static void main(String args[]){
    int math = 5;
    int biology = 8;
    int quimica = 0;
    int promedio = 0;

    promedio = (math + biology + quimica)/3;

    if(promedio >= 6){
      System.out.println("aprobado. su promedio fue: " + promedio);
    } else{
      System.out.println("mk perdio esa vuelta, mira eso: " + promedio);
    }
  }
}
