public class Estructura_condicionales{
  public static void main(String args[]){
    int operacion = 1;
    int var1 = 8;
    int var2 = 4;
    int resultado = 0;

    if(operacion == 1){
      resultado = var1 + var2;
    }else if(operacion == 2){
      resultado = var1 - var2;
    }else if(operacion == 3){
      resultado = var1 * var2;
    }else if(operacion == 4){
      resultado = var1 / var2;
    }

    System.out.println(resultado);
  }
}
